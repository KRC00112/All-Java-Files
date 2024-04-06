package jTextFields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
	JButton button1;
	JButton button2;
	JTextField textfield;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button1=new JButton();
		button1.setText("submit");
		button1.addActionListener(this);
		button1.setFocusable(false);
		
		
		button2=new JButton();
		button2.setText("reset");
		button2.addActionListener(this);
		
		
		textfield =new JTextField();
		textfield.setPreferredSize(new Dimension(240,40));
		textfield.setFont(new Font("Consolas",Font.PLAIN,20));
		textfield.setForeground(Color.green);
		textfield.setBackground(Color.black);
		textfield.setCaretColor(Color.red);
		textfield.setText("username");
		
		
		this.add(button1);
		this.add(button2);
		this.add(textfield);
		this.pack();
		this.setVisible(true);

		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button1) {
			
			if(textfield.getText().isBlank()) {
			
			System.out.println("Blank input");
			
			}
			else {
				JOptionPane.showMessageDialog(button1, "hello there "+textfield.getText()+"!");
				button1.setEnabled(false);
				textfield.setEditable(false);

			}
			
			
		}
		if(e.getSource()==button2) {
			
			if(textfield.getText().isBlank()) {
			
			System.out.println("nothing to clear");
			
			}
			else {
				textfield.setText("");
				button1.setEnabled(true);
				textfield.setEditable(false);

			}
			
			
		}
		
		
		
	}

}
