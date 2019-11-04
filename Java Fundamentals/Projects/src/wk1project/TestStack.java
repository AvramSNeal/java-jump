package wk1project;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		stackTest();

	}
	
	public static void stackTest() {
		MyStack stack = new MyStack(10);
		Scanner input = new Scanner(System.in);
		int choice;
		boolean flag=true;
		String userString;

		System.out.println("Looks like you're trying to test a stack...");
		System.out.println(" __________");
		System.out.println("(NEED HELP?)");
		System.out.println(" ---------");
		System.out.println("  \\");
		System.out.println("   \\");
		System.out.println("      __");
		System.out.println("     /  \\");
		System.out.println("     |  |");
		System.out.println("     @  @");
		System.out.println("     || |/");
		System.out.println("     || ||");
		System.out.println("     |\\_/|");
		System.out.println("     \\___/");
		
		do {
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("(1)PUSH a string to the stack.");
			System.out.println("(2)POP the top data element from the stack.");
			System.out.println("(3)PEEK to top data element in the stack.");
			System.out.println("(4)END the program.");
			choice = input.nextInt();
			if(choice==1) {
				System.out.println("Enter the a string you want to push to the stack: ");
				userString = input.next();//Can't take spaces i.e. Multiple words in one string
				stack.push(userString);
			}else if(choice==2) {
				stack.pop();
			}else if(choice==3) {
				stack.peek();
			}else {
				if(choice==4) {
					System.out.println("Have a nice day!");
					
				}else {
					System.out.println("ERROR! Ending program.");
				}
				flag = false;
				input.close();
			}
		}while(flag==true);
		
	}

}
