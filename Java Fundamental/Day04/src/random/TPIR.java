package random;

import java.util.Scanner;

public class TPIR
{

	public static void main(String[] args)
	{
		
		int randNum = randomNumber(1, 100);
		System.out.println(randNum);
		game(randNum);

	}
	
	public static int randomNumber(int min, int max)
	{
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		return rand;
	}
	
	public static void game(int rand)
	{
		Scanner input = new Scanner(System.in);
		int guess;
		int tries = 0;
		
		System.out.println("Are you ready to play THE PRICE IS RIGHT?!");
		System.out.println("Well pull up a seat and get ready to guess what's on my mind!");
		System.out.println("I'm thinking of a random number." );
		System.out.println("What do you think the number is: " );
		do
		{
			guess = input.nextInt();
			tries++;
			
			if(guess==rand)
			{
				System.out.println("Congratulations you won!");
				break;
			}
			if(guess>rand)
			{
				System.out.println("Too high. Go lower.");
			}
			if(guess<rand)
			{
				System.out.println("Too low. Go higher.");
			}
			if(guess==42424242)
			{
				System.out.println("CHEATER! The number I'm thinking of is " + rand);
			}
			
		}while(true);
		System.out.println("Attempts: " + tries);
		input.close();
	}

}
