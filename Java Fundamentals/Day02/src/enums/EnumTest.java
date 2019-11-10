package enums;

import enums.Enum.*;

public class EnumTest {
	

	public static void main(String[] args) {
		
		enumTest();
	}
	
	@SuppressWarnings("unused")
	public static void enumTest() {		
		Enum.Fruit f1, f2, f3, f4, f5;
		f1 = Enum.Fruit.APPLE;
		f2 = f1;
		f3 = Fruit.BANANA;
		f4 = Fruit.PINEAPPLE;
		f5 = Fruit.PEN;

		System.out.println("Favorite Fruit is ");
		
		Fruit favoriteFruit = f5;
		
		switch(favoriteFruit) {
		case APPLE: System.out.print("APPLE ") ;
			break;
		case ORANGE: System.out.print("ORANGE ") ;
			break;
		case BANANA: System.out.println("BANANA ") ;
			break;
		case PINEAPPLE: System.out.print("PINEAPPLE ") ;
			break;
		case PEN: System.out.print("PEN ") ;
			break;
		default: System.out.println("") ;
			break;
		}
		
		System.out.println(f4 + " " + f1 + " " + f5);

}
}
