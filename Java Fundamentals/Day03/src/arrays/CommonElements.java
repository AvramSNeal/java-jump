package arrays;

import java.util.Arrays;

public class CommonElements {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 4, 5, 8, 9, 7, 10};
		int[] array2 = {0, 1, 6, 15, 6, 7, 4, 0};
		
		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));
		
		for(int i=1; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(array1[i]==(array2[j])) {
					System.out.println("Common element is : " + (array1[i]));
				}
			}
		}
	}
}
