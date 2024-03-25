package ENDSEM_Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class KeyEvent extends JFrame implements KeyListener {
    int x = 200, y = 200;
    public KeyEvent(String title){
        super(title);
        setSize(400, 400);
        setVisible(true);
        (this).addKeyListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        super.paint(g);
        Random r = new Random();
        Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        g.setColor(c);
        g.fillOval(x, y, 40, 40);
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        
    }
    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        int code = e.getKeyCode();

        if(code == 'R' || code == 'r'){
            getContentPane().setBackground(Color.RED);
        }
        if(code == 'B' || code == 'b'){
            getContentPane().setBackground(Color.BLUE);
        }
        if(code == java.awt.event.KeyEvent.VK_UP){
            y = y+20;
        }
        if(code == java.awt.event.KeyEvent.VK_DOWN){
            y = y-20;
        }
        if(code == java.awt.event.KeyEvent.VK_LEFT){
            x = x+20;
        }
        if(code == java.awt.event.KeyEvent.VK_RIGHT){
            x = x-20;
        }
        repaint();
    }
    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
    }
    
    public static void main(String[] args) {
        KeyEvent k1 = new KeyEvent("Key Event Hadling Test");
    }
    
}
