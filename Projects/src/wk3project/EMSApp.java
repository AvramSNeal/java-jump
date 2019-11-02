package wk3project;


public class EMSApp {

	public static void main(String[] args) {
		Menu menu = new Menu();
		try {
			System.out.println("Welcome to the Employee Management System!");
			System.out.println();
			menu.getMenu();
		}catch(Exception e) {
			System.out.println("An Exceptioin occurred! " + e.getMessage());
			System.out.println("ENDING PROGRAM!");
			e.printStackTrace();
		}
		

	}

}
