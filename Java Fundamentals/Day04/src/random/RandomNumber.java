package random;

public class RandomNumber
{

	public static void main(String[] args)
	{
		int max = 10;
		int min = 1;
		int range = max - min;
		
		for (int i=0; i<10; i++)
		{
			int rand = (int)(Math.random() * range) + min;
			System.out.println(rand);
		}

	}

}
