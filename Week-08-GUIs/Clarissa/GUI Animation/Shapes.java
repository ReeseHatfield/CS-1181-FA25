import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel
{
    private int circleX = 0;
    private int circleY = 0;
    private int diameter = 50;
    private int rightSide = circleX + diameter;
    private int bottomSide = circleY + diameter;
    private int xSpeed = 2;
    private int ySpeed = 1;

    public Shapes()
    {

    }

    public Shapes(int diameter, int xSpeed, int ySpeed)
    {
        circleX = 0;
        circleY = 0;

        this.diameter = diameter;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

        rightSide = circleX + diameter;
        bottomSide = circleY + diameter;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
//        g.setColor(Color.BLACK);
//        g.drawRect(100, 100, 600, 300);
//        g.setColor(Color.RED);
//        g.fillRect(100, 100, 500, 500);
//        g.setColor(Color.GREEN);
//        g.fillOval(this.getWidth() - 50, (this.getHeight() / 2) - 25, 50, 50);
        g.setColor(Color.MAGENTA);
        g.fillOval(circleX, circleY, diameter, diameter);
    }

    public void animate()
    {
        while (true)
        {
            moveCircle();
            // checks for bottom edge collision
            if (this.getHeight() <= bottomSide)
            {
                changeDirection(false);
            }
            // checks for right edge collision
            if (this.getWidth() <= rightSide)
            {
                changeDirection(true);
            }
            // check for top edge collision
            if (0 >= circleY)
            {
                changeDirection(false);
            }
            // check for left edge collision
            if (0 >= circleX)
            {
                changeDirection(true);
            }

            invalidate();
            repaint();

            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException ie)
            {
                System.out.println("Error!");
            }
        }
    }

    public void changeDirection(boolean isXDirection)
    {
        if (isXDirection)
        {
            xSpeed *= -1;
        }
        else
        {
            ySpeed *= -1;
        }
    }

    public void moveCircle()
    {
        circleX = circleX + xSpeed;
        circleY = circleY + ySpeed;
        rightSide = circleX + diameter;
        bottomSide = circleY + diameter;
    }
}
