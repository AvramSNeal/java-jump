package com.collabera.employee.model;


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
	public int getDepartment() {
		int dept=1;
		switch(this.department) {
		case ACCOUNTING: dept = 1; break;
		case HR: dept = 2; break;
		case DEVELOPMENT: dept = 3; break;
		case SALES: dept = 4; break;
		}
		return dept;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", lastName = " + lastName + ", firstName = " + firstName + ", department = " + department;		
	}
	
	
	
}
