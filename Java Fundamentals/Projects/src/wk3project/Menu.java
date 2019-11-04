package wk3project;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.InputMismatchException;

public class Menu {
	
	public int menu, choice; //Two variables for keeping track of the user's numerical choices
	Scanner input = new Scanner(System.in);
	TreeMap<Integer, Employee> empMap = new TreeMap<Integer, Employee>(); //A TreeMap for sorted entries that will hold the <Key, Employee(Value)> for each employee
	
	//This is the menu method
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
				System.out.println("Please enter a value from 1-5: "); //Remind the user of the parameters
				getMenu(); //Restart the menu
				break;
			}
		}catch(InputMismatchException e) {
			//This will catch menu entries that aren't integers
			System.out.println("The value [" + input.next() + "] is an invalid entry!");
			System.out.println("Input Mismatch Exceptioin occurred! " + e.getMessage());
			System.out.println("ENDING PROGRAM!");
			e.printStackTrace();
		}
		
		
	}


	//This is the method for adding new employees to the Tree Map
	public void addEmp() {
		Employee emp = new Employee();
		
		System.out.println("Enter ID:");
		emp.setId(input.nextInt());
		
		//First check to see if that id isn't already in the map
		if(empMap.containsKey(emp.getId())) {
			System.out.println("An Employee with the ID [" + emp.getId() + "] already exists!");
		}else {
			//Continue getting credentials from the user
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
			emp.setDepartment(Department.values()[input.nextInt()-1]); //Get the user department numerical value - 1 to correspond with the enum values in Department.java (i.e. [0-3])
			empMap.put(emp.getId(), emp); //Put the employee data (i.e. id, names, and department) in the Tree Map
			
			System.out.println("Employee Added: " + empMap.get(emp.getId())); //Print that entry to the console
		}
		
		System.out.println();
		getMenu(); //Return to the main menu
		
	}
	
	//This is the method for removing employees from the Tree Map
	private void removeEmp() {
		
		System.out.println("Enter an ID to remove:");
		choice = input.nextInt();
		
		//First check to see if that id exists in the map or not
		if(empMap.get(choice)!=null) {
			System.out.print("Employee Removed: ");
			System.out.println(empMap.get(choice));;
			empMap.remove(choice); //Remove the employee from the Tree Map
		}else {
			System.out.println("The Employee ID [" + choice + "] does not exist!");
		}
		
		
		System.out.println();
		getMenu(); //Return to the main menu
	}
	
	//This is the method for modifying the department of a specified employee
	private void modifyEmp() {
		Employee emp = new Employee();
		
		System.out.println("Enter an ID to modify:");
		choice = input.nextInt();
		
		//First check to see if that id exists in the map or not
		if(empMap.get(choice)!=null) {
			System.out.println("Found Employee ID [" + choice + "]!");
			emp = empMap.get(choice);//Set this new instance of Employee to the employee found in the Tree Map
			//Get the new department selection from the user
			System.out.println(
					"Enter a department:\r\n" + 
					"1. ACCOUNTING\r\n" + 
					"2. HR\r\n" + 
					"3. DEVELOPMENT\r\n" + 
					"4. SALES");
			emp.setDepartment(Department.values()[input.nextInt()-1]);
			empMap.replace(choice, emp);//Updates(replaces) the old value with the new value
			System.out.print("Department changed: ");
			System.out.println(empMap.get(choice));
		}else {
			System.out.println("The Employee ID [" + choice + "] does not exist!");
		}
		
		
		System.out.println();
		getMenu(); //Return to the main menu
		
	}
	
	//This is the method for printing the employee list from the Tree Map
	private void printEmp() {
		System.out.println("Employee List");
		System.out.println("------------------------------------------------------------------");
		
		//First check to see if any employees exist in the map
		if(empMap.isEmpty()) {
			System.out.println("[The Employee List is Empty]");
		}else {
			//For every map entry in the Tree Map, print to a new line
			for(Map.Entry<Integer,Employee> x:empMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
			}
		}
		
		System.out.println();
		getMenu(); //Return to the main menu
	}
}
