package mouseInput;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Mouse extends JPanel implements MouseListener,MouseMotionListener{
	
	int x;
	int y;
	
	boolean mouseOnScreen;
	boolean mouseDragged;
	
	Mouse(){
		
		
		setPreferredSize(new Dimension(500,500));
		x=50;
		y=50;
		this.setFocusable(true);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		
		super.paintComponent(g);
		
	if(mouseDragged) {
			
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x, y, 50, 50);
		
			
			
		}
		else {
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.DARK_GRAY);
			g.fillOval(x, y, 50, 50);
			
			
		}
		
		
		
		
		g.setColor(Color.white);
		if(mouseOnScreen) {
			g.drawString("x-coordinate: "+x+",y-coordinate: "+y, 300, 12);
		}
		
	
		
		
		
		
		repaint();
		
		
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int xCoord=e.getX();
		int yCoord=e.getY();
		x=xCoord-25;
		y=yCoord-23;
		
		e.consume();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		e.consume();

		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		mouseOnScreen= true;
		e.consume();

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		mouseOnScreen= false;
		e.consume();


		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		x=e.getX()-25;
		y=e.getY()-23;
		
		mouseDragged=true;
		
		e.consume();

	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		x=e.getX()-25;
		y=e.getY()-23;
		
		mouseDragged=false;
		
		e.consume();

		
	}

}
