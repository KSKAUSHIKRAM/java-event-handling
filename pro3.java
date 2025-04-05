//import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pro3 extends Frame implements KeyListener, MouseListener {
     Label l1;

    public pro3() {
        setTitle("KeyListener and MouseListener Demo");
        setSize(400, 300);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());

        l1 = new Label("Press a key or click anywhere!");
        add(l1);

        addKeyListener(this);
        addMouseListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l1.setText("Key Released: " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered the Window!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited the Window!");
    }

    public static void main(String[] args) {
        new pro3();
    }
}
