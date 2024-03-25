package ENDSEM_Practice;
import javax.swing.*;
import java.awt.*;

public class Calc {
    JFrame Frame;
    JPanel panel;
    public static void main(String[] args) {
        String operator;
        int num1, num2;

        JFrame Frame = new JFrame("Calculator");
        JPanel panel = new JPanel(new GridLayout(4,4));

        JTextField disp = new JTextField(15);
        disp.setHorizontalAlignment(JTextField.RIGHT);

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b_add = new JButton("+");
        JButton b_sub = new JButton("-"); 
        JButton b_mul = new JButton("*");
        JButton b_div = new JButton("/");
        JButton b_equals = new JButton("=");
        JButton b_clear = new JButton("Clear");

        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b_add);
        panel.add(b_sub);
        panel.add(b_mul);
        panel.add(b_div);
        panel.add(b_equals);
        panel.add(b_clear);

        addActionListeners();
        
        Container c = Frame.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(disp, BorderLayout.NORTH);
        c.add(panel, BorderLayout.CENTER);
        Frame.setVisible(true);
        Frame.setSize(300, 300);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    static void addActionListeners() {
        Component[] components = panel.getComponents();
    } 
}
