package helloworld;

public class Substrings {

	public static void main(String[] args) {
		//				0123456789012345
		String text = 	"Hello World Java";
		
		System.out.println(text);

		System.out.println(text.substring(2, 4));
		System.out.println(text.substring(6, 11));
		System.out.println(text.substring(12, 16));
		System.out.println(text.substring(3, 3));
		System.out.println(text.indexOf("Java"));
		System.out.println(text.substring(7));	
		System.out.println("Hashcode:" + text.hashCode());
		
		
		StringBuffer buff = new StringBuffer();
		buff.append("This");
		buff.append(" ");
		buff.append("is");
		buff.append(" ");
		buff.append("Sparta!");
		System.out.println(buff.toString());
		
		System.out.println(text);
		
		String reverse = "";
		for(int i = text.length() - 1; i>=0; i--) {
			reverse = reverse + text.charAt(i);
			
		}
		System.out.println(reverse);
		
		

	}

}
