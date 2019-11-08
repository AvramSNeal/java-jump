package geometry;

public class Circle {

	public double radius;
	public double area;
	public double circumference;
	
	
	public void setRadius(double r) {
		radius = r;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getCircumference() {
		return radius * 2 * 3.1415;
	}
	
	public double getArea() {
		return ((radius * radius) * 3.14);
	}

}
