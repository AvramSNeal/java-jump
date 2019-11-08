package lambda;

interface Drawable2{
	public void draw();
}
public class LambdaExpression {
	public static void main(String[] args) {
		int width = 10;

		Drawable2 d2 = ()->{System.out.println("Drawing width: " + width);};

		d2.draw();
	}
}
