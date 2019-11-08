package com.collabera.jdbcdemo.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

public class CountryDao {
	private static final Logger logger =
		Logger.getLogger(CountryDao.class.getName()); // log 4J
	//private static final CountryDao countryDao;
	private static HashMap<String, Country> cache = new HashMap();
	
	public Country findByCode( String code ) throws FileNotFoundException, SQLException, IOException {
		if ( cache.containsKey(code)) return cache.get(code);
		List<Country> list = find("WHERE code = " + code);
		return list.get(0);
	}
	
	public List<Country> findByName( String name ) throws FileNotFoundException, SQLException, IOException{
		//name = sanitize(name);
		List<Country> list = find("WHERE name = '" + name + "'");
		return list;
	}
	
	public List<Country> find(String query) throws SQLException, FileNotFoundException, IOException{
		//Get database properties
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc.properties"));
        
        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String dburl = props.getProperty("dburl");
		
		List<Country> list = new ArrayList<Country>();
		
		PreparedStatement pstmt = DriverManager.getConnection(dburl, user, password)
				.prepareStatement("SELECT * FROM Country where name = ?");
			pstmt.setString(1, "Thailand");
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Country c = resultSetToCountry(rs);
				list.add(c);
			}
		} catch (SQLException sqle) {
			logger.error("error executinig: " + sqle);
		} finally {
			if (pstmt!=null) {
				try { 
					pstmt.close();
				
				} catch (SQLException e) { /*ignore it*/ }
			}
			
		}
		return list;
		
	}
	
	public boolean delete(String code) throws SQLException {
		if(code==null)return false;
		PreparedStatement statement = JdbcUtils.getConnection()
				.prepareStatement("DELETE FROM Country where code = ?");
		
		statement.setString(1, code);
		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.error("error executing delete for code: " + code);
		} finally {
			statement.close();
		}
		
		return count > 0;
	}
	
	public boolean insert(Country country) throws SQLException {
		PreparedStatement statement = JdbcUtils.getConnection()
				.prepareStatement("INSERT INTO country(code, name, continent, region) VALUES(?,?,?,?)");
		
		statement.setString(1, country.getCode());
		statement.setString(2, country.getName());
		statement.setString(3, country.getContinent());
		statement.setString(4, country.getRegion());
		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.error("error executing insert for country: " + country);
		} finally {
			statement.close();
		}
		
		return count > 0;
	}
	
	private Country resultSetToCountry(ResultSet rs) throws SQLException {
		Country country = null;
		
		String code = rs.getString("code");
		//Is this Country already in cache? If so, use it
		if(cache.containsKey(code)) country = cache.get(code);
		else country = new Country();
		
		country.setCode(rs.getString("Code"));
		country.setName(rs.getString("Name"));
		country.setContinent(rs.getString("Continent"));
		country.setRegion(rs.getString("Region"));
		country.setPopulation(rs.getInt("Population"));
		
		//add this Country to the cache
		if(!cache.containsKey(code)) cache.put(code, country);
		
		//now get reference to the continent this Country refers
		logger.info("get continent for Country " + country.getName());
		
		return country;
	}
}
