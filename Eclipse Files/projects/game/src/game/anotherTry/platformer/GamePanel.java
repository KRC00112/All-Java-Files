package game.anotherTry.platformer;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener{
	
	private static final long SerialVersionUID=1L;
	
	public static final int WIDTH=800;
	public static final int HEIGHT=600;
	
	
	private Thread thread;
	private boolean isRunning=false;
	
	private int FPS=60;//60 frames passes in 1 sec 
	private int targetTime=1000/FPS;//reciprocal of FPS, time taken by each frame.16 secs to each frame is assigned
	
	
	private GameStateManager gsm;
	
	public GamePanel() {
		
		
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		start();
		
		
		
	
	}
	
	private void start() {
		
		isRunning=true;
		thread=new Thread(this);
		thread.start();
		
		
		
	}
	
	public void run() {

		long start,elapsed,wait;
		
		gsm=new GameStateManager();
		
		while(isRunning) {
			
			start=System.nanoTime();//current system time
			
			tick();
			repaint();
			
			elapsed= System.nanoTime()-start;//currently running system time- the one we assigned at the start
			wait=targetTime-elapsed/1000000;
//			System.out.println(wait);
			
			if(wait<=0) {
				
				wait=5;
				
			}
			
			try {
				thread.sleep(wait);
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			
		}
		
		
	}
	
	
	public void tick() {
		
		gsm.tick();
		
//		System.out.println("Running");
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.clearRect(0, 0, WIDTH, HEIGHT);
		gsm.draw(g);		
	}
	
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		gsm.keyPressed(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		gsm.keyReleased(e.getKeyCode());
		
	}

	
	
	

}
