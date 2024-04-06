package collision;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MainPanel2 extends JPanel implements KeyListener {
	
	
	

	Font font=new Font("Arial",Font.BOLD,50);
	int rSqX;
	int rSqY;
	int bSqX;
	int bsqY;
	int bWidth;
	int bHeight;
	
	
	MainPanel2(){
		
		
		this.setPreferredSize(new Dimension(1366,768));
		
		bSqX=750;
		bsqY=80;
		
		bWidth=300;
		bHeight=300;

		
		
		rSqX=560;
		rSqY=80;
		
		this.setFocusable(true);
		this.addKeyListener(this);
		
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.blue);
		g.fillRect(bSqX,bsqY, bWidth,bHeight);
		
		g.setColor(Color.red);
		g.fillRect(rSqX, rSqY, 100, 100);
		
	
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
			
			if(keyCode>=bSqX) {
				
				rSqX=bSqX;
				
				
			}
			else {
				
				rSqX=rSqX+5;
				
			}
			
			
			
			
			
		}
		
	if(keyCode==e.VK_LEFT) {
			
			if(keyCode<=bSqX+bWidth) {
				
				rSqX=bSqX+bWidth;
				
				
			}
			else {
				
				rSqX=rSqX-5;
				
			}
			
			
			
			
			
		}
	
	if(keyCode==e.VK_UP) {
		
		if(keyCode<=bsqY+bHeight) {
			
			rSqY=bsqY+bHeight;
			
			
		}
		else {
			
			rSqY=bsqY-5;
			
		}
		
		
		
		
		
	}
	
	if(keyCode==e.VK_DOWN) {
		
		if(keyCode>=bsqY) {
			
			rSqY=bsqY;
			
			
		}
		else {
			
			rSqY=rSqY+5;
			
		}
		
		
		
		
		
	}
		
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
