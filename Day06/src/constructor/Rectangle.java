package constructor;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		setWidth(0);
		setHeight(0);
	}
	
	public Rectangle(int w) {
		setWidth(w);
		setHeight(w);
	}
	
	public Rectangle(int w, int h) {
		setWidth(w);
		setHeight(h);
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return getWidth() * getHeight();
		
	}
}
