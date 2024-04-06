package car;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame implements KeyListener{
	JLabel label;
	JPanel panel1;
	Game(){
		
		this.setSize(600, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.getContentPane().setBackground(Color.pink);
		this.setLayout(null);
		this.addKeyListener(this);
		
		panel1=new JPanel();
		
		
		
		
		panel1.setBounds(650, 0, 200, 800);
		panel1.setBackground(Color.BLACK);
		panel1.setLayout(new BorderLayout());
		
		
		label=new JLabel();
		ImageIcon move=new ImageIcon("top (1).png");
		label.setIcon(move);	
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.TOP);
		
		panel1.add(label);
		this.add(panel1);
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		
		
		case 'w':
			if(label.getY()>0) {	
				label.setLocation(label.getX(), label.getY()-10);
			}
			break;
		case 'a':
			if(label.getX()>0) {
					label.setLocation(label.getX()-10, label.getY());
			}
			break;
		case 's':
			if(label.getY()<=this.getY()+700) {
				label.setLocation(label.getX(), label.getY()+10);
			}
			break;
		case 'd':
			if(label.getX()<=this.getX()+100) {
				label.setLocation(label.getX()+10, label.getY());
			}
		break;
		
		
		
		}
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		  switch (e.getKeyCode()) {
	        case KeyEvent.VK_UP:
	        	if(label.getY()>0) {
	            label.setLocation(label.getX(), label.getY() - 10);
	        	}
	            break;
	        case KeyEvent.VK_LEFT:
	        	if(label.getX()>0) {
	            label.setLocation(label.getX() - 10, label.getY());
	        	}
	            break;
	        case KeyEvent.VK_DOWN:
	        	if(label.getY()<=this.getY()+700) {
	            label.setLocation(label.getX(), label.getY() + 10);
	        	}
	            break;
	        case KeyEvent.VK_RIGHT:
	        	if(label.getX()<=this.getX()+100) {
	            label.setLocation(label.getX() + 10, label.getY());
	        	}
	            break;
	            
	            
	        case KeyEvent.VK_ESCAPE:
	        	this.dispose();
	        	
	    }
		  
		  
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar());
		System.out.println(e.getKeyCode());

		
	}
	
	

}
