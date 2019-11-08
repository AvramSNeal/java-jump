package arrays;

public class FindDuplicates {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 7, 2};
		boolean duplicates = false; 
		for (int i=0; i<my_array.length - 1; i++) {
			for (int j =i+1; j<my_array.length; j++) {
				if (j!=i && my_array[j] == my_array[i])
				      duplicates=true;
			}
		}

	}

}
