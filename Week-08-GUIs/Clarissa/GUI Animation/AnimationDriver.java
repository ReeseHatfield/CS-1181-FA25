import javax.swing.*;

public class AnimationDriver
{
    public static void main(String[] args)
    {
        JFrame mainWindow = new JFrame("Animation Example");
        Shapes mainPanel = new Shapes(100, 75, 75);

        mainWindow.setContentPane(mainPanel);
        mainWindow.setSize(900, 700);
        mainWindow.setLocation(50, 50);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);

        mainPanel.animate();
    }
}
