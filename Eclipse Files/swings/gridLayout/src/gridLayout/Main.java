package gridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		//Layout Manager=defines the natural layout for components within a container
		
		//Grid Layout= places components in a grid of cells.
		//             Each component takes all the available space within its cell,
		//			   and each cell is the same size.
		
		
		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(9,4,0,0));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));


		
		
		
		frame.setVisible(true);
		
	
		
		
		
		
		
		
	}

}
