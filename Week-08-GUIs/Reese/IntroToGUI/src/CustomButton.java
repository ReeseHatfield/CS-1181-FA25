import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CustomButton extends JButton implements ActionListener {
    
    JFrame rootFrame;

    public CustomButton(JFrame root){

        
        super("I am a custom button");

        this.rootFrame = root;

        // this.setText("I am a custom button");

        this.setBackground(Color.RED);


        // this.addActionListener(e -> {
        //     System.out.println("hello");
        // });

        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        int sum = 0;

        for(int i = 0; i < 100000000; i++){
            sum += i;
        }

        System.out.println(sum);

        // this.rootFrame.dispose();

        // RIGHT HERE

        // int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        // int width = Toolkit.getDefaultToolkit().getScreenSize().width;


        // for(int i = 0; i < 10; i ++){
        //     JFrame frame = new JFrame();
        //     frame.setLocation((int) (Math.random() * height), (int) (Math.random() * width));
            
        //     frame.setSize(100,100);
        //     frame.setVisible(true);
        // }
    }
}
