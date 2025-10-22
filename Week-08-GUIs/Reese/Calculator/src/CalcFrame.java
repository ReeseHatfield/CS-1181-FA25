import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame {

    private JPanel root = new JPanel();

    public CalcFrame(){
        super();
        this.initFrame();
        this.initComponents();
        this.setVisible(true);
    }

    private void initComponents(){

        JTextField input1 = new JTextField();
        this.root.add(input1);


        String[] ops = {"", "+", "-"};
        JComboBox<String> operands = new JComboBox<>(ops);
        this.root.add(operands);

        JTextField input2 = new JTextField();
        this.root.add(input2);

        JLabel outputLabel = new JLabel();
        this.root.add(outputLabel);

        // row 1
        this.root.add(new NumberBtn(input1, input2, 1));
        this.root.add(new NumberBtn(input1, input2, 2));
        this.root.add(new NumberBtn(input1, input2, 3));
        this.root.add(new NumberBtn(input1, input2, 0));

        // row 2
        this.root.add(new NumberBtn(input1, input2, 4));
        this.root.add(new NumberBtn(input1, input2, 5));
        this.root.add(new NumberBtn(input1, input2, 6));

        // anonymous inner class
        JButton clearBtn = new JButton("CLEAR");
        clearBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText("");
                input2.setText("");

                NumberBtn.currentField = input1;
            }
            
        });
        this.root.add(clearBtn);

        // row 3
        this.root.add(new NumberBtn(input1, input2, 7));
        this.root.add(new NumberBtn(input1, input2, 8));
        this.root.add(new NumberBtn(input1, input2, 9));
        this.root.add(new NumberBtn(input1, input2, 0));



    }

    private void initFrame(){
        this.setSize(new Dimension(500, 500));
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.root.setLayout(new GridLayout(4, 4));
        this.setContentPane(this.root);
        this.setResizable(true);
    }
    
}
