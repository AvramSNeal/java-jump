package com.collabera.day14maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	static Logger Log = Logger.getLogger(App.class.getName());
    public static void main( String[] args ) throws IOException
    {
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
    }
}
