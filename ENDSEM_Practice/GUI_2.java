package ENDSEM_Practice;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class GUI_2 {
    public static void main(String[] args) {
        JFrame Frame = new JFrame("Student Information");
        JPanel panel = new JPanel();
        
        JLabel labelName = new JLabel("Name: ");
        JLabel labelRollno = new JLabel("Roll No: ");
        JLabel labelCPI = new JLabel("CPI: ");

        JTextField Fieldname = new JTextField(20);
        JTextField FieldRollno = new JTextField(20);
        JTextField FieldCPI = new JTextField(20);

        JButton Buttonok = new JButton("OK");
        Buttonok.setSize(20, 30);

        panel.add(labelName);
        panel.add(Fieldname);
        panel.add(labelRollno);
        panel.add(FieldRollno);
        panel.add(labelCPI);
        panel.add(FieldCPI);
        panel.add(Buttonok);     

        panel.setLayout(new GridLayout(7, 2));

        Frame.add(panel);
        Frame.setSize(500, 200);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
