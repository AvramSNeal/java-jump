package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringfeaturesApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringfeaturesApplication.class, args);
		
		// 1. Console based
		// 2. Swing [Desktop based application]
		// 3. web applications
		
		// BinarySearch  - DNC
		
		// 1. data should be sorted 
		// 2. search operation
		
		
		// accept the input
		// value to search
		
		// Write a logic to search
		
		 System.out.println("Enter 1 - quick sort \n 2 - bubble sort");
		
		// scan the value to a variable
		
		// configuration files spring framework you write xml files to inject the objects 
		
		int val=2;
		BinarySearcgImpl binarySearch;
		if(val == 2)
			 binarySearch = new BinarySearcgImpl(new BubbleSort());
		else
			 binarySearch = new BinarySearcgImpl(new QuickSort());
		
		// to use bubble sort or quick sort before i do the search
		
		binarySearch.search(new int[] {2,3,4,6}, 1);
		
	}

}
