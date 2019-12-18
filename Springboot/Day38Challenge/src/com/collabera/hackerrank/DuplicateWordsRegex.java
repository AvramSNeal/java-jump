package com.collabera.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsRegex {

	public static void main(String[] args) {

		String regex = "(\\b\\w+)(\\W\\1\\b)+"; // This is a regular expression that selects only words (\b\w+) that
												// have
												// multiple occurrences (\W\1\b)+
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // We compile a pattern with the regex and pass
																		// the
																		// parameter to ignore capitalization

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1)); // We take the group in its entirety and replace it
																	// with only the 1st occurrence m.group(1)
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();
	}

//vvv TEST CASES vvv
//Reya is is the the best player in eye eye game
//Goodbye bye world
//Sam went to his business

}
