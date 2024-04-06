package lec51_JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		JLabel label=new JLabel();
		
		label.setText("Hi!!");	
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.LEFT);
		
		ImageIcon image=new ImageIcon("logo.JPG");
		label.setIcon(image);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setVerticalAlignment(JLabel.BOTTOM);
		
		//	if using null layout
		//	label.setBounds(100,100,75,75);s
		
		
		
		
		
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(750, 750);
		frame.setTitle("Title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(null);
		
		
		
		JPanel redPanel=new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		//redPanel.setLayout(null);


		
		
		JPanel bluePanel=new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		//bluePanel.setLayout(null);


		
		
		JPanel greenPanel=new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		//greenPanel.setLayout(null);

		
		
		redPanel.add(label);
		bluePanel.add(label);
		greenPanel.add(label);
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

		
		
		
	}

}
