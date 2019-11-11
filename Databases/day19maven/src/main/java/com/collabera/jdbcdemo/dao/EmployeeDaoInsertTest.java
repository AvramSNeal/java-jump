package com.collabera.jdbcdemo.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.collabera.jdbcdemo.model.*;

public class EmployeeDaoInsertTest {
	
	@Test
	public void testInsert() {
		
		EmployeeDao employeeDao = EmployeeDao();
		boolean inserted = false;
		try {
			inserted = employeeDao.insert(new Employee(46, "Jon6", "Snow", Department.ACCOUNTING));
		} catch (SQLExceptioin e) {
			e.printStackTrace();
		}
		assertTrue(inserted);
	}
}
