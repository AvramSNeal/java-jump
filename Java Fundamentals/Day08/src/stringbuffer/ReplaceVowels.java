package stringbuffer;


import javax.swing.*;
public class ReplaceVowels {
	
	public static void main(String args[]) {
//		char letter;

		String inSentence = JOptionPane.showInputDialog(null, "Sentence:");
	
//		StringBuffer tempStringBuffer = new StringBuffer(inSentence);
//	
//		int numberOfCharacters = tempStringBuffer.length();
//	
//		for (int index = 0; index < numberOfCharacters; index++) {
//	
//		letter = tempStringBuffer.charAt(index);
//	
//			if (
//			letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' ||
//		
//			letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' ||
//		
//			letter == 'u' || letter == 'U' ) {
//		
//			tempStringBuffer.setCharAt(index,'X');
//	
//			}
//
//		}
//	JOptionPane.showMessageDialog(null, tempStringBuffer );
	String replaced = inSentence.replaceAll("[aeiouAEIOU]", "X");
	JOptionPane.showMessageDialog(null, replaced );
	
	}
	
}


