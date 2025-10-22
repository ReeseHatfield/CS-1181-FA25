import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWindow extends JFrame
{
    private int clickCount = 0;
    private int multiplier = 1;
    private JPanel mainPanel = new JPanel(new BorderLayout());
    private JSlider fontSizeSlider = new JSlider();
    private JLabel instructions = new JLabel("Click the button below to get points!");
    private JLabel score = new JLabel("Score: ");
    private JButton test = new MyButton();
    private JPanel sliderPanel = new JPanel();

    public GUIWindow(String title)
    {
        super(title);

        JPanel manyButtonPanel = new JPanel(new GridLayout(3, 10));
        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new BoxLayout(centralPanel, BoxLayout.Y_AXIS));

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

        JLabel multiplierTimer = new JLabel("Timer");

        JButton multiplierButton = new JButton();
        multiplierButton.setText("Multiplier");
        multiplierButton.addActionListener(e -> {
            multiplier++;
            multiplierLabel.setText("Multiplier: " + multiplier);

            for (int i = 5; i > 0; i--)
            {
                try
                {
                    multiplierTimer.setText("Time remaining: " + i + "s");
                    revalidate();
                    repaint();
                    Thread.sleep(1000);
                }
                catch (InterruptedException ie)
                {
                    System.out.println("Oops!");
                }
            }
            multiplierTimer.setText("");
        });

        // sometimes directly setting the size of a component via setSize
        // does not work depending on our layout manager
        //cookieClicker.setSize(100, 100);
        cookieClicker.setPreferredSize(new Dimension(200, 400));
        centralPanel.add(instructions);
        centralPanel.add(score);
        centralPanel.add(multiplierLabel);
        centralPanel.add(multiplierTimer);
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

        sliderSetup();
        sliderPanel.add(fontSizeSlider);
        sliderPanel.add(test);
        mainPanel.add(sliderPanel, BorderLayout.EAST);
        mainPanel.add(manyButtonPanel, BorderLayout.SOUTH);
        this.add(mainPanel);
    }

    private void sliderSetup()
    {
        fontSizeSlider.setMajorTickSpacing(3);
        fontSizeSlider.setMinorTickSpacing(1);
        fontSizeSlider.setMaximum(30);
        fontSizeSlider.setMinimum(1);
        fontSizeSlider.setName("font size selector");
        fontSizeSlider.setPaintTicks(true);
        fontSizeSlider.setPaintLabels(true);
        fontSizeSlider.setValue(5);
        fontSizeSlider.addChangeListener(e -> {
            int size = fontSizeSlider.getValue();
            instructions.setFont(new Font("Comic Sans MS", Font.ITALIC, size));
        });
    }
}
