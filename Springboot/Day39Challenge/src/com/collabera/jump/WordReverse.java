package com.collabera.jump;

import java.util.Arrays;
import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		wordFlip(input.nextLine());

		input.close();
	}
	
	private static void wordFlip(String string) {
		
		String words[] = string.split(" ");
		
		
		for(int i =0; i<words.length;i++) {
			StringBuffer sbf = new StringBuffer(words[i]);
			words[i] = sbf.reverse().toString();
			System.out.println(words[i]);
			
		}
		System.out.println(Arrays.toString(words));
	}

}
