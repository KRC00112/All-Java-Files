package greetMe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class MyFrame extends JFrame implements ActionListener {
	
	ImageIcon logo=new ImageIcon("hat.JPG");
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	JLabel label3=new JLabel();
	String text;
	Font font;
	JTextField textfield;
	JButton button;
	
	
	MyFrame(){		
		this.setIconImage(logo.getImage());
		this.setSize(800,600);
		this.setTitle("greetMe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		 this.setUndecorated(true);
		
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.white);
		panel1.setPreferredSize(new Dimension(300,600));
		panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		
		
		
		text = "Hello. How do you do?Hope you are well.Have a nice day!";
        String[] words = text.split(" ");
        StringBuilder lineBuilder = new StringBuilder();
        for (String word : words) {
            if (lineBuilder.length() + word.length() + 10 <= 2) {
                if (lineBuilder.length() > 0) {
                    lineBuilder.append(" ");
                }
                lineBuilder.append(word);
            } else {
                JLabel lineLabel = new JLabel(lineBuilder.toString());
                font = new Font("Book Antiqua", Font.BOLD, 65);
                lineLabel.setFont(font);
                lineLabel.setForeground(Color.black);
                panel1.add(lineLabel);
                lineBuilder = new StringBuilder(word);
            }
        }
        if (lineBuilder.length() > 0) {
            JLabel lastLineLabel = new JLabel(lineBuilder.toString());
            font = new Font("Book Antiqua", Font.BOLD, 80);
            lastLineLabel.setFont(font);
            lastLineLabel.setForeground(Color.black);
            panel1.add(lastLineLabel);
        }
        
		
		
		JPanel panel2=new JPanel();
		panel2.setBackground(Color.black);
		panel2.setPreferredSize(new Dimension(1300,600));
		
		//---------panel2subpanelsstart---------
		
		JPanel panel3=new JPanel();
		panel3.setBackground(Color.black);
		panel3.setPreferredSize(new Dimension(500,200));
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT,100,0));
		
		label1.setText("Hello, user!");		
		font = new Font("Sanserif", Font.BOLD, 160);
		label1.setFont(font);
		label1.setForeground(Color.WHITE);
		panel3.add(label1);

		
		
		
		JPanel panel4=new JPanel();
		panel4.setBackground(new Color(255,11,90));
		panel4.setPreferredSize(new Dimension(500,400));
		panel4.setLayout(new BorderLayout());
		
		
		//---------panel4subpanelsstart---------
		
		
		JPanel panel5=new JPanel();
		panel5.setPreferredSize(new Dimension(200,270));
		panel5.setBackground(new Color(255,11,90));
		panel5.setLayout(new FlowLayout(FlowLayout.LEFT,100,200));

		
		label2.setText("Write your name: ");
		font=new Font("Monospaced", Font.BOLD, 40);
		label2.setFont(font);
		label2.setForeground(Color.white);
		panel5.add(label2);
		
		
		
		JPanel panel6=new JPanel();
		panel6.setPreferredSize(new Dimension(200,390));
		panel6.setBackground(new Color(255,11,90));
		panel6.setLayout(new FlowLayout(FlowLayout.LEFT,100,0));

		
		textfield=new JTextField();
		textfield.setPreferredSize(new Dimension(700,50));
		textfield.setFont(new Font("consolas",font.PLAIN,25));
		panel6.add(textfield);
		
		
		JPanel panel7=new JPanel();
		panel7.setPreferredSize(new Dimension(200,280));
		panel7.setBackground(new Color(255,11,90));
		panel7.setLayout(new FlowLayout(FlowLayout.LEFT,100,10));
		
		button=new JButton("submit");
		button.setFocusable(false);
		panel7.add(button);
		button.addActionListener(this);
		this.getRootPane().setDefaultButton(button);

		
		

		
		panel4.setLayout(new BorderLayout());
		
		panel4.add(panel5,BorderLayout.NORTH);
		panel4.add(panel6,BorderLayout.CENTER);
		panel4.add(panel7,BorderLayout.SOUTH);
		
		
		
		
		//---------panel4subpanelsends---------

		
		
		panel2.setLayout(new BorderLayout());
		
		panel2.add(panel3,BorderLayout.NORTH);
		panel2.add(panel4,BorderLayout.CENTER);

		//---------panel2subpanelsends---------

		
		
		this.add(panel1,BorderLayout.WEST);
		this.add(panel2,BorderLayout.EAST);
		
		
		this.setVisible(true);
	
		
		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button) {
			
			String input=textfield.getText();
			
			if(input.isBlank()) {
				
				JOptionPane.showMessageDialog(button, "try again", "error", JOptionPane.ERROR_MESSAGE);
				
			}
			
			else {
				this.dispose();
				JOptionPane.showMessageDialog(button,"Hello "+input+", you are in!" ,"yay!",  JOptionPane.INFORMATION_MESSAGE);
				button.setEnabled(false);
				textfield.setEditable(false);
				
				secondPage secondpage=new secondPage(input);
				secondpage.setVisible(true);
				
				
				
			}
			
			
			
		}
		
		
	}
	

}
