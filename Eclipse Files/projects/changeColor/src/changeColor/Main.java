package changeColor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main implements ActionListener{

	static JRadioButton pink;
	static JRadioButton green;
	static boolean color=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.getContentPane().setBackground(Color.pink);
		
		frame.setLayout(null);
		ButtonGroup bg=new ButtonGroup();
		 pink=new JRadioButton("pink");
		 green=new JRadioButton("green");
		
		pink.setBounds(30, 30, 50, 50);
		green.setBounds(100, 30, 80,50);
		
		
		if(color==true) {
		pink.setBackground(Color.pink);
		
		}
		
		
		if(color==false) {
		green.setBackground(Color.green);
		
		}
		
		
		
		
		frame.add(green);
		bg.add(green);
	
		frame.add(pink);
		bg.add(pink);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==pink) {
			
			color=true;
			
			
		}
		if(e.getSource()==green) {
			color=false;
		}
		
	}

}
