package Unit_4_GUI;
import javax.swing.*;
import java.awt.*;
class SwingGUIApp1 extends JFrame {
    
    JLabel lblStatus = new JLabel("JAVA SWING GUI LABEL!");
    JLabel lblStatus1 = new JLabel("JAVA SWING GUI 1!");
    
    public SwingGUIApp1(String title) {
        
        super(title);
        setSize(500, 500);
        
        lblStatus.setFont(new Font("Arial", Font.BOLD, 24));
        lblStatus.setForeground(Color.RED);
        add(lblStatus, BorderLayout.NORTH);
        
        lblStatus1.setFont(new Font("Arial", Font.BOLD, 24));
        lblStatus1.setForeground(Color.BLUE);
        add(lblStatus1, BorderLayout.SOUTH);

        setVisible(true); // Visibility mode of every component will be false by default. This sets it to true.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingGUIApp1 app1 = new SwingGUIApp1("JAVA-GUI WELCOME FRAME!");
    }
}
