package swap;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String args[]) {
		int x, y, temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);	
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping again!");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int A = 10;
		int B = 20;
		System.out.println("Before Swapping A and B");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		B=A+B;
		A=B-A;
		B=B-A;
	
		System.out.println("After Swapping A and B");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		in.close();
	}
}
