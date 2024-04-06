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

public class Tree extends JPanel{
	
	
	Random random=new Random();
	
	
	
	int radius=50;
	

	
	Tree(){
		
		
		
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paintComponent(Graphics g) {
		
	
			int x1=random.nextInt(0+10,this.getWidth()-250);
			int y1=random.nextInt(0+10,this.getHeight()-230);
			
			

			int r1=random.nextInt(12,31);
			int gr1=random.nextInt(120,231);
			int b1=random.nextInt(48,84);
			
			g.setColor(new Color(r1,gr1,b1));
			
			g.fillOval(x1, y1, 5, 5);
			
			
			int x2=random.nextInt(0+10,this.getWidth()-250);
			int y2=random.nextInt(280,this.getHeight()-10);
			
			

			int r2=random.nextInt(238,240);
			int gr2=random.nextInt(105,144);
			int b2=random.nextInt(20,22);
			
			g.setColor(new Color(r2,gr2,b2));
			
			g.fillOval(x2, y2, 5, 5);
		
		

			


			
			g.dispose();
			
			
			
			repaint();
			
			
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
