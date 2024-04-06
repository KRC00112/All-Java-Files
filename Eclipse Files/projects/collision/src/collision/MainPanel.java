package collision;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements MouseMotionListener {
	
	
	Font font=new Font("Arial",Font.BOLD,50);
	int sqX;
	int sqY;
	
	
	MainPanel(){
		
		this.setPreferredSize(new Dimension(1366,768));
		sqX=560;
		sqY=80;
		this.setFocusable(true);
		this.addMouseMotionListener(this);
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
	
		Rectangle r1=new Rectangle(80,80,300,300);
		g.setColor(Color.blue);
		g.fillRect(r1.x, r1.y, r1.width, r1.height);
		
		Rectangle r2=new Rectangle(sqX,sqY,100,100);
		g.setColor(Color.red);
		g.fillRect(r2.x, r2.y, r2.width, r2.height);
		
		if(r1.intersects(r2)) {
			g.setFont(font);
			g.drawString("Collision Detected",468 , 600);
			g.drawString("GAME OVER",530 , 700);

			
		}
		
		
		repaint();
	
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		sqX=e.getX()-50;
		sqY=e.getY()-50;
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
