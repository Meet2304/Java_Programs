package ENDSEM_Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random; 

public class MouseTest extends JFrame implements MouseListener {
    int x = 200 , y = 200;

    public MouseTest(String title){
        super(title);
        setSize(400, 400);
        addMouseListener(this);        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        super.paint(g);
        Random r = new Random();
        Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        g.setColor(c);
        g.fillOval(x, y, 40, 40);
    }
    
    public void mousePressed(MouseEvent m){

    }
    public void mouseEntered(MouseEvent m){
        
    }
    public void mouseReleased(MouseEvent m){
        
    }
    public void mouseClicked(MouseEvent m){
        x = m.getX();
        y = m.getY();
        repaint();   
    }
    public void mouseExited(MouseEvent m){
        
    }

    public static void main(String[] args) {
        MouseTest m1 = new MouseTest("MOUSE EVENT HANDLING TEST");
    }
}
