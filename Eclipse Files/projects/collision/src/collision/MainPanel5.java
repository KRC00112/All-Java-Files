package collision;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MainPanel5 extends JPanel implements ActionListener{
	
	
	int x=30;
	int y=30;
	
	
	MainPanel5(){
		
		this.setPreferredSize(new Dimension(600,500));
		this.setFocusable(true);
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.red);
		
		int i=0;
		
		for(i=0;i<30;i++) {
		g.fillOval(x, y, 30, 30);
		
		
		repaint();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
