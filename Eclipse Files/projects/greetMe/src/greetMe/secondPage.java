package greetMe;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class secondPage extends JFrame {
	
	JLabel label;
	Font font;
	
	secondPage(String input){
		
		
		this.setSize(800,600);
		this.getContentPane().setBackground(new Color(145,64,145));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		
		JPanel panel1=new JPanel();
		panel1.setBackground(new Color(145,64,145));
		panel1.setPreferredSize(new Dimension(800,200));
		this.add(panel1,BorderLayout.NORTH);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT,200,10));

		
		label=new JLabel();
		label.setText("Hello "+input+"!");
		font = new Font("Fantasy", Font.BOLD, 70);
		label.setFont(font);
		label.setForeground(Color.WHITE);
		panel1.add(label);
		
		
		
		JPanel panel2=new JPanel();
		panel2.setBackground(new Color(145,64,145));
		panel2.setPreferredSize(new Dimension(200,600));
		this.add(panel2,BorderLayout.WEST);
		
		
		JPanel panel3=new JPanel();
		panel3.setBackground(new Color(145,64,145));
		panel3.setPreferredSize(new Dimension(200,600));
		this.add(panel3,BorderLayout.EAST);
		
//		JPanel panel4=new JPanel();
//		panel4 = new RoundedPanel(50);
//		panel4.setBackground(new Color(203,137,203));
//		panel4.setPreferredSize(new Dimension(200,600));
//		this.add(panel4,BorderLayout.CENTER);
//		panel4.setLayout(null);
		
		
		//----------tabbedpanels--------------
		
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(0, 50, 1140, 510);
		this.add(tp);
		
		JPanel tabPanel1=new JPanel();
		JPanel tabPanel2=new JPanel();
		JPanel tabPanel3=new JPanel();
		JPanel tabPanel4=new JPanel();
		
		tabPanel1.setLayout(null);
		
		tabPanel1.add(new JLabel("Time:\n"));
		tabPanel2.add(new JLabel("chat"));
		tabPanel3.add(new JLabel("calculator"));
		tabPanel4.add(new JLabel("To-do List"));
		
		tp.add("Time",tabPanel1);
		tp.add("chat",tabPanel2);
		tp.add("calculator",tabPanel3);
		tp.add("To-do List",tabPanel4);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		JLabel label2=new JLabel(dtf.format(now));
		
		tabPanel1.add(label2);
		
		label2.setBounds(500, 100, 200, 200);


		

		
		tabPanel1.setBackground(Color.WHITE);
		tabPanel2.setBackground(Color.WHITE);
		tabPanel3.setBackground(Color.WHITE);
		tabPanel4.setBackground(Color.WHITE);

		
		//---------tabbedpanelsend------------
		
		JPanel panel5=new JPanel();
		panel5.setBackground(new Color(145,64,145));
		panel5.setPreferredSize(new Dimension(800,50));
		this.add(panel5,BorderLayout.SOUTH);
		
	
	}
	
	
	
	
}
