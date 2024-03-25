package ENDSEM_Practice;
import javax.swing.*;
import java.awt.*; //java.awt.event package is not included
import java.awt.event.*;

public class Calc_simple {

public static void main(String[] args) {
    JFrame Frame= new JFrame();
    JPanel panel = new JPanel(new GridLayout(3, 2));
    JPanel DataIO = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    JLabel label_num1 = new JLabel("Number 1: ");
    JLabel label_num2 = new JLabel("Number 2: ");
    JLabel label_ans = new JLabel("Answer: " );

    JTextField num1 = new JTextField(15);
    JTextField num2 = new JTextField(15);
    JTextField ans = new JTextField(15);

    JButton button_add = new JButton("+");
    JButton button_sub = new JButton("-");
    JButton button_mul = new JButton("*");
    JButton button_div = new JButton("/");
    JButton button_equals = new JButton("=");

    DataIO.add(button_add);
    DataIO.add(button_sub);
    DataIO.add(button_mul);
    DataIO.add(button_div);
    DataIO.add(button_equals);

    panel.add(label_num1);
    panel.add(num1);
    panel.add(label_num2);
    panel.add(num2);
    panel.add(label_ans);
    panel.add(ans);

    Frame.setLayout(new BorderLayout());
    Frame.add(panel, BorderLayout.NORTH);
    Frame.add(DataIO, BorderLayout.SOUTH);
    Frame.setSize(400,200);
    Frame.setVisible(true);
    Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}    
}
