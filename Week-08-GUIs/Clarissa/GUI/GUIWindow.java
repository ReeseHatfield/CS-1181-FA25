import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWindow extends JFrame
{
    private int clickCount = 0;
    private int multiplier = 1;

    public GUIWindow(String title)
    {
        super(title);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel manyButtonPanel = new JPanel(new GridLayout(3, 10));
        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new BoxLayout(centralPanel, BoxLayout.Y_AXIS));

        JLabel instructions = new JLabel("Click the button below to get points!");
        JLabel score = new JLabel("Score: ");

        JButton cookieClicker = new JButton("Click me!");
        cookieClicker.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                clickCount++;
                String scoreText = "Score: " + (clickCount * multiplier);
                score.setText(scoreText);
            }
        });

        JLabel multiplierLabel = new JLabel();
        multiplierLabel.setText("Multiplier: 1");

        JButton multiplierButton = new JButton();
        multiplierButton.setText("Multiplier");
        multiplierButton.addActionListener(e -> {
            multiplier++;
            multiplierLabel.setText("Multiplier: " + multiplier);
        });

        // sometimes directly setting the size of a component via setSize
        // does not work depending on our layout manager
        //cookieClicker.setSize(100, 100);
        cookieClicker.setPreferredSize(new Dimension(200, 400));
        centralPanel.add(instructions);
        centralPanel.add(score);
        centralPanel.add(multiplierLabel);
        centralPanel.add(multiplierButton);
        centralPanel.add(cookieClicker);
        mainPanel.add(centralPanel, BorderLayout.CENTER);

        JButton helloButton = new JButton("Hello!");
        helloButton.addActionListener(new ButtonListener());
        mainPanel.add(helloButton, BorderLayout.NORTH);

        class GridButtonListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                clickCount--;
                String scoreText = "Score: " + clickCount;
                score.setText(scoreText);
            }
        }

        for (int i = 0; i < 30; i++)
        {
            JButton button = new JButton("Button #" + i);
            button.addActionListener(new GridButtonListener());
            manyButtonPanel.add(button);
        }

        mainPanel.add(manyButtonPanel, BorderLayout.SOUTH);
        this.add(mainPanel);
    }
}
