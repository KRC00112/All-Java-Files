package randomObject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pixels extends JPanel{
	
	
	Random random=new Random();
	
	
	
	int radius=50;
	

	
	Pixels(){
		
		
		
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paintComponent(Graphics g) {
		
	
			int x=random.nextInt(0+10,this.getWidth()-250);
			int y=random.nextInt(0+10,this.getHeight()-250);
			
			int z=random.nextInt(260,this.getWidth()-10);
			int w=random.nextInt(0+10,this.getHeight()-10);
			
		
			
			
			
			int r=random.nextInt(0,256);
			int gr=random.nextInt(0,256);
			int b=random.nextInt(0,256);
			
			
			Graphics2D g2d=(Graphics2D)g;
			
			GradientPaint gradientPaint = new GradientPaint(10, 280, Color.white,10, this.getHeight()-10, Color.black);			
			g2d.setPaint(gradientPaint);
			g2d.fillRoundRect(10, 260, 245,225,10,10);
			
			
			
			
			g.setColor(new Color(r,gr,b));
			
			g.fillRect(x, y, 5, 5);
			g.fillOval(z, w, 5, 5);
		
			g.setColor(Color.black);
			Font myFont = new Font ("Courier New", 2, 35);
			g.setFont (myFont);
			g.drawString("Artsy", 10, 310);
			g.drawString("Animation", 10, 345);
			g.drawString("in", 10, 380);
			g.drawString("Java Swing", 10, 415);

			


			
			g.dispose();
			
			
			
			repaint();
			
			
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
