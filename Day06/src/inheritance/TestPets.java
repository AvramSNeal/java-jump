package inheritance;

public class TestPets {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println(myDog.speak());
		System.out.println(myDog.fetch());
		
		Cat myCat = new Cat();
		System.out.println(myCat.speak());
		//System.out.println(myCat.fetch()); //Will generate an error.
		
	}
}
