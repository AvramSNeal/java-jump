package wk3project;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Menu {
	
	public int choice;
	Scanner input = new Scanner(System.in);
	Employee emp = new Employee();
	TreeMap<Integer, Employee> empMap = new TreeMap<Integer, Employee>();
	
	public void getMenu(){
		System.out.println(
				"1. ADD\r\n" + 
				"2. REMOVE\r\n" + 
				"3. MODIFY\r\n" + 
				"4. PRINT\r\n" + 
				"5. EXIT");
		choice = input.nextInt();
		switch(choice) {
		case 1: addEmp();break;
		case 2: removeEmp();break;
		case 3: modifyEmp();break;
		case 4: printEmp();break;
		case 5: System.out.println("Employee Management System Closed.");;break;
		default: System.out.println("WIP");break;
		}
	}


	public void addEmp() {
		System.out.println("Enter ID:");
		emp.setId(input.nextInt());
		
		System.out.println("Enter First Name:");
		emp.setFirstName(input.next());
		
		System.out.println("Enter Last Name:");
		emp.setLastName(input.next());
		
		System.out.println(
				"Enter a department:\r\n" + 
				"1. ACCOUNTING\r\n" + 
				"2. HR\r\n" + 
				"3. DEVELOPMENT\r\n" + 
				"4. SALES");
		emp.setDepartment(Department.values()[input.nextInt()-1]);
		
		System.out.println(
				emp.getId()+
				emp.getFirstName()+
				emp.getLastName()+
				emp.getDepartment()
				);

		empMap.put(emp.getId(), emp);
		
		System.out.println(empMap.get(emp.getId()));
		getMenu();
		
	}
	
	private void removeEmp() {
		System.out.println("Enter an ID to remove:");
		choice = input.nextInt();
		System.out.print("Employee Removed:");
		System.out.println(empMap.get(choice));;
		empMap.remove(choice);
		getMenu();
	}
	
	private void modifyEmp() {
		System.out.println("Enter an ID to modify:");
		choice = input.nextInt();
		empMap.get(choice); //We need to get the employee from the Tree Map
		System.out.println(
				"Enter a department:\r\n" + 
				"1. ACCOUNTING\r\n" + 
				"2. HR\r\n" + 
				"3. DEVELOPMENT\r\n" + 
				"4. SALES");
		emp.setDepartment(Department.values()[input.nextInt()-1]);
		empMap.replace(choice, emp);
		System.out.print("Department changed:");
		System.out.println(empMap.get(choice));;
		getMenu();
		
	}
	
	private void printEmp() {
		for(Map.Entry<Integer,Employee> x:empMap.entrySet()) {
			System.out.println(x.getKey()+ " " + x.getValue());
		}
		getMenu();
	}
}
