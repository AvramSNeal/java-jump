package staticnested;

public class App {
	public static void main(String args[]) {
		
		//You can access static methods like this
		StaticNested.Inner.msg();
		
		//Or you can access other members by creating an instance
		StaticNested nest = new StaticNested();
		System.out.println(nest.x);
	}
}
