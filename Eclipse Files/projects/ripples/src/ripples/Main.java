package ripples;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		JFrame frame=new JFrame("Ripple Frame");
	
		
		
		frame.add(new ActivityPanel());
		frame.pack();
	
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		

	}

}
