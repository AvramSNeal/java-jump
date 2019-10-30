package maps;

import java.util.HashMap;

public class CheckMapping {

	public static void main(String[] args) {
		//Create an empty hash map
		HashMap<String,Integer> hash_map = new HashMap<String,Integer>();
		//use put() method to put values in the hash set
		hash_map.put("Red", 1);
		hash_map.put("Green",2);
		hash_map.put("Blue",3);
		hash_map.put("Orange",4);
		hash_map.put("Purple",5);
		hash_map.put("Pink",6);
		hash_map.put("White",7);
		hash_map.put("Black",8);
		
		//print the map
		System.out.println("The Original map: " + hash_map);
		System.out.println("1. Does key 'Green' exists?");
		if (hash_map.containsKey("Green")) {
			//key exists
			System.out.println("Yes! - " + hash_map.get("Green"));
		} else {
			//key does not exists
			System.out.println("No!");
		}
		System.out.println("1. Does key 'Orange' exists?");
		if (hash_map.containsKey("Orange")) {
			System.out.println("Yes! - " + hash_map.get("Orange"));
		} else {
			System.out.println("No!");
		}

	}

}
