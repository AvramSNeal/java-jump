package main;
// vvv PUT CODE BELOW THIS vvv


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        String words[] = s.split("[\\s*+\\\\!,?._'@]+");
        int count = 0;
        
        for(String word : words){
            count++;
        }
        
        System.out.println(count);
        for(String word : words){
            System.out.println(word);
        }


        scan.close();
    }
}

