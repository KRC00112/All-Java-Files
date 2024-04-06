package randomObject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	
	Random random=new Random();
	
	
	
	int radius=50;
	
	
	
	
	Panel(){
		
		
		
		this.setPreferredSize(new Dimension(500,500));
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		
	
			int x=random.nextInt(0+10,this.getWidth()-100);
			int y=random.nextInt(0+10,this.getHeight()-100);
			
			int r=random.nextInt(0,256);
			int gr=random.nextInt(0,256);
			int b=random.nextInt(0,256);
			
			radius=random.nextInt(5,101);
			
			
			
			
			g.setColor(new Color(r,gr,b));
			
			g.fillOval(x, y, radius, radius);
			g.dispose();
			
			
			
			repaint();
			
			
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
