package jOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// JOptionPane = pop up a standard dialog box that prompts users for a value
		// 				 or informs them of something.
		
		
		JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello", "title", JOptionPane.WARNING_MESSAGE);
//		while(true) {
//			JOptionPane.showMessageDialog(null, "Virus detected", "title", JOptionPane.ERROR_MESSAGE);
//		}
		
		
//		int decision=JOptionPane.showConfirmDialog(null, "choose", "decision", JOptionPane.YES_NO_CANCEL_OPTION);
//		
//		if(decision==1) {
//			
//			JOptionPane.showMessageDialog(null, "GTFO!!!!", "title", JOptionPane.ERROR_MESSAGE);
//		}
//		if(decision==0) {
//			JOptionPane.showMessageDialog(null, "New Buddy", "smilie face", JOptionPane.PLAIN_MESSAGE);
//		}
		
//		String name=JOptionPane.showInputDialog("write your name:");
//		
		
//		JOptionPane.showMessageDialog(null, "Hello "+name, "Greet", JOptionPane.INFORMATION_MESSAGE);

//		ImageIcon icon=new ImageIcon("pinch.png");
//		JOptionPane.showMessageDialog(null, "You are awesome", "Secret message", JOptionPane.INFORMATION_MESSAGE, icon);

		String[] responses = {"No, you're awesome!","thank you!","*blush*"};
		ImageIcon icon = new ImageIcon("pinch.png");
		
		JOptionPane.showOptionDialog(
			    null,
			    "You are awesome!",
			    "Secret message",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.INFORMATION_MESSAGE,
			    icon,
			    responses,  // This should be an array of String
			    responses[0]  // This should be an Object, not an int
			);
			
		
		
		
		
	}

}
