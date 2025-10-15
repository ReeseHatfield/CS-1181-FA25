import javax.swing.*;
import java.awt.*;

public class GUIWindow extends JFrame
{
    private int clickCount = 0;

    public GUIWindow(String title)
    {
        super(title);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel manyButtonPanel = new JPanel(new GridLayout(3, 10));

        JButton cookieClicker = new JButton("Click me!");
        JButton helloButton = new JButton("Hello!");
        //cookieClicker.setSize(100, 100);
        cookieClicker.setPreferredSize(new Dimension(500, 500));
        mainPanel.add(cookieClicker, BorderLayout.CENTER);
        mainPanel.add(helloButton, BorderLayout.NORTH);

        for (int i = 0; i < 30; i++)
        {
            manyButtonPanel.add(new JButton("Button #" + i));
        }

        mainPanel.add(manyButtonPanel, BorderLayout.SOUTH);
        this.add(mainPanel);
    }
}
