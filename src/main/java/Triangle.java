import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangle extends JPanel implements KeyListener {

    private int x = 250;
    private int y = 150;

    public Triangle() {
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] xPoints = {x, x - 50, x + 50};
        int[] yPoints = {y - 60, y + 40, y + 40};

        g.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            x -= 10;
        }
        else if (key == KeyEvent.VK_RIGHT) {
            x += 10;
        }
        else if (key == KeyEvent.VK_UP) {
            y -= 10;
        }
        else if (key == KeyEvent.VK_DOWN) {
            y += 10;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("CSC360 - Moving Triangle");

        Triangle panel = new Triangle();

        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.requestFocusInWindow();
    }
}