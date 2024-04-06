package anotherTry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jump extends JPanel implements ActionListener {
    private Timer timer;
    private Player player;

    public Jump() {
        player = new Player();
        timer = new Timer(1000 / 60, this); // 60 FPS
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw player
        g.setColor(Color.BLUE);
        g.fillRect(player.getX(), player.getY(), player.getWidth(), player.getHeight());
        // Draw platforms, obstacles, etc.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Platformer Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new Jump());
        frame.setVisible(true);
    }
}

class Player {
    private int x, y, width, height;
    private int velocityY;
    private final int jumpHeight = 100;
    private final int jumpDuration = 30;
    private final double gravity = calculateGravity();

    public Player() {
        x = 100;
        y = 400;
        width = 50;
        height = 50;
    }

    public void update() {
        if (isJumping()) {
            velocityY -= gravity;
            y -= velocityY;
        }
        // Handle collisions with platforms, obstacles, etc.
    }

    public void jump() {
        if (!isJumping()) {
            velocityY = (int) Math.sqrt(2 * jumpHeight * gravity);
        }
    }

    private boolean isJumping() {
        return velocityY != 0;
    }

    private double calculateGravity() {
        return (double) jumpHeight / (2 * Math.pow(jumpDuration, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
