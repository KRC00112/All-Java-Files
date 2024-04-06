package anotherTry;

import java.util.Scanner;

import javax.swing.JFrame;

public class Cli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
		System.out.print("Enter: ");
		String input=scanner.nextLine();
		
		
		if(input.equalsIgnoreCase("frame")) {
			
			framePopUp();
			
		}
		
		}
		
		
		
		

	}
	
	public static void framePopUp() {
		
		JFrame frame=new JFrame();
		frame.setSize(1366,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		
	}
	
	
	
	
	

}
