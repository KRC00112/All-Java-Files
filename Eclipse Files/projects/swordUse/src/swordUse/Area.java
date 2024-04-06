package swordUse;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Area extends JPanel implements KeyListener,ActionListener{
	
	
	int playerX=100;
	int playerY=100;
	
	
	int swordX=playerX;
	int swordY=playerY;
	
	boolean pressed=false;
	
	
	
	
	Timer timer;
	
	
	Area(){
		
		this.setPreferredSize(new Dimension(1000,700));
		timer=new  Timer(10,this);
		timer.start();
		this.setFocusable(true);
		this.addKeyListener(this);
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		
		super.paintComponent(g);
		
		g.setColor(Color.red);
		g.fillOval(swordX, swordY, 100, 50);
		g.setColor(Color.black);
		g.fillRect(playerX, playerY, 100, 50);
		

		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode()==e.VK_RIGHT) {
			
			playerX=playerX+10;
			swordX=swordX+10;
			
		}
		if(e.getKeyCode()==e.VK_LEFT) {
					
					playerX=playerX-10;
					swordX=swordX-10;

					
				}
		if(e.getKeyCode()==e.VK_UP) {
			
			playerY=playerY-10;
			swordY=swordY-10;

			
		}
		if(e.getKeyCode()==e.VK_DOWN) {
			
			playerY=playerY+10;
			swordY=swordY+10;

			
		}
		
		if(e.getKeyCode()==e.VK_ENTER) {
			
			
			pressed=true;
			
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
		
		
		if(pressed==true) {
			swordX=swordX+10;
			
			if(swordX>playerX+30) {
				
				swordX=playerX;
			}
			
			
		}
		
		repaint();
		
		
	}
	
	
	
	
	
	
	
	

}
