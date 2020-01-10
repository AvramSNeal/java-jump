package com.cognixia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestPrimeFactor2 {

	public static void main(String[] args) {
		
		int x = 0;
		
		try(Scanner input = new Scanner(System.in)){
			
			//exception();
			x = input.nextInt();
			assert (10<=x && x<=75) : "Out of bounds";
			System.out.println("The largest prime factor of " + x + " is " + lpf(x));
			
		} 
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}
	
	static int lpf(int x) {
		
		int y = 2; // y is our placeholder we set to 2 because if it's 2 or 1, it should return itself
		
		// We create a while loop to check from greatest factor to lowest if it is a prime
		System.out.println("Current: x is " +x+ " and y is " +y);
		while (x > y) {
			if(x%y==0) {
				x = x / y; // If x is divisible by y, we reduce x by y (e.g. x(10)/y(2) =x(5))
				System.out.println("Reduce x by y: x is " +x+ " and y is " +y);
			} else {
				y += 1; // In the event that x is not divisible by y, we increment by 1 and check again
				System.out.println("Increment y by 1: x is " +x+ " and y is " +y);
			}
			
		}
		
		return x;
	}
	
	
	static void exception() throws CustomException{
		System.out.println("Inside throws exception.");
		throw new CustomException("Custom Exception throw");
	}

}

class CustomException extends InputMismatchException{
	private static final long serialVersionUID = 1L;
	
	public CustomException(String s) {
		super(s);
	}
	
}
 
