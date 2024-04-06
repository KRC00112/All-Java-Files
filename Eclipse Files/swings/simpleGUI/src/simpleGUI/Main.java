package simpleGUI;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
	static String hello="Hello, World!";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		JFrame frame=new JFrame("Simple GUI Example");
	
		JPanel panel =new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		JLabel label=new JLabel(hello);
		
		panel.add(label);
		
		
		JButton button=new JButton("Click Me");
		
		
		
		
		panel.add(button);
		
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}

}
