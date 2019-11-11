package com.collabera.jdbcdemo.dao;

import java.sql.Statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.collabera.jdbcdemo.model.City;

import java.util.*;

public class CityDao {
	private static final Logger logger =
		Logger.getLogger(CityDao.class.getName()); // log 4J
	//private static final CountryDao countryDao;
	private static HashMap<Integer, City> cache = new HashMap();
	
	/** retrieve a city by its id 
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws FileNotFoundException */
	public City findById( Integer id ) throws FileNotFoundException, SQLException, IOException {
		if ( cache.containsKey(id)) return cache.get(id);
		List<City> list = find("WHERE id = " + id);
		return list.get(0);
	}
	
	/** retrieve a city by name 
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws FileNotFoundException */
	public List<City> findByName( String name ) throws FileNotFoundException, SQLException, IOException{
		//name = sanitize(name);
		List<City> list = find("WHERE name = '" + name + "'");
		return list;
	}
	
	/** find cities using a general query, use a
	 * WHERE ..., HAVING ..., or other selection clause 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws FileNotFoundException */
	public List<City> find(String query) throws SQLException, FileNotFoundException, IOException{
		//Get database properties
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc.properties"));
        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String dburl = props.getProperty("dburl");
		
		List<City> list = new ArrayList<City>();
		Statement stmt = DriverManager
				.getConnection(dburl, user, password)
				.createStatement();
		String sqlquery = "SELECT * FROM city c " + query;
		try {
			logger.debug("executing query: " + sqlquery);
			ResultSet rs = stmt.executeQuery(sqlquery);
			while(rs.next()) {
				City c = resultSetToCity(rs);
				list.add(c);
			}
		} catch (SQLException sqle) {
			logger.error("error executinig: " + sqlquery, sqle);
		} finally {
			if (stmt!=null) {
				try { stmt.close();}
				catch(SQLException e) { /* ignore it */ }
				return list;
			}
		}
		return list;
		
	}
	
	private City resultSetToCity(ResultSet rs) throws SQLException {
		City city = null;
		
		Integer id = rs.getInt("id");
		//Is this city already in cache? If so, use it
		if(cache.containsKey(id)) city = cache.get(id);
		else city = new City();
		
		city.setId(id);
		city.setName(rs.getString("Name"));
		city.setDistrict(rs.getString("District"));
		city.setPopulation(rs.getInt("Population"));
		String countrycode = rs.getString("countrycode");
		
		//add this city to the cache
		if(!cache.containsKey(id)) cache.put(id, city);
		
		//now get reference to the country this city refers
		logger.info("get country for city " + city.getName());
		//Country country = countryDao.findById(countrycode);
		//city.setCountry(country);
		
		return city;
	}
}
