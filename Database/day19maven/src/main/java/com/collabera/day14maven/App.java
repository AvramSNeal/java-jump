package com.collabera.day14maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.jdbcdemo.model.City;
import com.collabera.jdbcdemo.model.CityDao;
import com.collabera.jdbcdemo.model.Country;
import com.collabera.jdbcdemo.model.CountryDao;

import jdk.internal.org.jline.utils.Log;

import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
	static Logger Log = Logger.getLogger(App.class.getName());
    public static void main( String[] args ) throws IOException
    {
    	/*
    	Log.debug("Hello World");
    	Log.info("JDBC test app started...");
    	
    	//Get database properties
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc.properties"));
        
        
        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String dburl = props.getProperty("dburl");
    	
    	//Connect to database
        Connection conn = null;
        try {
        	//log.debug("getting mysql connection ...");
        	conn = (Connection) DriverManager.getConnection(dburl, user, password);
        	if(conn!=null) {
        		//log.debug("mysql connection successfully aquired!");
        	}
        	String sql = "select * from city";
        	PreparedStatement stmt = conn.prepareStatement(sql);
        	ResultSet rs = stmt.executeQuery();
        	while(rs.next()) {
				Log.debug(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			rs.close();
			conn.close();
        	
        	
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
        */
        
    	/*
        //test CityDao
        Log.info("Testing CityDao ... ");
        
        CityDao cityDao = new CityDao();
        try {
        	List<City> cities = cityDao.findByName("Miami");
        	if(cities.size()>0) {
        		Log.info(cities.get(0));
        	}
        } catch (Exception e) {
        	Log.error(e.getMessage());
        }
        */
    	
    	//test CountryDao
    	Log.info("Testing CountryDao ...");
    	
    	CountryDao countryDao = new CountryDao();
    	try {
    		List<Country> countries = countryDao.findByName("Congo");
    		if(countries.size()>0) {
    			Log.info(countries.get(0));
    		}
    	} catch (Exception e) {
    		Log.error(e.getMessage());
    	}
    	
    	try {
    		Country country = new Country("AAA", "DDD", "Asia", "WWW");
    		boolean success = countryDao.insert(country);
    		if(success) {
    			Log.info("SUCCESS: INSERT country: " + country);
    		}
    	} catch (Exception x) {
    		Log.error(x.getMessage());
    	}
    	
    	/*
    	try {
    		String code = "XYZ";
    		boolean count = countryDao.delete(code);
    		Log.info("SUCCESS: Delete country: " + code);
    	} catch (Exception x) {
    		
    	}
    	*/
        
        
        
        
    }
}
