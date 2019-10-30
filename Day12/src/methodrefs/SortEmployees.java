package methodrefs;

import java.util.*;

public class SortEmployees {

	public static void main(String[] args) {
		Employee[] employees = {
				new Employee("David"),
				new Employee("Naveen"),
				new Employee("Alex"),
				new Employee("Richard")};
		System.out.println("Before Sorting Names: " + Arrays.toString(employees));
		Arrays.sort(employees, Employee::nameCompare);
		System.out.println("After Sorting Names: " + Arrays.toString(employees));

	}

}

class Employee {
	String name;
	Employee(String name){
		this.name = name;
	}
	public static int nameCompare(Employee a1, Employee a2) {
		
		//return a1.name.compareTo(a2.name); // Ascending by lexicographical order
		//return -a1.name.compareTo(a2.name); // Descending by lexicographical order
		return a1.name.length()-a2.name.length(); // Ascending by length
		//return a2.name.length()-a1.name.length(); // Descending by length
	}
	public String toString() {
		return name;
	}
}
