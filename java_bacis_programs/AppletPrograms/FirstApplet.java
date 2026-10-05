import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class FirstApplet extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draws a line from (20, 20) to (180, 80)
        g.drawLine(20, 20, 180, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Drawing Example");
        FirstApplet panel = new FirstApplet();

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}