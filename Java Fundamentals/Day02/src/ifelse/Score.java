package ifelse;

import java.util.Scanner;

public class Score {
	
	public double score;
	
	public void getResult() {
		if(score >= 90) System.out.println("Your grade is A. You might actually do something in life!");
		else if(score >= 80) System.out.println("Your grade is B. Well you get it from your father.");
		else if(score >= 70) System.out.println("Your grade is C. Hmm...");
		else if(score >= 60) System.out.println("Your grade is D. So today is the day you wanted to sleep outside.");
		else System.out.println("Your grade is F... you're not very good at this are you?");
		
	}
	
	public void getScore() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your test score: ");
		score = input.nextDouble();
		
		input.close();
	}
}
