package trial1;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

import javax.swing.*;

public class Frame extends JFrame implements KeyListener {
	
	Panel panel1=new Panel();
	Panel panel2=new Panel();
	Label box=new Label();

	
	Frame(){
		
		this.setSize(1366, 768);
		this.setLocationRelativeTo(null);
		panel1.setBackground(new Color(0,150,255));
		panel1.setPreferredSize(new Dimension(1366,540));
		
		panel2.setBackground(Color.green);
		panel2.setPreferredSize(new Dimension(1366,310));
		
		
		this.add(panel1,BorderLayout.CENTER);
		this.add(panel2,BorderLayout.PAGE_END);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		panel1.add(box);
		this.addKeyListener(this);
		this.pack();
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
	            if (box.getY() > 0) {
	                box.setLocation(box.getX(), box.getY() - 10);
	            }
	            break;
	        case KeyEvent.VK_LEFT:
	            if (box.getX() > 0) {
	                box.setLocation(box.getX() - 10, box.getY());
	            }
	            break;
	        case KeyEvent.VK_DOWN:
	            if (box.getY() <= this.getY() + 460) {
	            	box.setLocation(box.getX(), box.getY() + 10);
	            }
	            break;
	        case KeyEvent.VK_RIGHT:
	            if (box.getX() <= this.getX() + 745) {
	            	box.setLocation(box.getX() + 10, box.getY());
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
