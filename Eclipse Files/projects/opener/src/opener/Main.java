package opener;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {
	
	
	static JFrame frame;
	public static void main(String[]args) {
		
		
		
		frame=new JFrame();	
		frame.setTitle("A Simple Door Opening Game I am proud of");
		frame.setResizable(false);
		frame.add(new Playground());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		
		
		
	}
	

	
	

}
