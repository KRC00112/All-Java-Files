package game.anotherTry.platformer;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

public class GameStateManager {
	
	
	private Stack<GameState> states;
	
	public GameStateManager() {
		
		states=new Stack<GameState>();
		
		
		
	}
	
	public void tick() {
		
		states.peek().tick();
		
	}
	
	public void draw(Graphics g) {
		
		
		states.peek().draw(g);
		
	}

	

	public void keyPressed(int k) {
		// TODO Auto-generated method stub
		
		states.peek().keyPressed(k);

		
		
	}

	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		states.peek().keyReleased(k);
		
	}
	
	
	
	
	

}
