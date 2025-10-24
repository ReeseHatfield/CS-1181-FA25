import javax.swing.*;
import java.awt.*;

public class Ball extends JComponent {
    public int x = 78;
    public int y = 1;
    public int diameter = 50;


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);

        // g.drawOval(x, y, diameter, diameter);
        g.fillOval(x, y, diameter, diameter);

        g.fillRect(x + 50, y + 50, 60, 30);

        // g.drawRect(x, y, diameter, diameter);
    }

}
