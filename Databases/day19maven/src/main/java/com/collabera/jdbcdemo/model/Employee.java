package com.collabera.jdbcdemo.model;


//The Employee class has all of the members required in the instructions as well as getters and setters.
//Lastly, an Override to display the employee data in an intuitive format.
public class Employee {
	private int id;
	private String lastName;
	private String firstName;
	private Department department;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String lastName, String firstName, Department department) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", lastName = " + lastName + ", firstName = " + firstName + ", department = " + department;		
	}
	
	
	
}
