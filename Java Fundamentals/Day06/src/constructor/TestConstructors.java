package constructor;

public class TestConstructors {

	public static void main(String[] args) {
		Person person = new Person();
		Person person1 = new Person("Smith");
		
		System.out.println("Person name: " + person.getName());
		System.out.println("Person name: " + person1.getName());
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(7);
		Rectangle r3 = new Rectangle(4, 3);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r3.area());
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(3);
		Fraction f3 = new Fraction(5,9);
		Fraction f4 = new Fraction(f3);
		
		System.out.println(f1.compute());
		System.out.println(f2.compute());
		System.out.println(f3.compute());
		System.out.println(f4.compute());
		
		
		Clock clock = new Clock();
		Clock clock2 = new Clock(3);
		Clock clock3 = new Clock(2,30);
		
		System.out.println("Time stamp: " + clock.toString());
		System.out.println("Time stamp: " + clock2.toString());
		System.out.println("Time stamp: " + clock3.toString());
		
	}

}
