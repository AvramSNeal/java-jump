package com.collabera;

import java.io.*;
import java.util.Date;
import java.util.HashMap;

public class SchoolManagment {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException{
		writeData();
		readData();

	}
	private static void writeData() throws FileNotFoundException, IOException, CloneNotSupportedException{
		HashMap<Integer, Student> studentHashMap = new HashMap<Integer, Student>();
		
		for (int i = 0; i < 10; i++) {
			Student student = new Student();
			student.setId(i);
			student.setName("name" + i);
			student.setDob(new Date());
			studentHashMap.put(i, student);
		}
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(studentHashMap);
		oos.flush();
		oos.close();
	}
	private static void readData() throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("studentdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		
		@SuppressWarnings("unchecked")
		HashMap<Integer, Student> dataReadFromFile = (HashMap<Integer, Student>) object;
		for(Integer id: dataReadFromFile.keySet()) {
			System.out.println(dataReadFromFile.get(id));
		}
		ois.close();
	}

}
