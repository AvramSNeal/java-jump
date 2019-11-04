package multiarray;

public class MatricesTranspose {

	public static void main(String[] args) {
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};

		getMatrix(a);
		transposeMatrix(a);

	}
	
	public static void getMatrix(int a[][]) {
		System.out.println("Your matrix is: ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void transposeMatrix(int a[][]) {
		int b[][]= new int[a[0].length][a.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		
		System.out.println("Your transposed matrix is: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
