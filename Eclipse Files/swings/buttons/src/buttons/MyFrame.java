
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	ImageIcon logo;
	MyFrame(){
		
		logo=new ImageIcon("logo.JPG");
		label=new JLabel("shovel.png");
		label.setIcon((Icon) label);
		
		label.setBounds(325, 200, 70, 70);
		
		
		
		this.setVisible(true);
		this.setSize(650, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(logo.getImage());
		this.setLayout(null);
		
		button=new JButton();
		
		button.setText("Click");
		button.addActionListener(this);
		
		button.setBounds(280,120,80,30);
		button.setFocusable(false);
		
		
		this.add(button);
		this.add(label);
		
	}

	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button) {
			System.out.println("shit");
		}
		
		
		
	}

}
