package blockBreaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Slider extends JPanel implements KeyListener,MouseMotionListener{
	
	
	JPanel hitter=new JPanel();
	
	
	
	int x=250;
	int y=0;
	
	Slider(){
		

		this.setLayout(null);
		this.setPreferredSize(new Dimension(600,20));
		this.setBackground(Color.black);
		this.setBounds(0, 730, 600, 20);

		hitter.setFocusable(true);
		hitter.addKeyListener(this);
		hitter.addMouseMotionListener(this);
		this.add(hitter);
		
		
		
		
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.red);
		g.fillRect(x, y, 130, 10);
		
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
			
			
			
			if(x<465) {
				x=x+10;
			}
				
			
			
			
			
			
		}
		
		if(keyCode==e.VK_LEFT) {
			
			if(x>8) {
				x=x-10;
			}
			
		}
		
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		x=e.getX();
		
	}
	
	
	

}
