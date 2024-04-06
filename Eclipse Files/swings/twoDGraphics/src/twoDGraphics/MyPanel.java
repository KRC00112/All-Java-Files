package twoDGraphics;

import java.awt.*;


import javax.swing.*;

public class MyPanel extends JPanel {

	
	Image image;
	
	MyPanel(){
		
		image=new ImageIcon("cloud.png").getImage();
		this.setPreferredSize(new Dimension(500,500));
//		this.setBackground(Color.yellow);
		this.setBackground(Color.white);
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setPaint(Color.black);
        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(0, 0, 500, 500);
//        
//        
        g2D.setPaint(Color.black);
        g2D.drawRect(0, 0, 100, 100);
        g2D.fillRect(0, 0, 100, 100);
//        
//        g2D.setPaint(Color.orange);
//        g2D.drawOval(250, 250, 100, 100);
//        g2D.setPaint(Color.yellow);
//        g2D.fillOval(250, 250, 40, 40);
        
//       pokeball 
        g2D.setStroke(new BasicStroke(20));
        g2D.setPaint(Color.black);
        g2D.drawArc(150, 150, 200, 200, 0, 180);
        g2D.setPaint(Color.red);
        g2D.fillArc(150, 150, 200, 200, 0, 180);
        g2D.setStroke(new BasicStroke(15));
        g2D.setPaint(Color.black);
        g2D.drawLine(151, 250, 349,250);
        g2D.setStroke(new BasicStroke(20));
        g2D.drawArc(150, 155, 200, 200, 180, 180);
        g2D.setPaint(Color.white);
        g2D.fillArc(150, 155, 200, 200, 180, 180);
        g2D.setPaint(Color.black);
        g2D.fillArc(226, 225, 50, 50, 0, 360);
        g2D.setPaint(Color.white);
        g2D.fillArc(236, 235, 30, 30, 0, 360);

        
//        int[] xpoints={150,150,300,300};
//        int[] ypoints= {150,350,350,150};
//        g2D.setPaint(Color.yellow);
//        g2D.fillPolygon(xpoints,ypoints,4);
//        g2D.drawPolygon(xpoints,ypoints,4);
//        
//        g2D.setPaint(new Color(235,235,243));
//        g2D.fillOval(150, 130, 200, 200);
//        
//        g2D.setPaint(Color.white);
//        
//        g2D.setFont(new Font("Ink Free",Font.BOLD,50));
//
//        g2D.drawString("Night",50,50);
//        
//        g2D.drawImage(image, 0, 0, null);
        
        
        
        
	}
	
	
	
	
	
	

}
