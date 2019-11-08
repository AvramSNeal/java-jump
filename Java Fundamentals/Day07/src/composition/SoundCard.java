package composition;

public class SoundCard {
	private String brand;
	
	public SoundCard(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	@Override
	public String toString() {
		return "Sound Card{" + "brand=" + brand + "}";
	}
}
