package helloworld;
/*
 * In this Let's Play I'll be attempting GUI magic!
 * What I mean is, I'm going to be Displaying a Window.
 * Very Fundamental you say? I couldn't agree more.
 */

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJavaProgram {

	public static void main(String[] args) {
		JFrame	myWindow;
		JLabel 	myLabel;
		
		
		myWindow = new JFrame();
		myLabel = new JLabel("");
		
		myWindow.setSize(1600, 900);
		myWindow.setLayout(new BorderLayout());
		myWindow.add(new JLabel("     Hello Java World!"), BorderLayout.CENTER);
//		myWindow.pack();
		myLabel.setText("Hello World");
		myWindow.setVisible(true);
		
	}
}
