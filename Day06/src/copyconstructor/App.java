package copyconstructor;

import copyconstructor.complex.Complex;

public class App {

	public static void main(String[] args) {
		Complex c1 = new Complex(10,15);
		
		Complex c2 = new Complex(c1);
		
		Complex c3 = c2;
		
		if(c1.equals(c2)) {
			System.out.println("c1 equals c2");
		}else {
			System.out.println("c1 does NOT equal c2");
		}
		
		if(c1==c2) {
			System.out.println("c1 == c2");
		}else {
			System.out.println("c1 != c2");
		}
		System.out.println(c2);
		System.out.println("Set c3 equal to c2: " + c3);

	}

}
