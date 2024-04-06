package blockBreaker;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	Slider sliderPanel=new Slider();
	Blocks blocks=new Blocks();
	Ball ball=new Ball();

	
	GamePanel(){
		
		this.setLayout(null);
		this.setPreferredSize(new Dimension(600,780));
		this.setBackground(Color.black);
		
		this.add(sliderPanel);
		this.add(ball);
		this.add(blocks);
		
		
		
		
		
	}
	
	

	
	
	

}
