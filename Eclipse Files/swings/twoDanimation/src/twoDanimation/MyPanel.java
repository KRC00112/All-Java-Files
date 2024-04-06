package twoDanimation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {

	final int PANEL_WIDTH=1366;
	final int PANEL_HEIGHT=768;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity=5;
	int yVelocity=5;
	int x=0;
	int y=0;
	
	
		MyPanel(){
			this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
			this.setBackground(Color.black);
			enemy=new ImageIcon("medusa.png").getImage();
			backgroundImage=new ImageIcon("background.jpg").getImage();
			timer=new Timer(10, this);//after ecery ten milisec the object will move by i ppixel along x axis since xvelocity=1
			timer.start();
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);//will paint background
			
			Graphics2D g2D=(Graphics2D) g;
			g2D.drawImage(backgroundImage, 0, 0, null);
			
			g2D.drawImage(enemy, x, y, null);
			
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(x>=PANEL_WIDTH-enemy.getWidth(null)||x<0) {
				xVelocity=xVelocity * -1;
				
			}
	
			x=x+xVelocity;
			
			
			if(y>=PANEL_HEIGHT-enemy.getHeight(null)||y<0) {
				yVelocity=yVelocity * -1;
				
			}
	
			y=y+yVelocity;
			
			
			repaint();
			
			
			
			
			
		}
	
	
}
