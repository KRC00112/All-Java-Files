package jump;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements KeyListener {
    
    JPanel panel1;
    JLabel label;
    
    MyFrame(){
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(800, 500));
        panel1.setBackground(Color.cyan);
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT,10,468)); 
        this.add(panel1, BorderLayout.NORTH);
        
        
        
        label = new JLabel();
        label.setPreferredSize(new Dimension(30, 30));
        label.setBackground(Color.black);
        label.setOpaque(true);
        this.addKeyListener(this);
        panel1.add(label);
        
        JPanel panel2=new JPanel();
        panel2.setPreferredSize(new Dimension(800,310));
        panel2.setBackground(Color.green);
        this.add(panel2,BorderLayout.SOUTH);
        
        
        this.setVisible(true);
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	    switch (e.getKeyCode()) {
	        case KeyEvent.VK_UP:
	            if (label.getY() > 0) {
	                label.setLocation(label.getX(), label.getY() - 10);
	            }
	            break;
	        case KeyEvent.VK_LEFT:
	            if (label.getX() > 0) {
	                label.setLocation(label.getX() - 10, label.getY());
	            }
	            break;
	        case KeyEvent.VK_DOWN:
	            if (label.getY() <= this.getY() + 460) {
	                label.setLocation(label.getX(), label.getY() + 10);
	            }
	            break;
	        case KeyEvent.VK_RIGHT:
	            if (label.getX() <= this.getX() + 745) {
	                label.setLocation(label.getX() + 10, label.getY());
	            }
	            break;
	       
	    }
	}
	@Override
	public void keyReleased(KeyEvent e) {

		System.out.println(e.getKeyChar());
		System.out.println(e.getKeyCode());
		
		
		
	}
    
    
}
