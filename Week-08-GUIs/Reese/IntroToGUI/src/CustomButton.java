import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CustomButton extends JButton implements ActionListener {
    

    public CustomButton(){

        super("I am a custom button");

        // this.setText("I am a custom button");

        this.setBackground(Color.RED);


        // this.addActionListener(e -> {
        //     System.out.println("hello");
        // });

        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;


        for(int i = 0; i < 10; i ++){
            JFrame frame = new JFrame();
            frame.setLocation((int) (Math.random() * height), (int) (Math.random() * width));
            
            frame.setSize(100,100);
            frame.setVisible(true);
        }
    }
}
