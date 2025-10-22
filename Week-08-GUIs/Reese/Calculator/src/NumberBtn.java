import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberBtn extends JButton implements ActionListener{

    private JTextField input1;
    private JTextField input2;
    private int number;

    // BAD -> global mutable state
    // bc low on time
    public static JTextField currentField;


    public NumberBtn(JTextField input1, JTextField input2, int number){
        super();
        this.input1 = input1;
        this.input2 = input2;
        this.number = number;

        NumberBtn.currentField = this.input1;

        this.setText("" + this.number);

        this.addActionListener(this);
    }
    // on click -> set the text of those input


    @Override
    public void actionPerformed(ActionEvent e) {
        NumberBtn.currentField.setText("" + this.number);



        if(NumberBtn.currentField == this.input1){
            NumberBtn.currentField = this.input2;
            System.out.println("field set to input 2");
        } else {
            NumberBtn.currentField = this.input1;
            System.out.println("field set to input 1");

        }

    }
}