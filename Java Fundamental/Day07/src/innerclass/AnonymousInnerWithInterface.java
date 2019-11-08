package innerclass;

interface Eatable{
	void eat();
}	
	

public class AnonymousInnerWithInterface {
	public static void main(String args[]) {
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("Generic Homo Sapien: Mmm [disgusting human chewing noise]. Nice fruits.");
			}
		};
		
		e.eat();
	}

}
