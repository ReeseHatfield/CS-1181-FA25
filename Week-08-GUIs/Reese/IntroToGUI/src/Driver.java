import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Driver {

    private int timesClicked = 0;

    public Driver(){
        // first create
        JFrame frame = new JFrame();
        
        
        // modify 
        frame.setSize(500, 500);
        frame.setTitle("My First GUI program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       

        JPanel root = new JPanel();

        JLabel text1 = new JLabel("Hello world");
        root.add(text1);

        JLabel text2 = new JLabel("My name is Reese");
        root.add(text2);

        ArrayList<JButton> allButtons = new ArrayList<>();
        for(int i = 0; i < 10; i++){

            JButton btn = new JButton("Click Me!");
            btn.addActionListener(e -> {
                System.out.println("Button was clicked from a lambda");
                this.timesClicked++;
                System.out.println("That was the " + this.timesClicked + "th time youve clicked that");
            });
            // root.add(btn);
            allButtons.add(btn);
        }

        allButtons.get(3).setText("Something different");


        for(JButton btn: allButtons){
            root.add(btn);
        }

        JFileChooser files = new JFileChooser();
        root.add(files);

        
        JColorChooser chooser = new JColorChooser();
        root.add(chooser);



        frame.add(root);
        // render object
        frame.setVisible(true);

        System.out.println("reached end of main");
    }



    public static void main(String[] args) {
        new Driver();
    }
}