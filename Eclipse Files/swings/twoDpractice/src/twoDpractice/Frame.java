package twoDpractice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{

	
	Panel panel=new Panel();
	
	Frame(){
		
		
//		this.setSize(1366, 768);
		this.getContentPane().setBackground(Color.white);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
//		this.setLocationRelativeTo(null);
		this.add(panel);
		this.pack();

		this.setVisible(true);
	
		
	
		
		
		
		
	}

	
	
	
	

}
