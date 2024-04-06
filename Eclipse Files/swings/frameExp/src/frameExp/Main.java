package frameExp;

import javax.swing.JFrame;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int x=Integer.parseInt(JOptionPane.showInputDialog("write either 1 or 0"));
		
		JFrame frame=new JFrame();
		
		
		if(x==1) {
		frame.setSize(600, 450);
			frame.getContentPane().setBackground(Color.PINK);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setVisible(true);
	
		}
		else if(x==0) {
		frame.setSize(600, 450);
			frame.getContentPane().setBackground(Color.GREEN);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setVisible(true);
		
		}
	
	}

}
