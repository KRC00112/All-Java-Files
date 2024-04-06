package collision;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MainPanel4 extends JPanel implements KeyListener,ActionListener{
	
	
	int x=100;
	int y=500;
	Timer timer;
	int jump=60;
	
	MainPanel4(){
		
		this.setPreferredSize(new Dimension(1000,700));
		this.setFocusable(true);
		this.addKeyListener(this);
		timer=new Timer(10, this);//after ecery ten milisec the object will move by i ppixel along x axis since xvelocity=1
		timer.start();
		
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		
		
		super.paintComponent(g);
		
		g.setColor(Color.red);
		g.fillOval(x, y, 80, 80);
		
		
		
		 
		
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int keyCode=e.getKeyCode();
		
		
		if(keyCode==e.VK_SPACE) {
			
			
			int goAbove=y-jump;
			
			y=goAbove;
			
			
			
			
		}
		
		if(keyCode==e.VK_LEFT) {
			
			x=x-20;
			

			
		}
		if(keyCode==e.VK_RIGHT) {
					
			x=x+20;
			
	
					
		}
		
		
		
		repaint();
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	int above = 0;
		
		
		if(above==y) {
			
			
			y=above+jump;
			x=x+10;
			
			
		}
		
		repaint();
		
		
		
	}
	
	
	
	

}
