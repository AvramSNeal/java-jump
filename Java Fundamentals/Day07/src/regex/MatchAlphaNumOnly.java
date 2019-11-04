package regex;

//Create a regular expression that accepts alphanumeric characters only. 
//Its length must be six characters long. 

import java.util.regex.*;
public class MatchAlphaNumOnly {
	
	public static void main(String args[]) {
		System.out.println(Pattern.matches("[0-9a-zA-Z]{6}", "R2D2"));
		System.out.println(Pattern.matches("[0-9a-zA-Z]{6}", "R2D2c3p0"));
		System.out.println(Pattern.matches("[0-9a-zA-Z]{6}", "R2D2dd"));
		System.out.println(Pattern.matches("[wW]{1}[0-9a-zA-Z]{7}", "wkR2D2dd"));
	}
}
