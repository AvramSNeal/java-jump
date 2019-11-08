package multiarray;

public class MatrixCalc {

	public static void main(String[] args) {
		int arr[][]= {{1,3,5},{2,4,6},{3,4,5},{1,4,7}};
		
		maxInRows(arr);
		System.out.println("--------------------");
		columnSum(arr);

	}
	
	public static void maxInRows(int arr[][]) {
		int max;
		for(int i=0; i<arr.length; i++) {
			max = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
			System.out.println("Row " + i + " : " + max + " is the max.");
		}
		
	}
	
	public static void columnSum(int arr[][]) {
		int sum;
		for(int i=0; i<arr[i].length; i++) {
			sum=0;
			for(int j=0; j<arr.length; j++) {
				sum += arr[j][i];
			}
			System.out.println("Column " + i + " : " + sum + " in the sum.");
		}

	}

}
