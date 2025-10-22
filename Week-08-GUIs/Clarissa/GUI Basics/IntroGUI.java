import javax.swing.*;

public class IntroGUI
{
    public static void main(String[] args)
    {
        JFrame mainWindow = new JFrame("Welcome to GUI!");
        mainWindow.setSize(700, 500);
        mainWindow.setLocation(100, 100);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("hey what's up!");
    }
}
