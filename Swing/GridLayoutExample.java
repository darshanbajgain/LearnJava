import java.awt.GridLayout;
import javax.swing.*;

public class GridLayoutExample {
    
    GridLayoutExample(){
        JFrame f =  new JFrame("Grid Layout");
        JButton b1, b2, b3, b4;
        b1 = new JButton("A");
        b2 = new JButton("B");
        b3 = new JButton("C");
        b4 = new JButton("D");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(new GridLayout(2,2));

    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}