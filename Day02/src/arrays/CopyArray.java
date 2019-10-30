package arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] new_array = new int[10];
		
		System.arraycopy(my_array, 0, new_array, 0, 10);
		System.out.println("Source Array : " + Arrays.toString(my_array));
		System.out.println("New Array : " + Arrays.toString(new_array));

	}

}
