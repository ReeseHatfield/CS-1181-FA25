import javax.naming.NameAlreadyBoundException;
import javax.swing.*;
import java.awt.*;

public class BounceFrame extends JFrame {
    
    private JPanel root = new JPanel();
    private Ball b = new Ball();

    
    public BounceFrame(){


        this.root.setLayout(new BoxLayout(root, BoxLayout.Y_AXIS));
        this.setContentPane(root);

        this.root.add(b);


        animate();

        this.setTitle("Bouncing Ball");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private int deltaX = 5;
    private int deltaY = 2;

    private void animate(){


        int minY = 0;
        int maxY = 500;

        int minX = 0;
        int maxX = 500;


        Timer t = new Timer(5, (e) -> {

            this.b.x += deltaX;
            this.b.y += deltaY;


            this.b.repaint();

            if(b.x < minX || b.x + b.diameter > maxX){
                System.out.println("gone off in the x");
                deltaX *= -1;
                JFrame f = new JFrame();
                f.setSize(20,20);
                f.setVisible(true);
            }


            if(b.y < minY || b.y + b.diameter> maxY){
                System.out.println("Gone off in the y");
                deltaY *= -1;
            }

        });

        t.setRepeats(true);
        t.start();

    }
}
