package anotherTry;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	
	public static void main (String[]args) {
		
		JFrame frame=new JFrame();
		
		frame.setTitle("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(new Animation());
		frame.setUndecorated(true);

		frame.pack();
		frame.setLocationRelativeTo(null);
		
		
		
		
		
		
		frame.setVisible(true);
		

		
		
		
	}

}
