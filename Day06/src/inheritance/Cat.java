package inheritance;

public class Cat extends Pet{
	public Cat() {
		setName("Unknown Cat");
	}
	public String speak() {
		return "CAT: Don't give me orders! I'll speak only when I want to.";
	}
}
