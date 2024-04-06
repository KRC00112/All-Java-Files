package lec50_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	JButton button;
	MyFrame(){
		
		ImageIcon icon=new ImageIcon("hand.png");
		
		button=new JButton();
        button.setBounds(175, 200, 610, 120);
		button.addActionListener(e -> System.out.println("Shit"));
		button.setIcon(icon);
		
		this.setVisible(true);
		
		this.setSize(600, 400);
		this.setTitle("Title");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(true);
		this.setLayout(null);
		
        this.add(button);

		
		
	}

	
	
	

}
