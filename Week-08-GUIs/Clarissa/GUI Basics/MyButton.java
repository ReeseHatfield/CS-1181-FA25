import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener
{
    public MyButton()
    {
        super();
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("MyButton was clicked!!!");
    }
}
