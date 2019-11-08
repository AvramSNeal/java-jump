package innerclass4;

public class A {
	static void methodOne()
	{
		class B
		{
			void methodTwo()
			{
				System.out.println("Method Two");
			}
		}
		B b = new B();
		b.methodTwo();
	}
	
	void methodThree()
	{
		
		//new B().methodTwo();
	}
	
	public static void main(String[] args) {
		methodOne(); //In order to access methodOne we change it to a static method
	}
}
