package lec50_GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class mylabels extends JLabel{
	
	mylabels(){
	
	JLabel label=new JLabel();
	Border border=BorderFactory.createLineBorder(Color.green);
	this.setBorder(border);
	
	ImageIcon backimage=new ImageIcon("shovel.png");
	this.setIcon(backimage);
	
	
	this.setText("shovel knight");
	
	this.setHorizontalTextPosition(JLabel.RIGHT);//set text left,center,right of imageicon
	this.setVerticalTextPosition(JLabel.TOP);//top,center,botttom
	this.setIconTextGap(-20);//set gap of text to image
	this.setBackground(Color.black);
	this.setOpaque(true);
	this.setForeground(Color.white);
	this.setVerticalAlignment(JLabel.CENTER);
	this.setHorizontalAlignment(JLabel.CENTER);
	this.setFont(new Font("courier new",Font.PLAIN,16));
	}
	
	
}

