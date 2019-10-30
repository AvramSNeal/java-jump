package arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int myArray[] = {45,45,45,45,12,85,32,89,39,69,44,42,1,6,8};
		int myArraySorted[] = {45,45,45,45,12,85,32,89,39,69,44,42,1,6,8};
		System.out.println("This is your array on drugs: " + Arrays.toString(myArray));	

		//bubbleSortArray(myArraySorted);
		selectionSortArray(myArraySorted);

		
		
	}
	
	public static void bubbleSortArray(int[] array) {
		System.out.println("This is your array sorted with Bubble Sort: ");
		int temp;
		//Bubble Sort
			for (int i = 1; i < array.length; i++) {
				for (int j = i; j > 0; j--) {
					if (array[j] < array [j - 1]) {
						temp = array[j];
						array[j] = array[j - 1];
						array[j - 1] = temp;
					}
				}
			}
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}

	}
	
	public static void selectionSortArray(int[] array) {
		System.out.println("This is your array sorted with Selection Sort: ");
	        int n = array.length; 
	  
	        // One by one move boundary of unsorted sub-array 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (array[j] < array[min_idx]) 
	                    min_idx = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            int temp = array[min_idx]; 
	            array[min_idx] = array[i]; 
	            array[i] = temp; 
	        }
	        for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}

	}

}
