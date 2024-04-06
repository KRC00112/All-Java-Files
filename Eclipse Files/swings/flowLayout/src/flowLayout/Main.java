package flowLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		//Layout Manger =Defines the natural layout for components within a container
		
		//Flowlayout= places components in a  row, sized at their preferred size.
		//			  If the horizontal space in the container is too small,
		//			  the FlowLayout  class uses the available row.
		
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
		JPanel panel=new JPanel();
		
		panel.setPreferredSize(new Dimension (200,200));
		
		panel.setBackground(Color.gray);
		
		panel.setLayout(new FlowLayout());
	
	
		
		
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);

		
		
		
		frame.setVisible(true);

		

		
		
		
		
		
		
	}

}
