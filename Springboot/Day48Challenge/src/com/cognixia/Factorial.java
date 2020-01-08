package com.cognixia;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static int factorial(int x) {
		
		return x <=1 ? x : x * factorial(x-1);
	}

}
