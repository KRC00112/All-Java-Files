package anotherTry;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Animation extends JPanel implements ActionListener,KeyListener{
	
	
	int bx=100;
	int by=20;
	int gx=50;
	int gy=by;
	Timer timer;
	int xVelocity=10;
	int yVelocity=5;
	boolean press=false;
	boolean showEnemy=true;
	boolean showBullet=true;
	int enemyx=900;
	int enemyy=300;
	
	
	
	
	Animation(){
		
		this.setPreferredSize(new Dimension(1000,700));
		this.setBackground(Color.white);
		timer=new Timer(10,this);
		timer.start();
		this.setFocusable(true);
		this.addKeyListener(this);
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("You can only fire a new bullet 2.5 seconds after the last bullet leaves the gun. ", 310, 10);
		
		if(showBullet==true) {
			g.setColor(Color.gray);
			g.fillOval(bx, by, 50, 50);
		}
		
	

		g.setColor(Color.black);
		g.fillRect(gx, gy, 100, 50);
		

		if(showEnemy==true) {
			

			enemy(g,enemyx,enemyy);
		
		}
		

	}
	
	public void enemy(Graphics g,int enemyx,int enemyy) {
		
		g.setColor(Color.orange);
		g.fillRect(enemyx, enemyy, 50, 50);
	
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			
		
		if(press==true) {
			bx=bx+xVelocity;

		
		
		}
		
		if(enemyx<=bx+46 && enemyy<=by+40 && enemyy>=by-40) {
			
			showEnemy=false;
			showBullet=false;
					
			
		}
		
		if(bx>this.getWidth()) {
			
			showBullet=true;
			bx=gx;
			by=gy;
			press=false;
		}
		
		
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode()==e.VK_ENTER) {
			press=true;
			
			
		}
		
		
		
		if(press==false) {
			if(e.getKeyCode()==e.VK_DOWN) {
				
				
				by=by+10;
				
			}
			
			if(e.getKeyCode()==e.VK_UP) {
				
				
				by=by-10;
			}
			
			if(by<=0) {
				
				by=0;
				
			}
			if(by>=this.getHeight()-50) {
				by=this.getHeight()-50;
			}
			
			
		}
		
		
		if(e.getKeyCode()==e.VK_DOWN) {
			
			
			gy=gy+10;
			
		}
		
		if(e.getKeyCode()==e.VK_UP) {
			
			
			gy=gy-10;
		}
		
		
		if(gy<=0) {
			
			gy=0;
			
		}
		if(gy>=this.getHeight()-50) {
			gy=this.getHeight()-50;
		}
		
		
		
		repaint();
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}