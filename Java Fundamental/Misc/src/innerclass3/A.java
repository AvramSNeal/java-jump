package innerclass3;

public class A {
	static String s = "AAA";
	
	class B
	{
		String s = "BBB";
		
		void methodB()
		{
			System.out.println(s);
		}
	}
}
