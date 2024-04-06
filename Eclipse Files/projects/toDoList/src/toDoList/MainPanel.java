package toDoList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener{
	
	JButton addButton;
	JTextField newTask;
	int listX=20;
	int listY=80;
	String textInBox="";

	JPanel taskPanel;
	JLabel taskLabel;
	

	boolean showTask=false;
	
	
	MainPanel(){
		
	
		
		
		JPanel addPanel=new JPanel();
		
		
		
		this.setPreferredSize(new Dimension(320,500));
		this.setBackground(Color.white);
		this.setLayout(null);
		if(showTask==true) {
			taskPanel=new JPanel();
			taskPanel.setBounds(listX, listY, 275, 40);
			taskPanel.setBackground(new Color(167,87,201,100));
			taskPanel.setLayout(null);
			
			taskLabel=new JLabel();
			taskLabel.setFont(new Font(null,Font.BOLD,10));
			taskLabel.setBounds(10,15,100,10);
			taskPanel.add(taskLabel);
			
			this.add(taskPanel);
		}

		
		addPanel.setBounds(20, 20, 275, 40);
		addPanel.setBackground(Color.white);
		addPanel.setLayout(null);
		this.add(addPanel);
	
		
		
		newTask=new JTextField();
		newTask.setBounds(5, 5, 200, 30);
		newTask.setBackground(Color.white);
		addPanel.add(newTask);
		
		
		
		addButton=new JButton("Add");
		addButton.setBounds(210, 5, 60, 30);
		addButton.addActionListener(this);
		
		
		addPanel.add(addButton);
		
		
		
		
		
		
		
	}


	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==addButton) {
			
			
			
			textInBox=newTask.getText();
			taskLabel.setText(textInBox);

			System.out.println(textInBox);
			showTask=true;

			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
