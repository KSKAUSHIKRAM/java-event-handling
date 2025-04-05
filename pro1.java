import java.awt.*;
import java.awt.event.*;

public class pro1 extends Frame implements ActionListener {
    TextField tf1, tf2, tf3;
    Label L1,L2,L3;
    Button b1,b2,b3,b4;
    pro1() {
        L1 = new Label("Enter Number 1:");
        L1.setBounds(50, 30, 100, 20);

        L2 = new Label("Enter Number 2:");
        L2.setBounds(50, 80, 100, 20);

        L3 = new Label("Result:");
        L3.setBounds(50, 130, 100, 20);

        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);

        tf2 = new TextField();
        tf2.setBounds(50, 100, 150, 20);

        tf3 = new TextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        b1 = new Button("+");
        b1.setBounds(50, 200, 50, 50);

        b2 = new Button("-");
        b2.setBounds(120, 200, 50, 50);

        b3 = new Button("x");
        b3.setBounds(190, 200, 50, 50);

        b4=new Button("/");
        b4.setBounds(260, 200, 50, 50);

        // Adding action listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        // Adding components to frame
        add(L1);
        add(L2);
        add(L3);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        // Setting size, layout and visibility of frame
        setSize(500, 500);        
        setTitle("Simple calculator");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Defining the actionPerformed method to generate an event on buttons
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        try{
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        }
        else if(e.getSource()==b3){
            c = a * b;
        }
        else if(e.getSource()==b4){
            if (b == 0) {
                tf3.setText("Cannot divide by zero");
                return;
            }
            c = a / b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }
    catch(NumberFormatException ex){
        tf3.setText("Invalid Input:"+ex);
    }
    }
    

       
    

    // Main method
    public static void main(String[] args) {
        new pro1();
    }
}