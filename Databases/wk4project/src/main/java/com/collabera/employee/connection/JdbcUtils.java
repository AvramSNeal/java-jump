package com.collabera.employee.connection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
	public static Connection getConnection() {
		Connection con=null;
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
		} catch (FileNotFoundException el) {
			el.printStackTrace();
		} catch (IOException el) {
			el.printStackTrace();
		}
		String user = props.getProperty("user");
        String password = props.getProperty("password");
        String dburl = props.getProperty("dburl");
        
        try {
        	con= DriverManager.getConnection(dburl, user, password);
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return con;
	}
}
