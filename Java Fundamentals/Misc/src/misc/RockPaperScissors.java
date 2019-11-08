package misc;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int cpu;
		int p1 = 0;
		String cont = "Y";
		
		int p1Score = 0;
		int cpuScore = 0;
		
		System.out.println("Let's play a game!");
		
		do{
			System.out.println("Rock Paper Scissors");
			System.out.println("(1) Rock");
			System.out.println("(2) Paper");
			System.out.println("(3) Scissors");
			System.out.println("Enter your choice [1-3]:");
			
			do {	
				p1 = input.nextInt()-1;
				if(p1 != 0 && p1 != 1 && p1 != 2) {
					System.out.println("You're pulling my leg! Enter a value from 1 to 3:");
				}
			}while(p1 != 0 && p1 != 1 && p1 != 2);
			String[] choice = {"Rock", "Paper", "Scissors"}; 
			cpu = rand.nextInt(2);
			System.out.println("So, you chose (" + (p1+1) + ") " + choice[p1]);	
			System.out.println("And I chose (" + (cpu+1) + ") " + choice[cpu]);			
			if(p1 == cpu) {
				System.out.println("Well, well, well, looks like a DRAW!");
			}
			if(p1 == 0) {
				if(cpu == 1) {
					System.out.println("Too bad! You LOSE!");
					cpuScore++;
				}
				if(cpu == 2) {
					System.out.println("Oof! You beat me! You WIN!");
					p1Score++;
				}
			}
			if(p1 == 1) {
				if(cpu == 0) {
					System.out.println("Oof! You beat me! You WIN!");
					p1Score++;
				}
				if(cpu == 2) {
					System.out.println("Too bad! You LOSE!");
					cpuScore++;
				}
			}
			if(p1 == 2) {
				if(cpu == 0) {
					System.out.println("Too bad! You LOSE!");
					cpuScore++;
				}
				if(cpu == 1) {
					System.out.println("Oof! You beat me! You WIN!");
					p1Score++;
				}
			}
			
			System.out.println();
			
			System.out.println("Player Score: " + p1Score);
			System.out.println("CPU Score: " + cpuScore);
			System.out.println("Want to play again?");
			System.out.println("Enter Y to continue: ");
			cont = input.next();
			System.out.println(cont);
		}while(cont.equals("Y")|| cont.equals("y"));
		
		System.out.println(cont);
		System.out.println("GAME OVER");
		input.close();
	}

}
