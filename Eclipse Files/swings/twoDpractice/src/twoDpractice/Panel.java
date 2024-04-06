package twoDpractice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer.*;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener {
	
	private int x = 300; // x-coordinate of the center of the circle
    private int y = 384; // y-coordinate of the center of the circle
    private int xVelocity = 20; 
	Timer timer;
	
	Panel(){
		
		this.setPreferredSize(new Dimension(1366,768));
		this.setBackground(Color.white);
		timer=new Timer(10, this);//after ecery ten milisec the object will move by i ppixel along x axis since xvelocity=1
		timer.start();
		
		
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d=(Graphics2D)g;
		
		g2d.setPaint(Color.black);
		g2d.setStroke(new BasicStroke(5));
//      g2D.drawLine(0, 0, 500, 500);

		g2d.drawArc(x, y, 200, 200, 0, 360);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		 x += xVelocity;
		 
		 if(x>=1366-400) {
			 xVelocity=0;
			 
		 }

	        // Repaint the panel to reflect the updated position of the circle
	        repaint();
		
		
		
	}
	
	

}
