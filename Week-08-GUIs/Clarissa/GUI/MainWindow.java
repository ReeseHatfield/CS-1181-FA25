import javax.swing.*;

public class MainWindow extends JFrame
{
    private int clickCount = 0;

    public MainWindow(String title)
    {
        super(title);
        clickCount = 0;
    }

    public static void main(String[] args)
    {
        JFrame window = new MainWindow("Testing");
        window.setSize(700, 500);
        window.setLocation(100, 100);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
