package loops;

public class Pyramid {

	public static void main(String[] args) {

		pyramid1();
		System.out.println("");
		pyramid2();
	}
	
	public static void pyramid1() {
		for(int row=1; row<=16; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pyramid2() {
		for(int row=16; row>=1; row--) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
