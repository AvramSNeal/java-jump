package innerclass;

abstract class Person{
	abstract void eat();
}	
	

public class AnonymousInner {
	public static void main(String args[]) {
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("Generic Homo Sapien: Mmm [disgusting human chewing noise]. Nice fruits.");
			}
		};
		
		p.eat();
	}

}
