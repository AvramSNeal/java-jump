package multiarray;

public class MatricesAdd {

	public static void main(String[] args) {
		int a[][]= {{1,3,4},{3,4,5}};
		int b[][]= {{1,3,4},{3,4,5}};
		
		getMatrices(a,b);
		addMatrices(a,b);

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
	
	public static void addMatrices(int a[][], int b[][]) {
		int c[][]= new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[i][j] = a[i][j]+ b[i][j];
			}
		}
		
		System.out.println("Your added matrices become: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
