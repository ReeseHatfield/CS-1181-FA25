import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 600, 300);
        g.setColor(Color.RED);
        g.fillRect(100, 100, 500, 500);
        g.setColor(Color.GREEN);
        g.fillOval(this.getWidth() - 50, (this.getHeight() / 2) - 25, 50, 50);
    }
}
