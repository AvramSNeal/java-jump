package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Person> friends;
		Person person;
		
		friends = new ArrayList<Person>();
		
		person = new Person("Rose DeWitt Bukater", 19, 'F');
		friends.add(person);
		person = new Person("Jack Dawson", 20, 'M');
		friends.add(person);
		
		Person p1 = friends.get(1);
		Person p2 = friends.get(0);
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
