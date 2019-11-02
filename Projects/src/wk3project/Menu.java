package wk3project;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.InputMismatchException;

public class Menu {
	
	public int menu, choice;
	Scanner input = new Scanner(System.in);
	Employee emp = new Employee();
	TreeMap<Integer, Employee> empMap = new TreeMap<Integer, Employee>();
	
	public void getMenu(){
		
		System.out.println(
				"MAIN MENU\r\n" + 
				"1. ADD\r\n" + 
				"2. REMOVE\r\n" + 
				"3. MODIFY\r\n" + 
				"4. PRINT\r\n" + 
				"5. EXIT");
		try {
			menu = input.nextInt();
			switch(menu) {
			case 1: addEmp();break;
			case 2: removeEmp();break;
			case 3: modifyEmp();break;
			case 4: printEmp();break;
			case 5: 
				System.out.println("Thank you for using the Employee Management System!");
				System.out.println("Employee Management System Closed.");
				break;
			default:
				System.out.println("INVALID VALUE!");
				System.out.println("Please enter a value from 1-5: ");
				getMenu();
				break;
			}
		}catch(InputMismatchException e) {
			System.out.println("The value [" + input.next() + "] is an invalid entry!");
			System.out.println("Input Mismatch Exceptioin occurred! " + e.getMessage());
			System.out.println("ENDING PROGRAM!");
			e.printStackTrace();
		}
		
		
	}


	public void addEmp() {
		
		
		System.out.println("Enter ID:");
		emp.setId(input.nextInt());
		
		if(empMap.containsKey(emp.getId())) {
			System.out.println("An Employee with the ID [" + emp.getId() + "] already exists!");
		}else {
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
			empMap.put(emp.getId(), emp);
			
			System.out.println("Employee Added: " + empMap.get(emp.getId()));
		}
		
		System.out.println();
		getMenu();
		
	}
	
	private void removeEmp() {
		System.out.println("Enter an ID to remove:");
		choice = input.nextInt();
		
		if(empMap.get(choice)!=null) {
			System.out.print("Employee Removed: ");
		System.out.println(empMap.get(choice));;
		empMap.remove(choice);
		}else {
			System.out.println("The Employee ID [" + choice + "] does not exist!");
		}
		
		
		System.out.println();
		getMenu();
	}
	
	private void modifyEmp() {
		System.out.println("Enter an ID to modify:");
		choice = input.nextInt();
		if(empMap.get(choice)!=null) {
			System.out.println("Found Employee ID [" + choice + "]!");
			empMap.get(choice);
			System.out.println(
					"Enter a department:\r\n" + 
					"1. ACCOUNTING\r\n" + 
					"2. HR\r\n" + 
					"3. DEVELOPMENT\r\n" + 
					"4. SALES");
			emp.setDepartment(Department.values()[input.nextInt()-1]);
			empMap.replace(choice, emp);
			System.out.print("Department changed: ");
			System.out.println(empMap.get(choice));
		}else {
			System.out.println("The Employee ID [" + choice + "] does not exist!");
		}
		
		
		System.out.println();
		getMenu();
		
	}
	
	private void printEmp() {
		System.out.println("Employee List");
		System.out.println("------------------------------------------------------------------");
		if(empMap.isEmpty()) {
			System.out.println("[The Employee List is Empty]");
		}else {
			for(Map.Entry<Integer,Employee> x:empMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
			}
		}
		
		System.out.println();
		getMenu();
	}
}
