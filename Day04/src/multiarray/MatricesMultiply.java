package multiarray;

public class MatricesMultiply {

	public static void main(String[] args) {
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};

		getMatrices(a,b);
		multiplyMatrices(a,b);

	}
	
	public static void getMatrices(int a[][], int b[][]) {
		System.out.println("Your matrix A is: ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Your matrix B is: ");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void multiplyMatrices(int a[][], int b[][]) {
		int c[][]= new int[a.length][b[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				
			}
		}
		
		System.out.println("Your multiplied matrices become: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
