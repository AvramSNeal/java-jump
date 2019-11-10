package regex;

public class Split {
	
	//In String class
	//public String[] split(String regexStr)
	public static void main(String[] args) {
		
		String source = "There are thiry_three big-apples";
		String[] tokens = source.split("\\s+|-|_"); //skip whitespaces(s) or - or _
		for (String token : tokens) {
			System.out.println(token);
		}
		String date = "12-13-2010";
		//extract day, month and year from this String 
		
		String[] tokens2 = date.split("-"); //skip -
		for (String token2 : tokens2) {
			System.out.println(token2);
		}
		

	}

}
