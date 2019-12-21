package com.collabera;
// vvv PUT CODE BELOW THIS vvv

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		int time = Integer.parseInt(s.substring(0,2));
        String tAbb = s.substring(s.length()-2, s.length());
        s=s.substring(0,s.length()-2);
        
        if(tAbb.contains("AM")&&time==12) {
            s="00"+s.substring(2);
            System.out.println(tAbb);
        }
        else if(tAbb.contains("PM")&&time!=12) {
            s=""+(time+12)+s.substring(2);
            System.out.println(tAbb);
        }
        System.out.println(tAbb);
        return s;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = scan.nextLine();

		String result = timeConversion(s);

		System.out.println(result);

	}
}
