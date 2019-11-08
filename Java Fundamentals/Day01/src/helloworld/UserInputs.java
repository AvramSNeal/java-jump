package helloworld;
import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		
		String name = scanner.next();
		
		System.out.println(name);
		
		System.out.println("Enter your Age:");
		
		int age = scanner.nextInt();
		
		System.out.println(age);
		
		System.out.println("Enter your Gender:");
		
		String sex = scanner.next();
		
		System.out.println(sex);
		
		scanner.close();

	}

}
