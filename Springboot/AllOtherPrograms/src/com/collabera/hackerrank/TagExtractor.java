package com.collabera.hackerrank;

import java.util.*;
import java.util.regex.*;

public class TagExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
			String line = in.nextLine();
			
			boolean isAMatch = false;
          	Pattern p = Pattern.compile("<(.+)>([^<]+)<\\/\\1>");
          	Matcher m = p.matcher(line);
          	
          	while(m.find()) {
          		System.out.println(m.group(2));
          		isAMatch = true;
          	}
          	if(!isAMatch)System.out.println("None");
			
			testCases--;
		}
		in.close();
	}
}