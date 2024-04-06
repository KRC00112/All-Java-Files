package ripples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ActivityPanel extends JPanel implements MouseMotionListener,MouseListener,Runnable{
	
	
	int mouseX;
	int mouseY;
	int incrementWidth=1;
	int incrementHeight=1;
	boolean showDrop;
	
	ActivityPanel(){
		
		this.setPreferredSize(new Dimension(700,500));
		this.setBackground(new Color(137,207,240));
		this.addMouseListener(this);
		
		
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		if(showDrop) {
		
			g.fillOval(mouseX, mouseY, 20*incrementWidth, 20*incrementHeight);
		
		}
		
		
		
	}
	
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		
		showDrop=true;
		mouseX=e.getX()-20;
		mouseY=e.getY()-20;
		
		Thread thread=new Thread(this);
		thread.start();
		
		repaint();
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<=50;i++) {
			
			incrementHeight++;
			incrementWidth++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	

}
