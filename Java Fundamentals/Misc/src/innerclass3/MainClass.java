package innerclass3;

public class MainClass {
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		A a = new A();
		
		System.out.println(a.s);
		
		A.B b = a.new B();
		
		System.out.println(b.s);
		
		b.methodB();
	}
}
