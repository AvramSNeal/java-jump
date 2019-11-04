package wk3project;
/**
 * 
 * @author Avram Neal
 *
 * Implement an Employee Management System with these features:
 *	- The Employee class will have these data members:
 *	private int id;
 *	private String lastName;
 *	private String firstName;
 *	private Department department;
 *	- Department is an enumeration of:
 *	ACCOUNTING
 *	HR
 *	DEVELOPMENT
 *	SALES
 *	- Use a Map collection to store the employees with the key: id
 *	
 *	- the system will display a menu with options from 1 to 5 to
 *	ADD, REMOVE an employee, MODIFY the Department of an employee,
 *	PRINT the list of employees sorted by id, and EXIT.
 *	1. ADD
 *	2. REMOVE
 *	3. MODIFY
 *	4. PRINT
 *	5. EXIT
 *	- After completing the menu actions 1 to 4, the system will display
 *	the menu again, until EXIT (menu option 5), which will terminate the program.
 */

public class EMSApp {

	//This is the main method
	public static void main(String[] args) {
		Menu menu = new Menu();
		try {
			System.out.println("Welcome to the Employee Management System!");
			System.out.println();
			menu.getMenu();//Display the menu
		}catch(Exception e) { 
			//This will catch other exceptions that the InputMismatchException misses. E.g. ArrayIndexOutOfBoundsException
			System.out.println("An Exceptioin occurred! " + e.getMessage());
			System.out.println("ENDING PROGRAM!");
			e.printStackTrace();
		}
		

	}

}
