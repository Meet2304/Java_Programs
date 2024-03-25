package ENDSEM_Practice;
import javax.swing.*;

public class Swing_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click");

        button.setBounds(150, 150, 100, 35);
        
        frame.add(button);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }    
}
