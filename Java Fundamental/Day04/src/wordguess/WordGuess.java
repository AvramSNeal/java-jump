package wordguess;

import java.util.Random;
import java.util.Scanner;
//This program needs cleaning up a bit
public class WordGuess {
	
	public static void main(String[] args) {
		final String SECRET_WORD[] = {"BRAIN", "JAVA", "COMPUTER", "PROGRAM", "TYPING"};
		String wordSoFar = "", updatedWord = "";
		String letterGuess;
		int numGuesses = 0;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		String keyword = SECRET_WORD[rand.nextInt(4)];
		
		System.out.println("WordGuess game.\n");
		for (int i = 0; i < keyword.length(); i++) {
			wordSoFar += "-";
		}
		System.out.println(wordSoFar + "\n");
	
		do {
			System.out.print("Enter a letter: ");
			letterGuess = input.nextLine();
			letterGuess = letterGuess.toUpperCase();			
		
			numGuesses += 1;
			
			if (keyword.contains(letterGuess) && letterGuess.length() == 1) {
				updatedWord = wordSoFar.substring(0, keyword.indexOf(letterGuess)); 
				updatedWord += letterGuess;												
				updatedWord += wordSoFar.substring(keyword.indexOf(letterGuess)+1, wordSoFar.length());
				wordSoFar = updatedWord;
			}

			System.out.println(wordSoFar + "\n");
		} while (!wordSoFar.equals(keyword));
		
		
		if (wordSoFar.equals(keyword)) {
			System.out.println("You won!");		
		} else {
			System.out.println("Sorry. You lose.");
		}
		System.out.println("The secret word is " + keyword);
		System.out.println("You made " + numGuesses + " guesses.");
		
		input.close();
	}

}
