import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrevQues1 implements ActionListener{
    private JButton Savebutton;
    private JTextField display1;
    private JTextField display2;
    private JTextField display3;
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new PrevQues1().createandShowGUI());
    }

    public void createandShowGUI(){
        JFrame frame = new JFrame("Student Data");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,2, 10, 10));

        display1 = new JTextField(15);
        display2 = new JTextField(15);
        display3 = new JTextField(15);

        JLabel label1 = new JLabel("Roll No: ");
        JLabel label2 = new JLabel("Name: ");
        JLabel label3 = new JLabel("Branch: ");
        panel.add(label1);
        panel.add(display1);
        panel.add(label2);
        panel.add(display2);
        panel.add(label3);
        panel.add(display3); 

        JPanel buttonpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Savebutton = new JButton("Save");
        Savebutton.addActionListener(this);
        buttonpanel.add(Savebutton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(buttonpanel, BorderLayout.CENTER);
        //frame.add(display1, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Savebutton){
            String rollNo = display1.getText();
            String name = display2.getText();
            String branch = display3.getText();  

            String message = "Roll No: " + rollNo + "\n Name: " + name + "\nBranch: " + branch;
            JOptionPane.showMessageDialog(Savebutton, message, "Student information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
