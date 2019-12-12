package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TASolution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean cont = true;

		while (cont) {
			try {
				System.out.println("\nWhich exercise do you want to see?" + "\n1: Extract vowels occered in this string"
						+ "\n2: print all the words which are starting with s in this sentence"
						+ "\n3: print all the number which are even from 1 to 100"
						+ "\n4: in the below given string count the words which are of even length"
						+ "\n5: Write a program that prints the integers from 1 to 100. But for multiples of three print “Fizz” instead of the number, and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."
						+ "\n6:exit");
				int input = scan.nextInt();

				switch (input) {
				case 1:
					System.out.println(extractVowels("Extract vowels occered in this string"));
					break;
				case 2:
					System.out.println(getS("print all the words which are starting with s in this sentence"));
					break;
				case 3:
					System.out.println(printEvens());
					break;
				case 4:
					System.out.println(evenWords(
							"Write a program that prints the integers from 1 to 100. But for multiples of three print “Fizz” instead of the number, and for the multiples of five print “Buzz“. For numbers which are multiples of both three and five print “FizzBuzz“."));
					break;
				case 5:
					fizzBuzz();
					break;
				case 6:
					System.out.println("Bye!");
					cont = false;
					break;
				default:
					System.out.println("Not a valid input.  Unlike you.  You are valid.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a number");
			}
		}
		scan.close();
	}

	public static String extractVowels(String str) {


	String s = Arrays.stream(str.split(" ")).filter(letter -> letter.toLowerCase().matches("[aeiou]")).collect(Collectors.joining(" "));
		
		return s;
	}

	public static ArrayList<String> getS(String str) {
		ArrayList<String> sWords = new ArrayList<>();
		Arrays.stream(str.split(" ")).filter(word -> word.startsWith("s")).forEach(elm -> sWords.add(elm));

		return sWords;

	}

	public static HashSet<Integer> printEvens() {
		HashSet<Integer> hs = new HashSet<>();

		IntStream.rangeClosed(0, 100).filter(i -> i % 2 == 0).forEach(e -> hs.add(e));

		return hs;
	}

	public static ArrayList<String> evenWords(String str) {

		ArrayList<String> evenWords = new ArrayList<>();
		String newStr = str.replaceAll("[^A-Za-z\\s]", "");
		Arrays.stream(newStr.split(" ")).filter(word -> word.length() % 2 == 0 && !word.equals(""))
				.forEach(elm -> evenWords.add(elm));
		;

		return evenWords;

	}

	public static ArrayList<String> fizzBuzz() {
		ArrayList<String> fb = new ArrayList<>();
		fb.add("0");

		IntStream.rangeClosed(1, 100).forEach(i -> {
			fb.add(i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : Integer.toString(i)));
		});
		return fb;

	}
}