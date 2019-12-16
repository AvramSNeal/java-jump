package com.collabera.jump.other;

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder stb = new StringBuilder();
        
        // Technically, Madam is a palindrome, but
        // to avoid getting a "false" in some cases,
        // set the string to lower case.
        A = A.toLowerCase(); 
        
        stb.append(A);
        
        stb = stb.reverse();
        
        if(stb.toString().equals(A)) System.out.println("Yes");
        if(!stb.toString().equals(A)) System.out.println("No");
        
    }
}



