package move;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements KeyListener, ActionListener {

    Image enemy;
    int x = 400;
    int y = 300;
    
    int x_speed=10;
    int y_speed=10;
  

    Panel() {
        enemy = new ImageIcon("simon.png").getImage();
     
        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(enemy, x, y, null);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        
      
    	 if(e.getKeyCode()==KeyEvent.VK_UP) {
   		  
			  y=y-y_speed;
			  repaint();
	  }
    	 
    	
    	
	  if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
	        	
	        	
	        	x=x+x_speed;
	        	repaint();
	        	
	        }
	  
	  if(e.getKeyCode()==KeyEvent.VK_DOWN) {
		  
	  	  y=y+y_speed;
	  	  repaint();
	  
	  }
	  
	  
	  
	  if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		  
		  		x=x-x_speed;
		  		repaint();
		  
		  
	  }
	 
	 
	  
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    	
    	
    	
    	
    	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       

    }
}
