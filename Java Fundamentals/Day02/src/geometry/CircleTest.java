package geometry;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setRadius(7);
		
		System.out.println("Radius of the circle: " + circle.getRadius());
		
		System.out.println("Diameter of the circle: " + circle.getDiameter());
		
		System.out.println("Circumference of the circle: " + circle.getCircumference());
		
		System.out.println("Area of the circle: " + circle.getArea());

	}

}
