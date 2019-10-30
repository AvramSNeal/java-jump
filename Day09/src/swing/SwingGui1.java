package swing;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingGui1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		
		Random rand = new Random();
		String[] words = {"Yes!", "Just like that!"};
		
		JButton button = new JButton(" Squeeze Here");
		button.addActionListener((e)->{button.setText(words[rand.nextInt(2)]);});
		frame.getContentPane().add(button);
		
		frame.setVisible(true);

	}

}
