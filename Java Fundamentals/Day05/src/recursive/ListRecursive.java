package recursive;

public class ListRecursive {

	public static void main(String[] args) {
		listNumbers(1, 100);

	}
	
	static void listNumbers(int x, int y) {
		System.out.println(x + " ");
		if(x==y) return;
		listNumbers(x+1, y);
	}

}
