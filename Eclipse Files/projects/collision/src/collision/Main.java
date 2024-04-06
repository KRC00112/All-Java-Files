package collision;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[]args) {
		
		JFrame frame=new JFrame();
		
		
		frame.setTitle("Collision");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
//		frame.add(new MainPanel());
		frame.add(new MainPanel5());
		frame.pack();	
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		
		
		
	}
	
	

}
