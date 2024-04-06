package keyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	
	
	JLabel label;
	
	MyFrame(){
		
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		this.addKeyListener(this);

		label=new JLabel();
		
		ImageIcon image=new ImageIcon("ball.png");
		label.setIcon(image);
		label.setBounds(0, 0, 100, 100);	
		this.add(label);
		
		this.setVisible(true);
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//keyTyped=invoked when a key is typed.uses KeyChar, char output
		
		switch(e.getKeyChar()) {
		
		case 'a':label.setLocation(label.getX()-10, label.getY());
			break;
		case 'd':label.setLocation(label.getX()+10, label.getY());
			break;

		case 's':label.setLocation(label.getX(), label.getY()+10);
			break;

		case 'w':label.setLocation(label.getX(), label.getY()-10);
			break;
		}
				
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//keyPressed=invoked when a physical key is pressed down. Uses keycode, int output
	
		switch(e.getKeyCode()) {
		
		case 37:label.setLocation(label.getX()-10, label.getY());
			break;
		case 39:label.setLocation(label.getX()+10, label.getY());
			break;

		case 40:label.setLocation(label.getX(), label.getY()+10);
			break;

		case 38:label.setLocation(label.getX(), label.getY()-10);
			break;
		}
	
	
	
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//keyReleased=called whenever a button is released 
		System.out.println("You relesed key character:"+e.getKeyChar());
		System.out.println("you relesed key code:"+e.getKeyCode());
	}

}
