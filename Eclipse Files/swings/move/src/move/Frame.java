package move;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame {
	
	
	Frame(){
		
		Panel panel=new Panel();
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1360, 760);
        setVisible(true);
        add(panel);
        
        
        
    }
	

}
