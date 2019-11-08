package maps;

import java.util.*;

public class Create {

	public static void main(String[] args) {
		//Create an empty hash map
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
		//use put() method to put values in the hash set
		hash_map.put(1,"Red");
		hash_map.put(2,"Green");
		hash_map.put(3,"Blue");
		hash_map.put(4,"Orange");
		hash_map.put(5,"Purple");
		hash_map.put(6,"Pink");
		hash_map.put(7,"White");
		hash_map.put(8,"Black");
		
		System.out.println("Size of the hash map: " + hash_map.size());
		
		for(Map.Entry<Integer,String> x:hash_map.entrySet()) {
			System.out.println(x.getKey()+ " " + x.getValue());
		}
		
		//remove all mappings
		hash_map.clear();
		System.out.println("The New map: " + hash_map);
		
		
	}

}
