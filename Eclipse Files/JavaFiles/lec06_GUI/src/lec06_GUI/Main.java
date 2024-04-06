package lec06_GUI;

import javax.swing.JOptionPane;


public class Main {
	
	
	public static void main(String[]args) {
		
		String name=JOptionPane.showInputDialog("Enter name:");
		
		JOptionPane.showInternalMessageDialog(null, "Hello "+name);
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
		JOptionPane.showInternalMessageDialog(null,"You are " +age+ " years old");
	
		float height=Float.parseFloat(JOptionPane.showInputDialog("Height: "));
		JOptionPane.showInternalMessageDialog(null, "You are "+height+" cm tall");
		
		
		
	}

}
