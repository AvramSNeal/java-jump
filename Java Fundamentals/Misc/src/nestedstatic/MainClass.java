package nestedstatic;

abstract class X {
	static String s1 = "STATIC";
	String s2 = "NON-STATIC";
	abstract void method();
	
	static abstract class Y	{
		String s1 = "NON-STATIC";
		static String s2 = "STATIC";
		abstract void methodY();
	}
}

public class MainClass {
	public static void main(String[] args) {
		new X() {
			void methodX() {
				System.out.println(s1+ " " + s2);
			}

			@Override
			void method() {
				//Although you will get an error, this program will run without this Override method
				
			}
		}.methodX();
		
		new X.Y() {
			void methodY() {
				System.out.println(s1+ " " + s2);
			}
		}.methodY();
	}
}
