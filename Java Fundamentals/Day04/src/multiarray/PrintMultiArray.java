package multiarray;

public class PrintMultiArray {

	public static void main(String[] args) {
		int arr[][]= {{1,3,5},{2,4,6},{3,4,5},{1,4,7}};
		
		printMultiArray(arr);

	}
	
	public static void printMultiArray(int array[][]) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
