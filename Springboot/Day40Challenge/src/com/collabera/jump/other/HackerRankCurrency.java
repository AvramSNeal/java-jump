package com.collabera.jump.other;

import java.text.NumberFormat;
import java.util.Locale;

public class HackerRankCurrency {
    
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        double payment = 12324.134;
        //double payment = scanner.nextDouble();
        //scanner.close();
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}