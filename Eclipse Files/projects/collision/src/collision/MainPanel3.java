package collision;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MainPanel3 extends JPanel implements KeyListener{
	
	
	String status="No!";
	
	Font font=new Font("Courier",Font.BOLD,20);
	
	int rX=50;
	int rY=50;
	
	int bX=450;
	int bY=300;
	
	
	
	int oSpeed=10;
	int xSpeed=oSpeed;
	int ySpeed=oSpeed;
	
	
	
	MainPanel3(){
		
		
		this.setPreferredSize(new Dimension(1000,700));
		
		this.setFocusable(true);
		this.addKeyListener(this);
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.fillRect(bX, bY,120, 120);
		g.setColor(Color.white);
		
		g.setFont(font);
		
		g.drawString(status, 495, 360);
		
		
		g.setColor(Color.red);
		g.fillRect(rX, rY,120, 120);
		
		
		
		
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
		
		
		if(keyCode==e.VK_LEFT) {
			
			rX=rX-oSpeed;
			
			checkCollision();
			
	
			
			
		}
		if(keyCode==e.VK_RIGHT) {
					
			rX=rX+oSpeed;
			
			checkCollision();
	
					
		}
				
		if(keyCode==e.VK_UP) {
			
			rY=rY-oSpeed;
			
			checkCollision();
			

			
		}
		
		if(keyCode==e.VK_DOWN) {
			
			rY=rY+oSpeed;
			
			checkCollision();
			
	
			
			
			
		}

		
		
		
		
	}
	
	public void checkCollision() {
		
		if(rX<bX+120&&rX+120>bX&&rY<bY+120&&rY+120>bY) {
			
			
			status="Yes!";
		}
		else {
			
			status="No!";

			
		}
		
		
		
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
