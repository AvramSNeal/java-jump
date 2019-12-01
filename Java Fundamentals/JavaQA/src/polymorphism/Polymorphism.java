package polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		
		System.out.println("Example 1:");
		Main.main(args);
		
		System.out.println("\nExample 2:");
		Main2.main(args);
	}
}
//Java program for Method overloading 

class MultiplyFun { 

	// Method with 2 parameter 
	static int Multiply(int a, int b) 
	{ 
		return a * b; 
	} 

	// Method with the same name but 2 double parameter 
	static double Multiply(double a, double b) 
	{ 
		return a * b; 
	} 
} 

class Main { 
	public static void main(String[] args) 
	{ 

		System.out.println(MultiplyFun.Multiply(2, 4)); 

		System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
	} 
} 
//Java program for Method overloading 

class MultiplyFun2 { 

	// Method with 2 parameter 
	static int Multiply(int a, int b) 
	{ 
		return a * b; 
	} 

	// Method with the same name but 3 parameter 
	static int Multiply(int a, int b, int c) 
	{ 
		return a * b * c; 
	} 
} 

class Main2 { 
	public static void main(String[] args) 
	{ 
		System.out.println(MultiplyFun2.Multiply(2, 4)); 

		System.out.println(MultiplyFun2.Multiply(2, 7, 3)); 
	} 
} 
//Java program for Operator overloading 

class OperatorOVERDDN { 

	void operator(String str1, String str2) 
	{ 
		String s = str1 + str2; 
		System.out.println("Concatinated String - "
						+ s); 
	} 

	void operator(int a, int b) 
	{ 
		int c = a + b; 
		System.out.println("Sum = " + c); 
	} 
} 


class Main3 { 
	public static void main(String[] args) 
	{ 
		OperatorOVERDDN obj = new OperatorOVERDDN(); 
		obj.operator(2, 3); 
		obj.operator("joe", "now"); 
	} 
} 
