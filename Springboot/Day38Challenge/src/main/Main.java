package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type words that will have their vowels removed/extracted: ");
		vowelExtractor(input.nextLine());
		
		sWordsOnly("print all the words which are starting with s in this sentence");
		
		evenNumbers();
		
		countWordsEven("in the given string count the words which are of even length");
		
		fizzBuzz(100);
		
		input.close();
	}


	private static void vowelExtractor(String str) {
		System.out.println("---" + str.replaceAll("[AaEeIiOoUu]", ""));
	}
	
	private static void sWordsOnly(String str) {
		System.out.print("---");
		String words[] = str.split(" ");
		str = "";
		
		for(String wrd : words) {
			if(wrd.charAt(0)=='s' || wrd.charAt(0)=='S') {
				str = str.concat(wrd + " ");
			}
		}
		System.out.print(str);
		System.out.println();		
	}
	
	private static void evenNumbers() {
		System.out.print("---");
		for(int i=0; i<=100; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	private static void countWordsEven(String str) {
		System.out.print("---");
		String words[] = str.split(" ");
		int evenWords = 0;
		
		for(String wrd : words) {
			
			if(wrd.length()%2 == 0) evenWords ++;
		}
		
		System.out.println("Even Words: " + evenWords);
	}
	
	private static void fizzBuzz(int num) {
		System.out.print("---");
		for (int i = 1; i <= num; i++) 
		{
		    if ((i % 3) == 0 && (i % 5) == 0) // Is it a multiple of 3 & 5?
		        System.out.print("FizzBuzz ");
		    else if (i % 3 == 0) // Is it a multiple of 3?
		        System.out.print("Fizz ");
		    else if (i % 5 == 0) // Is it a multiple of 5?
		        System.out.print("Buzz ");
		    else
		        System.out.print(i + " "); // Not a multiple of 3 or 5
		}
		System.out.println();
		
	}
}
