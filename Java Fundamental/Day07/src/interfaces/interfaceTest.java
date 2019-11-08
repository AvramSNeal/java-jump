package interfaces;

interface Printable{
	void print();
}

interface Showable{
	void show();
}

public class interfaceTest implements Printable, Showable {
	public void print() {System.out.println("HELLO");}
	public void show() {System.out.println("Welcome!");}


	public static void main(String args[]) {
		interfaceTest obj = new interfaceTest();
		obj.print();
		obj.show();
	}
}
