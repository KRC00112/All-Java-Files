package twoDGraphics;

import java.awt.*;

import javax.swing.*;

public class MyFrame {
	
	JFrame frame=new JFrame();
	MyPanel panel=new MyPanel();
	
	MyFrame(){
		
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		
		frame.setVisible(true);
		
	}
	

	
	
	

}
