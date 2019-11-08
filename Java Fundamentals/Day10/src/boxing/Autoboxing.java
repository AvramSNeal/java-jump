package boxing;

public class Autoboxing {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Integer i = 10;
		int value = Integer.parseInt("100012");
		System.out.println(value);
		
		String valueTest = value + "";
		String valueText1 = Integer.toString(value);
		
		Float floatValue = Float.parseFloat("3.444444");
		System.out.println(floatValue);
		
		Boolean flag = false;
		boolean flagPremitive = false;
		
		flag = flagPremitive;
		flagPremitive = flag;

	}

}
