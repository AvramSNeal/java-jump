package com.collabera.jdbcdemo.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.collabera.jdbcdemo.model.*;

public class EmployeeDaoDeleteTest {
	
	@Test
	public void testDelete() {
		boolean deleted = false;
		EmployeeDao employeeDao = EmployeeDao();
		try {
			deleted = employeeDao.delete(46);
		} catch (SQLExceptioin e) {
			e.printStackTrace();
		}
		assertTrue(deleted);
	}
}
