package a2Dgame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		
		JFrame frame=new JFrame();
		frame.setSize(600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JPanel panel=new JPanel();
		panel.setSize(50, 50);
		panel.setBackground(Color.GREEN);
		
		frame.add(panel);
		
		
		frame.setVisible(true);
		
		
		
	}

}
