package com.collabera.jump;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		
		//fun([1, 3, 5]) --> 9",
		//fun([4, 5, 6, 7, 8, 9]) --> 9",
		//fun([2, 1, 6, 9, 11]) --> 14"
		
		int arrayA[] = {1, 3, 5};
		int arrayB[] = {4, 5, 6, 7, 8, 9};
		int arrayC[] = {2, 1, 6, 9, 11};
		int arrayD[] = {1, 2, 4, 8, 16};
		int arrayE[] = {2, 4, 6, 8, 10, 12, 9};
		int arrayF[] = {1024, 2048, 4096, 8192};
		
		sumNumbers(arrayA);
		sumNumbers(arrayB);
		sumNumbers(arrayC);
		sumNumbers(arrayD);
		sumNumbers(arrayE);
		sumNumbers(arrayF);

	}

	private static void sumNumbers(int arr[]) {
		int sum=0;
		boolean flag=false;
		
		for(int num : arr) {
			if(num!=6&&flag!=true) {
				sum += num;
			} else {
				if(num==9) {
					flag=false;
				} else {
					flag=true;
				}
				
			}
		}
		
		System.out.println("The sum of the array " + Arrays.toString(arr) + " is " + sum);
	}

}
