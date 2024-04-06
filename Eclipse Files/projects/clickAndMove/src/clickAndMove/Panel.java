package clickAndMove;

import java.awt.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements MouseListener,ActionListener{
	

	int cx=30;
	int cy=80;
	
	Timer timer;
	int mouseX;
	int mouseY;
	
	Panel(){
		
		this.setPreferredSize(new Dimension(700,500));
		this.setBackground(Color.white);
		timer=new Timer(10,this);
		timer.start();
		
		this.setFocusable(true);
		this.addMouseListener(this);


		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(new Color(247,185,0));
		g.fillOval(cx, cy, 20, 20);
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		 mouseX=e.getX();
		 mouseY=e.getY();
		
		cx=mouseX;
		cy=mouseY;
		
		repaint();
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cx=mouseX;
		cy=mouseY;
		
		repaint();
		
	}
	 
	
	
	

}
