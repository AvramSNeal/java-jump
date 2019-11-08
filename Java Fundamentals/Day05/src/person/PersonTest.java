package person;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {

		String	name, inpStr;
		int age;
		char gender;
		
		Person[] persons;
		persons = new Person[2];
		//persons[0] = new Person();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<persons.length; i++) {
			System.out.println("Enter name:");
			name = scanner.next();
			
			System.out.println("Enter age:");
			age = scanner.nextInt();
			
			System.out.println("Enter gender:");
			inpStr = scanner.next();
			gender = inpStr.charAt(0);
			
			persons[i] = new Person();
			
			persons[i].setName(name);
			persons[i].setAge(age);
			persons[i].setGender(gender);
			
			for(int j=0; j<=i; j++) {
				System.out.println("~~~~~~~~~~");
				System.out.println(persons[j].getName());
				System.out.println(persons[j].getAge());
				System.out.println(persons[j].getGender());
				System.out.println("~~~~~~~~~~");
			}
			
			
			
		}
		scanner.close();
		
		int minIdx=0;
		int maxIdx=0;
		
		for(int i=1; i<persons.length; i++) {
			if(persons[i].getAge()<persons[minIdx].getAge()) {
				minIdx=i;
			}else if(persons[i].getAge()>persons[maxIdx].getAge()) {
				maxIdx=i;
			}
		}
		
		System.out.println(persons[minIdx].getName() + " is the youngest.");
		System.out.println(persons[maxIdx].getName() + " is the oldest.");
		
		for(Person p:persons) {
			System.out.println("~~~~~~~~~~");
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getGender());
			System.out.println("~~~~~~~~~~");
		}
	}

}
