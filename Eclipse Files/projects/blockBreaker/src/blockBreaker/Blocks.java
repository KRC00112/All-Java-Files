package blockBreaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Blocks extends JPanel{
	
	int i=0;
	
	int blockX;
	int blockY;
	
	int blockWidth;
	int blockHeight;
	
	
	
	Blocks(){
		
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(630,400));
		this.setBounds(0, 50, 600, 400);
		this.setBackground(Color.blue);
		
		blockX=0;
		blockY=0;
		
		blockWidth=100;
		blockHeight=50;
		
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		for(blockX=0;blockX<=500;blockX=blockX+100) {
			
			for(blockY=0;blockY<=390;blockY=blockY+50) {
					block(g);
					i++;
					
					
		
			}
		
	}

		System.out.println(i);

		
	}

	private void block(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(Color.orange);
		g.fillRect(blockX, blockY, blockWidth, blockHeight);
		g.setColor(Color.yellow);
		g.fillRect(blockX+3, blockY+3, blockWidth-6, blockHeight-6);
		
	
		
	}
	
	
	

}
