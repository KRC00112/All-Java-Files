package game.anotherTry.platformer;

import java.awt.Graphics;

public abstract class GameState {


	protected GameStateManager gsm;
	protected GameState(GameStateManager gsm) {
		
		this.gsm=gsm;
		init();
		
	}

	public abstract void init();
	public abstract void tick();
	public abstract void draw(Graphics g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	
}
