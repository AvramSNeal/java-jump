package com.collabera.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String s = scan.nextLine();
     // Write your code here.
     

     s = s.replaceFirst("^(.*?)[^A-Za-z0-9]*", "");
     String words[] = s.split("[^A-Za-z0-9]+");
     int count = 0;
     
     Pattern p = Pattern.compile("[A-Za-z0-9]+");
     Matcher m = p.matcher(words[0]);
     boolean b = m.matches();
     
     if(b) {
     	
     	for(String word : words){
     		count++;
     	}
     	
     	System.out.println(count);
         for(String word : words){
             System.out.println(word);
         }
     } else { System.out.println(count);}
     


     scan.close();
 }
}

