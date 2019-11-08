package hashset;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Convert {

	public static void main(String[] args) {

		HashSet<String> h_set = new HashSet<String>();
		
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Blue");
		h_set.add("Orange");
		h_set.add("Purple");
		h_set.add("Pink");
		h_set.add("White");
		h_set.add("Black");
		
		System.out.println("Original Hash Set: " + h_set);
		//Creating an Array
		String[] new_array = new String[h_set.size()];
		h_set.toArray(new_array);
		
		//Displaying Array elements
		System.out.println("Array Elements: ");
		for(String element : new_array) {
			System.out.println(element);
		}
		
		//Create a TreeSet of HashSet elements
		Set<String> tree_set = new TreeSet<String>(h_set);
		
		//Display TreeSet elements
		System.out.println("TreeSet elements: ");
		for(String element : tree_set) {
			System.out.println(element);
		}
		
		//Create a List from HashSet elements
		List<String> list = new ArrayList<String>(h_set);
		
		//Display ArrayList elements
		System.out.println("ArrayList contains: " + list);
		
	}

}
