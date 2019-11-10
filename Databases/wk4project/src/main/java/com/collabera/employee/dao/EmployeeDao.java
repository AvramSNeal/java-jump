package com.collabera.employee.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.collabera.employee.connection.JdbcUtils;
import com.collabera.employee.model.Department;
import com.collabera.employee.model.Employee;


public class EmployeeDao {
	
	private static final Logger logger =
			Logger.getLogger(EmployeeDao.class.getName()); // log 4J named logger
	private static Logger Log = 
			Logger.getLogger(EmployeeDao.class.getName()); // log 4J named Log
	
	private static HashMap<String, Employee> cache = new HashMap<String, Employee>();
		
	public static void main(String[] args) {
		Log.info("Testing EmployeeDao ...");
    	
    	EmployeeDao employeeDao = new EmployeeDao();
    	
    	try {
    		List<Employee> employee = employeeDao.getAllEmployees();
    		System.out.println(employee);
    		if(employee.size()>0) {
    			Log.info("SUCCESS: EMPLOYEE: " + employee.get(0));
    		}
    	} catch (Exception e) {
    		Log.error(e.getMessage());
    	}
    	
    	//Try to insert an employee unless the employee id already exists in the database
    	try {
    		Employee employee = new Employee(43, "Doe", "Johnny", Department.ACCOUNTING);
    		boolean success = employeeDao.insert(employee);
    		if(success) {
    			Log.info("SUCCESS: INSERT employee: " + employee);
    		} else {
    			Log.info("FAILURE: Employee id already exists!");
    		}
    	} catch (Exception x) {
    		Log.error(x.getMessage());
    	}
    	
    	//Try to delete an employee by id if they exist in the database
    	try {
    		int code = 42;
    		boolean count = employeeDao.delete(code);
    		if(count) {
    			Log.info("SUCCESS: Delete employee: " + code);
    		} else {
    			Log.info("FAILURE: Employee id not found!");
    		}
    	} catch (Exception x) {
    		Log.error(x.getMessage());
    	}
	}
	
	List<Employee> getAllEmployees() throws SQLException, FileNotFoundException, IOException{
		
		List<Employee> list = new ArrayList<Employee>();
		
		PreparedStatement pstmt = JdbcUtils.getConnection()
				.prepareStatement("SELECT * FROM Employees where employee_id = ?");
			pstmt.setString(1, "Joseph Donald");
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee c = resultSetToEmployee(rs);
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
	
	
	
	private Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		Employee employee = null;
		
		String code = rs.getString("code");
		//Is this Employee already in cache? If so, use it
		if(cache.containsKey(code)) employee = cache.get(code);
		else employee = new Employee();
		
		employee.setId(rs.getInt("employee_id"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));
		employee.setDepartment(Department.values()[rs.getInt("department_id")]);
		
		//add this employee to the cache
		if(!cache.containsKey(code)) cache.put(code, employee);
		
		//now get reference to the department this employee refers
		logger.info("get department for employee " + employee.getId());
		
		return employee;
	}



	boolean insert (Employee emp) throws SQLException {
		PreparedStatement statement = JdbcUtils.getConnection()
				.prepareStatement("INSERT INTO employees(employee_id, last_name, first_name, department_id) VALUES(?,?,?,?)");
		
		statement.setInt(1, emp.getId());
		statement.setString(2, emp.getLastName());
		statement.setString(3, emp.getFirstName());
		statement.setInt(4, emp.getDepartment());
		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.error("error executing insert for emp: " + emp);
		} finally {
			statement.close();
		}
		
		return count > 0;
	}
	
	
	
	boolean delete (int id) throws SQLException {
		if(id<=0) return false;
		PreparedStatement statement = JdbcUtils.getConnection()
				.prepareStatement("DELETE FROM Employees where employee_id = ?");
		
		statement.setInt(1, id);
		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.error("error executing delete for id: " + id);
		} finally {
			statement.close();
		}
		
		return count > 0;
	}
	
}	
	
