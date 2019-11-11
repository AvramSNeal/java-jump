package com.collabera.jdbcdemo.dao;
import static org.junit.Assert.*;
import java.sql.SQLException;

import org.junit.Test;

import com.collabera.jdbcdemo.model.*;

public class EmployeeDaoInsertTest {
	
	@Test
	public void testInsert() {
		
		EmployeeDao employeeDao = new EmployeeDao();
		boolean inserted = false;
		try {
			inserted = employeeDao.insert(new Employee(46, "Jon6", "Snow", Department.ACCOUNTING));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertTrue(inserted);
	}
}
