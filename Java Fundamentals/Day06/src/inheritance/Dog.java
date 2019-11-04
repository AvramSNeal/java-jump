package inheritance;

public class Dog extends Pet{
	public Dog() {
		setName("Unknown Dog");
	}
	public String fetch() {
		return "DOG: Yes, master. Fetch I will";
	}
}
