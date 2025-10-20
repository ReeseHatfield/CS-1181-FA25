import javax.swing.*;
import java.awt.*;

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

        JComboBox<String> operands = new JComboBox<>();
        this.root.add(operands);

        JTextField input2 = new JTextField();
        this.root.add(input2);
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
