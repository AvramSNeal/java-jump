package com.collabera.day14maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTestApp {

	public static void main(String[] args) {
		// connect to database
		Connection conn = null;
		try {
			conn = (Connection)	DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			if(conn!=null) {
				System.out.println("mysql connection succesfully aquired!");
			}
			String sql = "select * from city";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			rs.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
