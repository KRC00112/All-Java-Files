package blockBreaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Ball extends JPanel implements  Runnable {

    int ballx = 200;
    int bally = 200;
    int diameter = 15;

    int width = 600;
    int height = 330;

    int dd = 2;
    int dx = dd;
    int dy = dd;

    Thread thread = new Thread(this);

    Ball() {
        this.setBackground(Color.black);
        this.setBounds(0, 400, width, height);
        thread.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillOval(ballx, bally, diameter, diameter);
    }



    @Override
    public void run() {
        while (true) {
            ballx = ballx + dx;
            bally = bally + dy;
            
            
            
            if (ballx < 0) {
                dx = -dx;
                ballx = 0;
            }
            if (ballx + diameter > width) {
                dx = -dx;
                ballx = width - diameter;
            }

            if (bally< 0) {
                dy = -dy;
                bally = 0;
            }
            if (bally + diameter > height) {
                dy = -dy;
                bally = height - diameter;
            }

           

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
