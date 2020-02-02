package com.cognixia.jumpplus;

public class CollegeClass {
	
	private String subject;
	private String className;
	private String building;
	private int roomNumber;
	private int classSize; // onlye generate getter for size
	
	private Student[] students;
	
	public CollegeClass() {
		this("N/A", "N/A", "N/A", -1);
	}
	
	public CollegeClass(String subject, String className, String building, int roomNumber, int classSize) {
		super();
		this.subject = subject;
		this.className = className;
		this.building = building;
		this.roomNumber = roomNumber;
		this.classSize = classSize;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getClassSize() {
		return classSize;
	}

	
	
	
	
}
