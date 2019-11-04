package wk2project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculatorActionListener implements ActionListener{
	String value1, value2;
	String operator;
	int v1, v2, result;

	private JTextField textField;

	public CalculatorActionListener(JTextField textField) {
		this.textField = textField;
	}
	
	public void evaluateValues() {
		switch(operator) {
		case "x":
			v1 = Integer.parseInt(value1);
			v2 = Integer.parseInt(value2);
			result = v1*v2;
			break;
		case "/":
			if (value2.equals("0")) {
				System.out.println("Result is UNDEFINED. Cannot divide by 0");
			} else {
				v1 = Integer.parseInt(value1);
				v2 = Integer.parseInt(value2);
				result = v1/v2;
			}
			break;
		case "+":
			v1 = Integer.parseInt(value1);
			v2 = Integer.parseInt(value2);
			result = v1+v2;
			break;
		case "-":
			v1 = Integer.parseInt(value1);
			v2 = Integer.parseInt(value2);
			result = v1-v2;
			break;
		case "%":
			v1 = Integer.parseInt(value1);
			v2 = Integer.parseInt(value2);
			result = v1%v2;
			break;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent: " + e.getActionCommand());
		//switch (e.getActionCommand()) {
		// ...
		
		switch(e.getActionCommand()) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9": 
				textField.setText(textField.getText()+e.getActionCommand());
				break;
			case "x":
			case "/":
			case "+":
			case "-":
			case "%":
				if (textField.getText().isEmpty()==true) {
					System.out.println("Text Field is empty. Please enter a value in the calculator!");
				} else {
					value1 = textField.getText();
					textField.setText(null);
					operator = e.getActionCommand();
				}
				break;
			case "U":
				if (textField.getText().charAt(0)=='-') {
					textField.setText(textField.getText().substring(1));
				} else {
					textField.setText("-" + textField.getText());
				}
				break;			
			case "=":
				if (textField.getText().isEmpty()==true) {
					System.out.println("Text Field is empty. Please enter a value in the calculator!");
				} else {
					value2 = textField.getText();
					evaluateValues();
					textField.setText(Integer.toString(result));
				}
				break;
			case "C":
				value1 = null;
				value2 = null;
				textField.setText(null);
				break;		
			default: 
				System.out.println("I cannot do that Dave. Error.");
				break;
		}
	}
}