package org.example;

import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    private int x = 100;
    private int y = 100;

    public Square() {
        Timer timer = new Timer(20, e -> {
            x += 2;

            if (x > getWidth()) {
                x = -50;
            }

            repaint();
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Square");

        Square square = new Square();

        frame.add(square);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
