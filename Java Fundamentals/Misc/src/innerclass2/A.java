package innerclass2;

public class A {
	static String s = "AAA";
	
	static void methodA()
	{
		System.out.println(s);
	}
	
	
	static class B
	{
		void methodB()
		{
			methodA();
		}
	}
}
