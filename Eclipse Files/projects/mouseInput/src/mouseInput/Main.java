package mouseInput;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		JFrame frame=new JFrame();
		frame.setTitle("Mouse Input");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Mouse());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		

	}
	
	
	
	
	
	

	

}
