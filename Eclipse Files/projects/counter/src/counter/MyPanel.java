package counter;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener,Runnable{
	
	Thread thread=new Thread(this); 
	
	JLabel count=new JLabel();
	JButton button1;
	JButton button2;

	Font font;
	int num=0;
	
	boolean isRunning;
	
	public MyPanel() {
		
		
		setPreferredSize(new Dimension(50,40));
		
		
		
		
		add(count);
		button1=new JButton("start");
		button1.addActionListener(this);
		button1.setVisible(true);
		
		button2=new JButton("stop");
		button2.addActionListener(this);
		button2.setVisible(false);
		
		add(button1);
		add(button2);
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==button1) {
			
			 isRunning=true;
			thread.start();
			button1.setVisible(false);
			button2.setVisible(true);		
		}
		if(e.getSource()==button2) {
			
			 isRunning=false;
			button1.setVisible(true);
			button2.setVisible(false);		
		}
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		while(isRunning) {
			
			
			int x=num++;
			
			String y=String.valueOf(x);
			
			count.setText(y);
			
			
			try {
				thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
				
				
			}
			
		}
		
		
		
	}
	
	
	
	

}
