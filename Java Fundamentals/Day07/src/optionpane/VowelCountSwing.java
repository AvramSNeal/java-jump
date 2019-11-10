package optionpane;

import javax.swing.*;
public class VowelCountSwing {
	JFrame f;
	VowelCountSwing(){
		f = new JFrame();
	}
	
	void showMessage(String msg) {
		JOptionPane.showMessageDialog(f, msg);
	}
	
	public static String vowelCount(String word) {
		
		char letter;
		
		int numberOfCharacters = word.length();
		
		int vowelCount = 0;
		int vowelYCount = 0;
		int vowelTotal = 0;
		
		for (int i = 0; i < numberOfCharacters; i++) {
		
			letter = word.charAt(i);
			
			if (
			letter == 'a' || letter == 'A' ||
			
			letter == 'e' || letter == 'E' ||
			
			letter == 'i' || letter == 'I' ||
			
			letter == 'o' || letter == 'O' ||
			
			letter == 'u' || letter == 'U'
			) {
			
				vowelCount++;
			
			}else if (letter == 'y' || letter == 'Y') {
				vowelYCount++;
			}
		
		}
		
		vowelTotal = vowelYCount + vowelCount;
		
		return "Your word has " + vowelCount + " vowels... or maybe " + vowelTotal;
		
	}
	
	public static void main(String args[]) {
		VowelCountSwing obj = new VowelCountSwing();
		String m = JOptionPane.showInputDialog("Your input: ", "Enter your input here");
		System.out.println(m);
		System.out.println(vowelCount(m));
		obj.showMessage("Custom Message: " + m + ". " + vowelCount(m));
		
	}
	
}


