package opener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Playground extends JPanel implements KeyListener,MouseMotionListener,ActionListener {
	
	int linex1;
	int linex2;
	int liney1;
	int liney2;
	
	
	int re;
	int gr;
	int bl;
	String switchStatus;
	
	int playerX=540;
	int playerY=480;
	
	int switchX=203;
	int switchY=316;
	
	int mouseX;
	int mouseY;
	
	int doorCloseX=700;
	int doorCloseY=250;
	
	
	int keyX=100;
	int keyY=300;

	boolean paintCloseDoor=true;
	boolean paintOpenDoor=false;
	boolean paintKey=true;
	boolean promptToOpen=false;
	boolean switchOn=false;
	boolean getKey=false;
	int keyr=164;
	int keyg=247;
	int keyb=82;
	Image ghost;
	
	boolean showGhost=false;
	int switchCount=0;
	
	boolean showEndScreen=false;
	
	boolean warning1=false;
	boolean warning2=false;
	boolean warning3=false;
	
	Font font;
	Font font2;

	
//	boolean doorSlightOpen=false;
	
	
	
	int playerSpeed=20;
	
	JPanel buttonsPanel;
	
	JButton reset;
	JButton quit;
	Playground(){
		
		
		font2=new Font(Font.MONOSPACED,Font.PLAIN,30);
		
		ghost=new ImageIcon("src/opener/angyGhost.png").getImage();

		
		this.setPreferredSize(new Dimension(1000,700));
		this.setBackground(new Color(108,164,191));
		this.setFocusable(true);
		this.addKeyListener(this);
		this.addMouseMotionListener(this);
		
	

		this.setLayout(null);
			 buttonsPanel=new JPanel();
			
			
			
			 reset=new JButton("Reset");
			 reset.setFocusPainted(false);
			 reset.setBackground(Color.BLACK);
			 reset.setForeground(Color.WHITE);
			 reset.setFont(font2);
			 reset.addActionListener(this);
			
			 quit=new JButton("Quit");
			 quit.setFocusPainted(false);
			 quit.setBackground(Color.BLACK);
			 quit.setForeground(Color.WHITE);
			 quit.setFont(font2);
			 quit.addActionListener(this);
			
			buttonsPanel.add(reset);
			buttonsPanel.add(quit);
			
			buttonsPanel.setBounds(365, 300, 200, 200);
			buttonsPanel.setLayout(new GridLayout(2,1));
			
			this.add(buttonsPanel);
			
			buttonsPanel.setVisible(false);
		
		

		
		
	
		
		
		
		
		
		
		
	}
	
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D) g;
		

		
		g.setColor(new Color(164, 247, 82));
		
		g.fillRect(0, 0, 270, 450);
		
		g.fillRect(400, 0, this.getWidth(), 450);
		
		
		
		g.setColor(new Color(89, 179, 0));
		
		int wxPoints[]= {270,400,400,270};
		int wyPoints[]= {0,0,380,450};
		
		
		
		
		
		g.fillPolygon(wxPoints, wyPoints, 4);
		
		g.setColor(new Color(164, 247, 82));
		g.fillRect(270, 0, 150, 252);
		
		
		
		g.setColor(Color.black);
		
		g.drawString("x coordinate of player: "+playerX, 630, 15);
		g.drawString("y coordinate of player: "+playerY, 800, 15);
		
		g.drawString("x coordinate of key: "+keyX, 630,40);
		g.drawString("y coordinate of key: "+keyY, 800, 40);
		
		if(paintOpenDoor==true) {
			doorOpen(g);
		
		}
		
		if(paintCloseDoor==true) {
			doorClose(g2d,g,doorCloseX,doorCloseY);
		}
	
		
		
		
		
		
		
		player(g,playerX,playerY);
		
		
		if(paintKey==true) {
			key(g,keyX,keyY);
		
		}
		
		if(promptToOpen==true) {
		
		g.setColor(Color.black);
		g.drawString("[press ENTER to open the door]", 707, 215);
		
		}
		
		
		pictureFrames(g,465,300);
		
		if(getKey==true) {
		g.setColor(Color.black);
		g.drawString("[Get the key first]", 740, 215);
		}
		
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(switchX, switchY, 25, 25);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(switchX+5, switchY+5, 15, 15);
		g.setColor(Color.white);
		g.fillRect(213, 200, 5, 116);
		g.setColor(Color.white);
		g.fillRect(215, 200, 110, 5);
		
		if(switchOn==true) {
			
			re=252;
			gr=248;
			bl=3;
			
			switchStatus="1";
			
		
			
		
			
		}
		
		else if(switchOn==false){
			
			re=255;
			gr=255;
			bl=255;
			
			switchStatus="0";
			
			g.setColor(new Color(0, 0, 0, 200));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			
			
			
		}
		
		
		
		
		g.setColor(new Color(re,gr,bl));
		g.fillOval(307, 192, 20, 20);
		
		g.setColor(Color.black);
		g.drawString(switchStatus, 212, 332);
		
		
		
