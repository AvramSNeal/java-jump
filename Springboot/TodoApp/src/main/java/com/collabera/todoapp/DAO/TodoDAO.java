package com.collabera.todoapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.collabera.todoapp.model.Todo;

@Component
public class TodoDAO {
	
	String connectionString="jdbc:mysql://localhost:3306/TodoJDBC";
	String username="root";
	String password="root";

	// crud
	
	public Todo insertTodo(int id, String desc, String user, Date targetDate, boolean status) throws SQLException {
		Connection myConn=null;
		PreparedStatement myStmt=null;
		ResultSet myRs=null;
		
		try {
			// 1 open the connection
			
			myConn = DriverManager.getConnection(connectionString, username, password);
			
			// 2 prepare sql statement
					// 1. Statement 
						// insert into todo('Columun names') values ('')
			
					// 2. Prepare statements
			myStmt=  myConn.prepareStatement("insert into todo(id,user,desc,targetDate,status)"
					+ "values(?,?,?,?,?)");
			myStmt.setInt(1, id);
			myStmt.setString(2, user);
			myStmt.setString(3, desc);
			myStmt.setDate(4, (java.sql.Date)targetDate);
			myStmt.setBoolean(5, status);
					// 3. callable statements
						// stored procedures
			
			// 3 execute
			
			int result = myStmt.executeUpdate();
			
			// 4 process
			
			if(result > 0)
				return new Todo(id,user,desc,targetDate,status);
			
			// 5 close connection
			return null;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(myStmt!=null)
				myStmt.close();
			if(myConn!= null)
				myConn.close();
		}
		return null;
	}
	
}
