package com.collabera.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.collabera.dao.EmployeeDao;
import com.collabera.connection.JdbcUtils;
import com.collabera.model.Employee;

public class EmployeeDao {
	
	//private static final Logger logger = Logger.getLogger(EmployeeDao.class.getName()); // log 4J named logger
	
	private static HashMap<String, Employee> cache = new HashMap<String, Employee>();
	
	static Map<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();
	static {
		/*
		for(int i=0; i<120; i++) {
			employeeMap.put(i, new Employee(i, "Fname" + i, "Lname"+i));
			System.out.println("employeeMap size: " + employeeMap.size());
		}
		*/
		
		EmployeeDao employeeDao = new EmployeeDao();

		// Try to print out list of employees found in the database
		try {
			List<Employee> employee = employeeDao.getAllEmployees();
			if (employee.size() > 0) {
				//Log.info("SUCCESS: Employee List: ");
				for(Employee emp : employee) {
					employeeMap.put(emp.getId(), new Employee(emp.getId(), emp.getFirstName(), emp.getLastName()));
					System.out.println("employeeMap size: " + employeeMap.size());
					//Log.info(emp);
				}
				
			} else {
				//Log.info("FAILURE: No employees exist in the database!");
			}
		} catch (Exception e) {
			//Log.error(e.getMessage());
		}
	}
	
	public static List<Employee> getList(int pageNo, int pageSize){
		
		
		return employeeMap.entrySet()
				.stream()
				.skip((pageNo-1)*pageSize)
				.limit(pageSize)
				.map(Map.Entry::getValue)
				.collect(Collectors.toList());
	}
	
	public static Employee getEmployee(int id) {
		return employeeMap.get(id);
	}
	
	public static Employee insert(Employee emp) {
		return employeeMap.put(emp.getId(), emp);
	}
	
	public static Employee delete(int id) {
		return employeeMap.remove(id);
	}
	
	public static int getTotalRecords() {
		return employeeMap.size();
	}
	
	// Method for pulling employees from the employee database
	List<Employee> getAllEmployees() throws SQLException, FileNotFoundException, IOException {

		List<Employee> list = new ArrayList<Employee>();
	
		PreparedStatement pstmt = JdbcUtils.getConnection().prepareStatement("SELECT * FROM Employees");
		try {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee c = resultSetToEmployee(rs);
				list.add(c);
			}
		} catch (SQLException sqle) {
			//exception output
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					/* ignore it */ }
				}
		}
		return list;
	}
	
	// Method for adding employees to the cache
	private Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		Employee employee = null;
		String code = rs.getString("id");
		// Is this Employee already in cache? If so, use it
		if (cache.containsKey(code))
			employee = cache.get(code);
		else
			employee = new Employee();
			employee.setId(rs.getInt("id"));
			employee.setFirstName(rs.getString("firstName"));
			employee.setLastName(rs.getString("lastName"));

		// add this employee to the cache
		if (!cache.containsKey(code))
			cache.put(code, employee);

		return employee;
		}
}
