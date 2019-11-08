package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements {

	public static void main(String[] args) {
		//Create a list and add some colors to the list
		List<String> c1 = new ArrayList<String>();
		
		c1.add("Red");
		c1.add("Green");
		c1.add("Blue");
		c1.add("Orange");
		c1.add("Purple");
		c1.add("White");
		c1.add("Black");
		
		System.out.println("List before swapping:\n");
		for(String a : c1) {
			System.out.println(a);
		}
		
		//Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(c1, 0, 2);
		System.out.println("List after swapping:\n");
		for(String b : c1) {
			System.out.println(b);
		}
	}

}
