package celsius_to_farenheit;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		
		double input=Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in celsius: "));
		
		JOptionPane.showMessageDialog(null, "Temperature in farenheit: "+((1.8*input)+32));
		
		
		
		
		
	}

}
