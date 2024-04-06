package workingWithProperClasses;

import javax.swing.JButton;

public class Buttons {

	String text;
	int x;
	int y;
	int w; 
	int h;
	JButton  displayButton() {
	
	JButton button=new JButton();
	button.setText(text);
	button.setBounds(x, y, w, h);
	
	return button;

	}
	
	

}
