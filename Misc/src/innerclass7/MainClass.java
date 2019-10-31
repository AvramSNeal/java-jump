package innerclass7;

class ABC{
	class XYZ{
		String s = "Inner - XYZ";
	}
}

class XYZ extends ABC{
	String s = "Out - XYZ";
	
	class ABC extends XYZ{
		
	}
}

public class MainClass {
	
	public static void main(String[] args) {
		XYZ obj1 = new XYZ();
		XYZ.ABC obj2 = new XYZ(). new ABC();
		ABC.XYZ obj3 = new ABC(). new XYZ();
		
		System.out.println(new XYZ().new ABC().s);
		System.out.println(obj1.s);
		System.out.println(obj2.s);
		System.out.println(obj3.s);
	}
}
