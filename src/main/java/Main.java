import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    private int x = 200;
    private int y = 150;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(x, y, 80, 80);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("CSC360 - Moving Square");

        Main panel = new Main();

        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}