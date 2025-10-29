import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIWindow extends JFrame
{
    private int clickCount = 0;
    private int multiplier = 1;
    private Timer countdownTimer;
    private int countdown = 5;
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

        JPanel cookiePanel = new JPanel();
        JButton cookieClicker = new JButton("Click me!");
        cookieClicker.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                clickCount = clickCount + multiplier;
                String scoreText = "Score: " + clickCount;
                score.setText(scoreText);
            }
        });
        cookieClicker.setIcon(new ImageIcon("cookie.jpg"));
        cookiePanel.add(cookieClicker);

        JLabel multiplierLabel = new JLabel();
        multiplierLabel.setText("Multiplier: 1x");

        JLabel multiplierTimer = new JLabel();

        JButton multiplierButton = new JButton();
        multiplierButton.setText("Multiplier");
        multiplierButton.addActionListener(e -> {
            multiplierButton.setEnabled(false);
            multiplier++;
            countdown = 5;
            multiplierLabel.setText("Multiplier: " + multiplier + "x");
            multiplierTimer.setText("Time remaining: " + countdown + "s");
            repaint();
            revalidate();

            countdownTimer = new Timer(1000, timedEvent -> {
                countdown--;

                if (countdown > 0)
                {
                    multiplierTimer.setText("Time remaining: " + countdown + "s");
                }
                else
                {
                    multiplierTimer.setText(" ");
                    multiplier = 1;
                    multiplierLabel.setText("Multiplier: " + multiplier + "x");
                    countdownTimer.stop();
                    multiplierButton.setEnabled(true);
                }
            });
            countdownTimer.start();

            multiplierTimer.setText("");
            // this code will pause the entire EDT
            // no other actions can be taken (like updating label text)
            // any interactions the user makes are recorded but not acted upon
            // until button completes
//            for (int i = 5; i > 0; i--)
//            {
//                try
//                {
//                    multiplierTimer.setText("Time remaining: " + i + "s");
//                    revalidate();
//                    repaint();
//                    Thread.sleep(1000);
//                }
//                catch (InterruptedException ie)
//                {
//                    System.out.println("Oops!");
//                }
//            }
        });

        // sometimes directly setting the size of a component via setSize
        // does not work depending on our layout manager
        //cookieClicker.setSize(100, 100);
        cookieClicker.setPreferredSize(new Dimension(300, 300));
        centralPanel.add(instructions);
        centralPanel.add(score);
        centralPanel.add(multiplierLabel);
        centralPanel.add(multiplierTimer);
        centralPanel.add(multiplierButton);
        centralPanel.add(cookiePanel);
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
