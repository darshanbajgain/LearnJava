import java.awt.event.*;
import javax.swing.*;

public class EventDemo extends JFrame implements ActionListener {

    JTextField tf = new JTextField(50);
    JButton b = new JButton("Click me");

    public EventDemo(){
        tf.setBounds(80, 60, 220, 50);
        b.setBounds(80, 120, 90, 40);
        setLayout(null);
        b.addActionListener(this);
        add(tf);
        add(b);
        setVisible(true);
        setSize(400,300);
    }
     public void actionPerformed  (ActionEvent e){
        tf.setText("Button Clicked, Event Handled.");
     }

     public static void main(String[] args) {
        new EventDemo();
     }
}
