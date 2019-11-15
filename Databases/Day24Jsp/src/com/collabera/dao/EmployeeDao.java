package com.collabera.dao;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.collabera.model.Employee;

public class EmployeeDao {
	static Map<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();
	static {
		for(int i=0; i<120; i++) {
			employeeMap.put(i, new Employee(i, "Fname" + i, "Lname"+i));
			System.out.println("employeeMap size: " + employeeMap.size());
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
}
