package car;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener,KeyListener  {
	
	JButton button1;
	JButton button2;

	
	MyFrame(){
		
		this.setSize(600, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());

		
		JPanel panel1=new JPanel();
		panel1.setPreferredSize(new Dimension(600,290));
		panel1.setBackground(Color.BLUE);
		this.add(panel1,BorderLayout.NORTH);
		panel1.setLayout(null);
		
		JPanel panel2=new JPanel();
		panel2.setPreferredSize(new Dimension(600,530));
		panel2.setBackground(Color.PINK);
		panel2.setLayout(null);
		panel2.addKeyListener(this);
		
		this.add(panel2,BorderLayout.SOUTH);
		
		
		
		JPanel panel3=new JPanel();
		panel3.setSize(400,430);
		panel3.setBounds(300, 200, 900, 270);
		panel3.setBackground(Color.pink);
		panel3.setLayout(new GridLayout(10,10));
		
		
		panel2.add(panel3);
		
		JLabel label=new JLabel();
		ImageIcon banner=new ImageIcon("Car.png");
		
		label.setIcon(banner);
		label.setBounds(440, 0, 800, 200);
		panel1.add(label);
		
		
		
		
		button1=new JButton("new game");
		button1.setBackground(Color.pink);
		button1.setBorderPainted(false);
		button1.addActionListener(this);
		
		button2=new JButton("quit");
		button2.setBackground(Color.pink);
		button2.setBorderPainted(false);
		button2.addActionListener(this);
		
		
		button1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        button1.setBackground(new Color(255,43,112));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	button1.setBackground(Color.pink);
		    }
		});
		button2.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	
		        button2.setBackground(new Color(255,43,112));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	button2.setBackground(Color.pink);
		    }
		});
		

		button1.setPreferredSize(new Dimension(20,80));
		panel3.add(button1);
		panel3.add(button2);
				
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setVisible(true);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button1) {

			
			
		
			
			Game game=new Game();
			game.setVisible(true);
			this.dispose();
			
			
		}
		else if(e.getSource()==button2) {
			
			this.dispose();
			
		}
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 27) {
            dispose();
        }
    }

	@Override
	public void keyReleased(KeyEvent e) {

		
		
	}
	
	
	

}
