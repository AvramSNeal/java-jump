package cloning;

//Contains a reference of Test and implements
//clone with deep copy.

public class Test2 implements Cloneable {

	int a, b;
	
	Test c = new Test();
	
	public Object clone() throws CloneNotSupportedException{
		
		Test2 tobj = null;
		
		try {
			tobj = (Test2)super.clone(); // copies fields

			tobj.c = new Test();
			tobj.c.x = c.x;
			tobj.c.y = c.y;
			
			
		} catch(CloneNotSupportedException e) {
			
		}
		return tobj;
		
	}

}
