package com.example.demo;

public class BinarySearcgImpl {
	
	SortAlogrithm sortAlg;
	
	// Constructor
	BinarySearcgImpl(SortAlogrithm sortAlg){
		sortAlg = sortAlg;
	}
	
	// or
	
	// Get and setters
	
	public int search(int[] list, int value) {	
		// sort
		
		int[] sortedList = sortAlg.sort(list);
		// search logic found in the position 	
		return 1;
	}
}
