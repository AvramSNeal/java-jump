package abstracts;

class TestAbstraction{
	public static void main(String args[]) {
		
		Shape s = new Circle();
		s.draw();
		s.normalMethod();
		s = new Rectangle();
		s.draw();
	}
}