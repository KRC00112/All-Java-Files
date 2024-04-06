package accelarationAnimation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Panel extends JPanel implements KeyListener, Runnable {

    int x = 200;
    int y = 300;
    int acc=1;
    int xSpeed = acc*1;
    int ySpeed = acc*1;
    
    
    private boolean isMoving = false;

    Panel() {
        this.setPreferredSize(new Dimension(500, 600));
        this.setFocusable(true);
        this.addKeyListener(this);

        // Start a separate thread for automatic movement
        Thread thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.orange);
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_ENTER) {
            isMoving = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void run() {
        while (true) {
            if (isMoving) {
                // Update ball position
                x += xSpeed;
                y += ySpeed;

                // Check for collisions with panel borders
                if (x < 0 || x > this.getWidth() - 50) {
                    xSpeed = -xSpeed; // Reverse the horizontal direction
                    acc++;
                    
                }
                if (y < 0 || y > this.getHeight() - 50) {
                    ySpeed = -ySpeed; // Reverse the vertical direction
                    acc++;
                }

                
                
                
                
                repaint(); // Repaint to update the ball position
            }

            try {
                Thread.sleep(10); // Adjust the sleep duration based on your desired speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}