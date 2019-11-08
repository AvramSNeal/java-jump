package person;

public class Person {
	
	private String name;
	public int age;
	public char gender;
	
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString(String array) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		return array;
	}
	

}
