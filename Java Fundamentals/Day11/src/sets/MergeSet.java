package sets;

import java.util.*;

public class MergeSet {

	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b){
		// Creating an empty set
		// Set<T> mergedSet = new HashSet<T>();
		Set<T> mergedSet = new TreeSet<T>();
		
		// add the two sets to be merged into the new set
		mergedSet.addAll(a);
		mergedSet.addAll(b);
		
		// returning the merged set
		return mergedSet;
	}
	
	public static void main(String[] args) {
		
		//Creating the sets to be merged
		// First set
		// Set<Integer> a = new HashSet<Integer>();
		Set<Integer> a = new TreeSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,5,7,9}));
		boolean ret = a.add(1); //tries to add value to the set and returns boolean true or false
		System.out.println("a.add(1) returns: " + ret);
		
		// Second set
		// Set<Integer> b = new HashSet<Integer>();
		Set<Integer> b = new TreeSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {0,2,4,5,6,8}));
		// Printing the sets
		System.out.println("Set a: " + a);
		System.out.println("Set b: " + b);
		// calling mergeSets()
		System.out.println("Merged Set: " + mergeSet(a, b));
	}
	
}
