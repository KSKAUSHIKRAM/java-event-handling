import java.awt.*;
import java.awt.event.*;

public class pro2 extends Frame implements ItemListener {
    Checkbox chk1,chk2,chk3;
    CheckboxGroup group;
    //Label lblCheckbox;

    pro2() {
        group = new CheckboxGroup();
        chk1 = new Checkbox("Red");
        chk1.setBounds(50, 190, 100, 30);
        chk1.addItemListener(this);
        add(chk1);

        chk2=new Checkbox("Yellow");
        chk2.setBounds(160, 190, 100, 30);
        chk2.addItemListener(this);
        add(chk2);

        chk3 = new Checkbox("Green");
        chk3.setBounds(270, 190, 100, 30);
        chk3.addItemListener(this);
        add(chk3);
        // Create label
        /*lblCheckbox = new Label("");
        lblCheckbox.setBounds(160, 190, 200, 30);
        add(lblCheckbox);*/

        // Set frame properties
        setTitle("Background color changer");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        if (chk1.getState()) {
            setBackground(Color.red);
        }
        else if(chk2.getState()){
            setBackground(Color.yellow);
        }
        else if(chk3.getState()){
            setBackground(Color.GREEN);
        }
        else {
            setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        new pro2();
    }
}
