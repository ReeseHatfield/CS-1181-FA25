import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BounceFrame extends JFrame {
    
    private JPanel root = new JPanel();
    private Ball b = new Ball();

    
    public BounceFrame(){


        this.root.setLayout(new BoxLayout(root, BoxLayout.Y_AXIS));
        this.setContentPane(root);

        this.root.add(b);

        moveWithArrowKeys();

        // animate();



        this.setTitle("Bouncing Ball");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    private void moveWithArrowKeys(){


        this.b.setFocusable(true); 
        this.b.requestFocusInWindow();

        KeyListener keyInput = new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                // key down
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    b.x -= 50;
                }
                else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    b.x += 50;
                }

                b.repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // key up

            }

            @Override
            public void keyTyped(KeyEvent e) {
                //
            }
            
        };


        this.b.addKeyListener(keyInput);
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
                // JFrame f = new JFrame();
                // f.setSize(20,20);
                // f.etVisible(true);
            }


            if(b.y < minY || b.y + b.diameter> maxY){
                System.out.println("Gone off in the y");
                deltaY *= -1;
            }

        });

        t.setRepeats(true);
        t.start();

    }

    // b.setFocusable(true); 
    // b.requestFocusInWindow();


}
