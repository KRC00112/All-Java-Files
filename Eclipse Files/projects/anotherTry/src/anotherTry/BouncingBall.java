package anotherTry;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BouncingBall  extends JPanel implements ActionListener{
	
	Timer timer;
	int x=100;
	int y=100;
	int speed=50;
	int xSpeed=speed;
	int ySpeed=speed;
	boolean t=false;
	
	BouncingBall(){
		
		this.setPreferredSize(new Dimension(700,500));
		
		
		timer=new Timer(10,this);
		timer.start();
		
		
		
		
		
		
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.red);
		g.fillOval(x, y, 50, 50);
		if(t==true) {
			g.drawString("Hit", 10, 20);
		
		}
		
		
		
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		x=x+xSpeed;
		y=y+ySpeed;
		
		if(x+50>=this.getWidth()||x<0) {
			
			xSpeed=-xSpeed;
			t=true;
			
		}
		
		else if((x+50<=this.getWidth()||x>0)) {
			
			t=false;
			
		}
		if(y+50>=this.getHeight()||y<0) {
			
			ySpeed=-ySpeed;
			t=true;
			
		}
		
		
		else if(y+50<=this.getHeight()||y>0) {
			
			t=false;
			
		}
		
		
		repaint();
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new BouncingBall());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
		
		

	}


	

}
