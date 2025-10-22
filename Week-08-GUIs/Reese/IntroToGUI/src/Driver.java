import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Driver {

    private int timesClicked = 0;

    public Driver() throws InterruptedException{
        // first create
        JFrame frame = new JFrame();
        
        
        // modify 
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        frame.setSize(screenWidth / 2, 500);
        frame.setTitle("My First GUI program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // CustomButton btn = new CustomButton(sdahfjhasfd)
       

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());

        root.add(new CustomButton(frame), BorderLayout.SOUTH);
        root.add(new CustomButton(frame), BorderLayout.NORTH);
        root.add(new CustomButton(frame), BorderLayout.EAST);
        root.add(new CustomButton(frame), BorderLayout.WEST);

        // root.add(new JLabel("I am placed in the center"), BorderLayout.CENTER);

        JPanel centerPanel = new JPanel();
        // centerPanel.setLayout(new GridLayout(3,3));
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.X_AXIS));

        for(int i = 0; i < 9; i++){
            centerPanel.add(new JButton("" + i));
        }

        root.add(centerPanel, BorderLayout.CENTER);
        // root.add(new CustomButton());
        // root.add(new CustomButton());
        // root.add(new CustomButton());
        // root.add(new CustomButton());

        // JLabel text1 = new JLabel("Hello world");
        // root.add(text1);

        // JLabel text2 = new JLabel("My name is Reese");
        // root.add(text2);


        // JOptionPane option = new JOptionPane();

        // Flow Layout

        // ArrayList<JButton> allButtons = new ArrayList<>();
        // for(int i = 0; i < 3; i++){

        //     JButton btn = new JButton("Click Me!");
        //     btn.addActionListener(e -> {

        //         btn.setBackground(Color.MAGENTA);
        //         System.out.println("Button was clicked from a lambda");
        //         this.timesClicked++;
        //         System.out.println("That was the " + this.timesClicked + "th time youve clicked that");
        //     });
        //     // root.add(btn);
        //     allButtons.add(btn);
        // }

        // // allButtons.get(3).setText("Something different");

        // allButtons.get(0).addActionListener(e -> {
        //     JOptionPane.showConfirmDialog(root, "click one");
        // });


        // for(JButton btn: allButtons){
        //     root.add(btn);
        // }

        // JFileChooser files = new JFileChooser();
        // root.add(files);

        
        // JColorChooser chooser = new JColorChooser();
        // root.add(chooser);



        frame.setContentPane(root);
        // render object
        frame.setVisible(true);

        Thread.sleep(1000);

        System.out.println("reached end of main");
    }



    public static void main(String[] args) throws InterruptedException {
        new Driver();
    }
}