package com.collabera;
// vvv PUT CODE BELOW THIS vvv

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	// This program checks if the grade it divisible by 5 and if it is not, it makes other adjustments
	public static void main(String[] args) throws IOException {

		int upperGrade;
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38); // Test
		grades.add(33);
		
        for(int grade : grades){
            upperGrade = grade + (5 - grade%5);
            if((upperGrade-grade)<3&&grade>=38) grades.set(grades.indexOf(grade), upperGrade);
            System.out.println(upperGrade); 
        }

        System.out.println(grades.toString());

	}
}
