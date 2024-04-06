package tic_tac_toe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JPanel implements ActionListener{
	
	JPanel statusPanel=new JPanel();
	JPanel gamePanel=new JPanel();
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	Font font;
	
	boolean pressed=true;
	
	String sel="-";
	
	String turn;
	
	
	Game(){
		
		turn="X";
		
		this.setPreferredSize(new Dimension(600,600));
		
		statusPanel.setBackground(Color.black);
		statusPanel.setPreferredSize(new Dimension(590,100));
		font=new Font("consolas", font.BOLD, 45);
		
		statusPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		JLabel label=new JLabel();
		label.setText("Turn: "+turn);
		label.setForeground(Color.white);
		label.setFont(font);
		statusPanel.add(label);
		
		
		
		gamePanel.setBackground(Color.white);
		gamePanel.setPreferredSize(new Dimension(590,480));
		gamePanel.setLayout(new GridLayout(3,3,20,20));
		
		button1=new JButton(sel);
		button1.addActionListener(this);
		
		button2=new JButton(sel);
		button2.addActionListener(this);
		
		button3=new JButton(sel);
		button3.addActionListener(this);

		button4=new JButton(sel);
		button4.addActionListener(this);

		button5=new JButton(sel);
		button5.addActionListener(this);

		button6=new JButton(sel);
		button6.addActionListener(this);

		button7=new JButton(sel);		
		button7.addActionListener(this);

		button8=new JButton(sel);
		button8.addActionListener(this);

		button9=new JButton(sel);
		button9.addActionListener(this);

		gamePanel.add(button1);
		gamePanel.add(button2);
		gamePanel.add(button3);
		gamePanel.add(button4);
		gamePanel.add(button5);
		gamePanel.add(button6);
		gamePanel.add(button7);
		gamePanel.add(button8);
		gamePanel.add(button9);
		
		this.add(statusPanel);
		this.add(gamePanel);
		
		
	
	
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
				
		if(pressed) {
		
			
		
			if(e.getSource()==button1) {
				
				
				button1.setText(turn);
				pressed=false;
			}
			if(e.getSource()==button2) {
				
				
				button2.setText(turn);
				pressed=false;
			}
			if(e.getSource()==button3) {
				
				
				button3.setText(turn);
				pressed=false;
			}
		
		}
		else{
			
			turn="O";
			pressed=true;
			
		}
		
		
		
		
	
	
	
	}
		
}
