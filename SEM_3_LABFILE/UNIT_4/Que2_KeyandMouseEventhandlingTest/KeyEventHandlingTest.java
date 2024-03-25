package SEM_3_LABFILE.UNIT_4.Que2_KeyandMouseEventhandlingTest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class KeyEventHandlingTest extends JFrame implements KeyListener{

    int x = 200, y = 200;
    public KeyEventHandlingTest(String title){
        super(title);
        setSize(400, 400);

        this.addKeyListener(this);

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

    public void keyPressed(KeyEvent k){
        int code = k.getKeyCode();
        if(code == 'R' || code == 'r')
        {
            getContentPane().setBackground(Color.RED);
        }
        if(code == 'B' || code == 'b')
        {
            getContentPane().setBackground(Color.BLUE);
        }
        if(code == KeyEvent.VK_UP)
        {
            y = y - 20;
        }
        if(code == KeyEvent.VK_DOWN)
        {
            y = y + 20;
        }
        if(code == KeyEvent.VK_LEFT)
        {
            x = x - 20;
        }
        if(code == KeyEvent.VK_RIGHT)
        {
            x = x + 20;
        }
        repaint();
    }
    
    public void keyReleased(KeyEvent k){
    }

    public void keyTyped(KeyEvent k){
    }

    public static void main(String[] args) {
        KeyEventHandlingTest k1 = new KeyEventHandlingTest("Key Event Handling");
    }
}
