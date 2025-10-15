import javax.swing.*;

public class GUIDriver
{
    public static void main(String[] args)
    {
        JFrame gui = new GUIWindow("Hello");
        gui.setSize(700, 500);
        gui.setLocation(100, 100);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
