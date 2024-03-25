package SEM_3_LABFILE.UNIT_4.Que2_KeyandMouseEventhandlingTest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class MouseEventHandlingTest extends JFrame implements MouseListener{

    int x = 200, y = 200;
    public MouseEventHandlingTest(String title){
        super(title);
        setSize(400, 400);

        this.addMouseListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        super.paint(g);
        Random r = new Random();
        Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        g.setColor(c);
        g.fillOval(x,y,40,40);

    }

    public void mousePressed(MouseEvent k){
        
    }

    public void mouseClicked( MouseEvent k){
        x = k.getX();
        y = k.getY();
        x -= 18; // Addition by BATAK GANG so that the center of the oval appears at the tip of the pointer
        y -= 18; 
        repaint();
    }
    
    public void mouseReleased(MouseEvent k){
    }

    public void mouseEntered(MouseEvent k){
    }
    public void mouseExited(MouseEvent k){
    }

    public static void main(String[] args) {
        MouseEventHandlingTest m1 = new MouseEventHandlingTest("Mouse Event Handling");
    }
}

