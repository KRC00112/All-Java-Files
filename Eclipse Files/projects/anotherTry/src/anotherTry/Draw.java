package anotherTry;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Draw extends JPanel implements KeyListener,Runnable{
	
	Thread thread=new Thread(this);
	int x,y,logo_x,logo_y,xDirection,yDirection;
	int radius=11;
	int  WIDTH=500;
	int HEIGHT=500;
	Font font=new Font("Arial",Font.BOLD,50);
	
	Image logo;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			while(true) {
				
				
				move();
				Thread.sleep(5);
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void setXDirection(int xdir) {
		
		xDirection=xdir;
		
	}
	
	public void setYDirection(int ydir) {
			
			yDirection=ydir;
			
	}
	
	
	
	public void move() {
		x=x+xDirection;
		y=y+yDirection;
		
		if(x<=0) {
			x=0;
		}
		if(x>=WIDTH-radius) {
			x=WIDTH-radius;
		}
		if(y<=0) {
			y=0;
		}
		if(y>=HEIGHT-radius) {
			y=HEIGHT-radius;
		}
		
	}
	

	
	
	
	
	Draw(){
		
		ImageIcon i=new ImageIcon("hf-logo.png");
		logo=i.getImage();
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setBackground(Color.ORANGE);
		logo_x=20;
		logo_y=15;
		x=258;
		y=71;
		
		this.setFocusable(true);
		this.addKeyListener(this);
		thread.start();
		
		
		
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		g.setFont(font);
		g.setColor(Color.black);

		g.drawString("Hello", 130, 80);
		
		g.setColor(Color.black);
		g.fillRect(260, 40, 7, 25);
		
		g.setColor(Color.black);
		g.fillOval(x, y, radius, radius);
		g.drawImage(logo,logo_x,logo_y,this);
		
		
		repaint();
		
		
		
		
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int keyCode=e.getKeyCode();
		
		if(keyCode==e.VK_RIGHT) {
			
			
			setXDirection(1);
			
		
		}
		if(keyCode==e.VK_LEFT) {
			
			setXDirection(-1);

				
		}
		if(keyCode==e.VK_UP) {
			
			setYDirection(-1);

			
		}
		if(keyCode==e.VK_DOWN) {
			
			setYDirection(1);

		
		}
	
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	int keyCode=e.getKeyCode();
		
		if(keyCode==e.VK_RIGHT) {
			
			setXDirection(0);

			
		}
		if(keyCode==e.VK_LEFT) {
			
			setXDirection(0);

				
		}
		if(keyCode==e.VK_UP) {
			
			setYDirection(0);

			
		}
		if(keyCode==e.VK_DOWN) {
			
			setYDirection(0);

		
		}
		
		
	}

	
	
	
	
	

}