//		remove this to remove boundary		
//		linex1=0;
//		linex2=this.getWidth();
//		liney1=450;
//		liney2=450;
//		
//		g.setColor(Color.black);
//		g.drawLine(linex1, liney1, linex2, liney2);
		
		
		if(showGhost==true) {
		
			
			g2d.drawImage(ghost, 500, 400, 100,100,null);
			g2d.drawString("Hey fuck face That's My job.", 430, 365);
			g2d.drawString("Do that again and i will fucking break your legs.", 430, 385);
			if(warning1==true) {
				g2d.drawString("I am warning you.", 430, 410);
			}
			if(warning2==true) {
				g2d.drawString("one more time...", 560, 410);
				g2d.drawString("see what happens", 580, 425);
			}
			
			if(warning3==true) {
			
				g2d.drawString("ALRIGHT! THAT'S IT ", 405, 470);
			
			}

			
			
			g2d.setColor(new Color(0,0,0,50));
			g2d.fillOval(500, 500, 100, 30);

			
			
			
		
		}
		
		
		if(showEndScreen==true) {
		
			font=new Font(Font.MONOSPACED,Font.BOLD,27);
	
			
			g2d.setColor(Color.BLACK);
			g2d.fillRect(0, 0, this.getWidth(), this.getWidth());
			
			g2d.setFont(font);
			g2d.setColor(Color.white);
			g2d.drawString("Ending #1", (this.getWidth()/3+60), (this.getHeight()/3-70));

			g2d.drawString("Blinky killed you", (this.getWidth()/3), (this.getHeight()/3));
		
		
		}
		
		
		
		

		
	}
	
	
	public void player(Graphics g,int playerX,int playerY) {
		
		g.setColor(new Color(3, 15, 252));
		g.fillRect(playerX, playerY, 50, 50);
		
		
		
	}
	
	
	
	public void doorClose(Graphics2D g2d, Graphics g ,int doorX, int doorY) {
		
		
		
		
		g2d.setColor(new Color(252, 194, 33));
		g2d.fillRect(doorX, doorY, 180, 200);
		
		
		g2d.setColor(new Color(161, 75, 5));
		g2d.fillOval(doorX+10, doorY+100, 20, 20);
		
		g2d.setColor(new Color(161, 75, 5));
		g2d.fillRect(868, 303, 20, 20);
		
		g2d.setColor(new Color(161, 75, 5));
		g2d.fillRect(868, 370, 20, 20);
		
	
		
		
		
		
		
		
	}
	

	public void pictureFrames(Graphics g,int frameX,int frameY) {
		
		g.setColor(new Color(181, 103, 7));
		g.fillRect(frameX, frameY, 50, 50);
		
		g.setColor(Color.pink);
		g.fillRect(frameX+15, frameY+15, 20, 20);
		
		
		
		g.setColor(new Color(181, 103, 7));
		g.fillRect(frameX+130, frameY, 50, 50);
		
		g.setColor(Color.cyan);
		g.fillRect(frameX+130+15, frameY+15, 20, 20);
		
		
		
		
	}
	
	

	
	
	
	
	
	
	public void doorOpen(Graphics g) {
		
		
		
		
		
		
		g.setColor(Color.black);
		g.fillRect(700, 250, 180, 200);
		g.setColor(new Color(78,127,144));
		g.fillRect(730, 400, 150, 30);
		g.setColor(new Color(78,127,144));
		g.fillRect(760, 350, 120, 30);
		g.setColor(new Color(78,127,144));
		g.fillRect(790, 300, 90, 30);
		g.setColor(new Color(78,127,144));
		g.fillRect(820, 250, 60, 30);
		
		
		
		//topleft,topright,bottomright,bottomleft
		
		g.setColor(new Color(108,164,191));
		int[] x1Points= {730,880,880,700};
		int[] y1Points= {430,430,450,450};
		g.fillPolygon(x1Points, y1Points, 4);
		
		
		g.setColor(new Color(103,163,188));
		int[] x2Points= {760,880,880,730};
		int[] y2Points= {380,380,400,400};
		g.fillPolygon(x2Points, y2Points, 4);
		
		g.setColor(new Color(103,163,188));
		int[] x3Points= {790,880,880,760};
		int[] y3Points= {330,330,350,350};
		g.fillPolygon(x3Points, y3Points, 4);
		
		g.setColor(new Color(103,163,188));
		int[] x4Points= {820,880,880,790};
		int[] y4Points= {280,280,300,300};
		g.fillPolygon(x4Points, y4Points, 4);
		
		
		g.setColor(new Color(252, 194, 33));
		int[] dxPoints= {726,880,880,726};
		int[] dyPoints= {279,250,450,480};
		g.fillPolygon(dxPoints, dyPoints, 4);
		
		
		
		g.setColor(new Color(161, 75, 5));
		g.fillOval(743, 380, 20, 20);
		
		
		//868,303
		
		g.setColor(new Color(161, 75, 5));
		int[] h1xPoints= {867+1,879+1,889+1,889+1,879+1,867+1};
		int[] h1yPoints= {296+10+5,288+10+5,288+10+5,308+10+5,308+10+5,316+10+5};
		g.fillPolygon(h1xPoints, h1yPoints, 6);
		//868,370
		g.setColor(new Color(161, 75, 5));
		int[] h2xPoints= {867+1,879+1,889+1,889+1,879+1,867+1};
		int[] h2yPoints= {296+76+6,288+76+6,288+76+6,308+76+6,308+76+6,316+76+6};
		g.fillPolygon(h2xPoints, h2yPoints, 6);

		
		
		
		
		
		
		
		
		
		
		
	}
	public void key(Graphics g, int keyX , int keyY) {
		
		g.setColor(Color.DARK_GRAY);
		g.fillOval(keyX, keyY, 20, 20);
		
		g.setColor(new Color(keyr, keyg, keyb));
		g.fillOval(keyX+5, keyY+5, 10, 10);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(keyX+8, keyY+20, 5, 25);
		g.fillRect(keyX+10, keyY+30, 10, 5);
		g.fillRect(keyX+10, keyY+40, 10, 5);
		
		
		
	}
	
	




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int keyCode=e.getKeyCode();
		
		
		if(keyCode==e.VK_UP) {
			
			
			playerY=playerY-playerSpeed;
			
			
			
		}
		if(keyCode==e.VK_DOWN) {
			
			
			playerY=playerY+playerSpeed;
			
			
			
		}
		if(keyCode==e.VK_RIGHT) {
			
			
			playerX=playerX+playerSpeed;
			
			
			
		}
		
		if(keyCode==e.VK_LEFT) {
			
			
			playerX=playerX-playerSpeed;
			
			
			
		}
		
		
		if(playerX<=keyX+30&&playerY>=keyY-40&&playerX>=keyX-40&&playerY<=keyY+40) {
		
			
			
			
			
				
				keyX=playerX+20;
				keyY=playerY;
				keyr=3;
				keyg=15;
				keyb=252;
			
				
				
				
				
			

				
				
				
				
				
				
			
		
		}
		
		
	if(playerX>=doorCloseX &&playerY>=doorCloseY && playerX<=doorCloseX+160 && playerY<=doorCloseY+150 && e.getKeyCode()==e.VK_ENTER) {
			
			
				getKey=true;
			
	
		}
	else if(getKey==true&&playerX>=doorCloseX &&playerY>=doorCloseY && playerX<=doorCloseX+160 && playerY<=doorCloseY+150 ) {
		
		
		getKey=false;
	

}
		
		
		
		
		if(keyX>=doorCloseX &&keyY>=doorCloseY && keyX<=doorCloseX+160 && keyY<=doorCloseY+150 && e.getKeyCode()==e.VK_ENTER) {
			
			
			paintCloseDoor=false;
			paintKey=false;
//			doorSlightOpen=true;
			paintOpenDoor=true;
			getKey=false;
			
			
	
		}
		
		else if(paintCloseDoor==false&&keyX>=doorCloseX &&keyY>=doorCloseY && keyX<=doorCloseX+160 && keyY<=doorCloseY+150 && e.getKeyCode()==e.VK_ENTER) {
			
			
			paintCloseDoor=true;
			paintKey=true;
//			doorSlightOpen=true;
			paintOpenDoor=false;
			
			
	
		}
		
		
		if(keyX>=doorCloseX &&keyY>=doorCloseY && keyX<=doorCloseX+160 && keyY<=doorCloseY+150 ) {
			
			promptToOpen=true;
			
		}
		
		if(!(keyX>=doorCloseX &&keyY>=doorCloseY && keyX<=doorCloseX+160 && keyY<=doorCloseY+150 )) {
			
			promptToOpen=false;
			
		}
		
		if(paintOpenDoor==true) {
			
			promptToOpen=false;
			
		}

		
		
		
		if(playerX<=0) {
			
			playerX=0;
			
		}
		
		if(playerY<=0) {
			playerY=0;
		}
		
		if(playerX>=this.getWidth()-50) {
			
			playerX=this.getWidth()-50;
			
		}
		if(playerY>=this.getHeight()-50) {
			
			playerY=this.getHeight()-50;
			
		}
		
		
		if(playerY<=liney1) {
			playerY=liney1;
		}
		
		
	
		
		
		if(switchOn==false) {

			if(playerX>=switchX-50 &&playerY>=switchY-50 && playerX<=switchX+20 && playerY<=switchY+30 && e.getKeyCode()==e.VK_ENTER) {
			
			switchOn=true;
			
			switchCount++;
			
			
			}
			
		}
	
		
		else {
			
			if(playerX>=switchX-50 &&playerY>=switchY-50 && playerX<=switchX+20 && playerY<=switchY+30 && e.getKeyCode()==e.VK_ENTER) {
			
			switchOn=false;
			
			switchCount++;

			
			}
			
		}
		
		if(switchCount>=11) {
			showGhost=true;
		}
		if(switchCount>=12) {
			warning1=true;
		}
		if(switchCount>=13) {
			warning2=true;
		}
		
		if(switchCount>=14) {
			warning3=true;

			showEndScreen=true;
			
			
		}
		
		
		if(showEndScreen==true) {
			buttonsPanel.setVisible(true);
		
		}
		




		
		
		
		
		
		

		repaint();

	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		mouseX=e.getX();
		mouseY=e.getY();
		
		System.out.println("x of Mouse: "+mouseX);
		System.out.println("y of Mouse: "+mouseY);
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==quit) {
			
			 new Main().frame.dispose();
			
			
			
			
		}
		
		if(e.getSource()==reset) {
			
			
			paintCloseDoor=true;
			paintKey=true;
			paintOpenDoor=false;

			
			playerX = 540;
		    playerY = 480;
		    
		    // Reset key position
		    keyX = 100;
		    keyY = 300;
		    
		    // Reset switch status
		    switchOn = false;
		    switchCount = 0;
		    
		    showEndScreen=false;
		    showGhost=false;
		    warning1=false;
		    warning2=false;
		    warning3=false;
		    
		     keyr=164;
			 keyg=247;
			 keyb=82;
		    
		    buttonsPanel.setVisible(false);
		    
		    // Reset any other relevant variables
		    
		    // Repaint the game panel to reflect the reset state
		    repaint();
			
			
		}
		
		
		
	}
	
	
	
	
	

}
