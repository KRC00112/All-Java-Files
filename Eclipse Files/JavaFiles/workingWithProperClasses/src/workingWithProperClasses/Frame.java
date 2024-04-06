package workingWithProperClasses;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Frame {
	
	
	
		
		 void displayWindow() {
		        JFrame window = new JFrame("window");
		        window.setSize(600, 400);
		        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        window.setLayout(null);
		       

		        Buttons button1 = new Buttons();
		        button1.text = "click me";
		        button1.x = 300;
		        button1.y=200;
		        button1.w=100;
		        button1.h=20;
		        
		        window.add(button1.displayButton());
		        window.setVisible(true);
		 
		 }
		 
	
	
	

}
