package lec50_GUI;

//checkout GreetMe for more
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		
//JFrame stuff

		MyFrame myFrame=new MyFrame();		
		
//		JFrame frame=new JFrame();
//		
//		frame.setVisible(true);
//		
//		frame.setSize(600, 400);
//		frame.setTitle("Title");
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		frame.setResizable(false);
		
		
//		
		

		
		
		
		
//JLabels stuff		
		
		mylabels myLabels=new mylabels();
		
//		JLabel label=new JLabel();
//		Border border=BorderFactory.createLineBorder(Color.green);
//		label.setBorder(border);
//		
//		ImageIcon backimage=new ImageIcon("shovel.png");
//		label.setIcon(backimage);
//		
//		
//		label.setText("shovel knight");
//		myFrame.add(label);
//		label.setHorizontalTextPosition(JLabel.RIGHT);//set text left,center,right of imageicon
//		label.setVerticalTextPosition(JLabel.TOP);//top,center,botttom
//		label.setIconTextGap(-20);//set gap of text to image
//		label.setBackground(Color.black);
//		label.setOpaque(true);
//		label.setForeground(Color.white);
//		label.setVerticalAlignment(JLabel.CENTER);
//		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setFont(new Font("courier new",Font.PLAIN,16));
//		myFrame.pack();
		
		myFrame.add(myLabels);
		
		
		
//JPanel= A GUI component that functions as a container to hold other components
		
		
		

	}

}
