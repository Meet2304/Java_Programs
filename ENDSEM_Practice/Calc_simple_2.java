package ENDSEM_Practice;
import javax.swing.*;
import java.awt.*; //java.awt.event package is not included
import java.awt.event.*;

public class Calc_simple_2 extends JFrame implements ActionListener {

    JLabel label_num1 = new JLabel("Number 1: ");
    JLabel label_num2 = new JLabel("Number 2: ");
    JLabel label_ans = new JLabel("Answer: " );

    JTextField text_num1 = new JTextField(15);
    JTextField text_num2 = new JTextField(15);
    JTextField text_ans = new JTextField(15);

    JButton button_add = new JButton("+");
    JButton button_sub = new JButton("-");
    JButton button_mul = new JButton("*");
    JButton button_div = new JButton("/");
    JButton button_equals = new JButton("=");

    public Calc_simple_2(String title){
        super(title);
        setSize(300, 300);
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(label_num1);
        panel.add(text_num1);
        panel.add(label_num2);
        panel.add(text_num2);
        panel.add(label_ans);
        panel.add(text_ans);

        button_add.addActionListener(this);
        button_sub.addActionListener(this);
        button_mul.addActionListener(this);
        button_div.addActionListener(this);

        JPanel DataIO = new JPanel(new FlowLayout(FlowLayout.CENTER));
        DataIO.add(button_add);
        DataIO.add(button_sub);
        DataIO.add(button_mul);
        DataIO.add(button_div);
        DataIO.add(button_equals);

        add(panel, BorderLayout.NORTH);
        add(DataIO, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(text_num1.getText());
        int num2 = Integer.parseInt(text_num2.getText());
        if(e.getSource() == button_add){
            int ans = num1 + num2;
            text_ans.setText(ans + "");    
        }
        else if (e.getSource() == button_sub){
            int ans = num1 - num2;
            text_ans.setText(ans + "");
        }
        else if (e.getSource() == button_mul){
            int ans = num1 * num2;
            text_ans.setText(ans + "");
        }
        else if (e.getSource() == button_div){
            int ans = num1 / num2;
            text_ans.setText(ans + "");
        }
    }

    public static void main(String[] args) {
        Calc_simple_2 app1 = new Calc_simple_2("CALCULATOR");
    }

}


