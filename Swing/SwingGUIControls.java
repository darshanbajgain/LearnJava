import javax.swing.*;

public class SwingGUIControls {

    JFrame f = new JFrame("Swing GUI Controls");   
    SwingGUIControls(){
        JLabel user = new JLabel("Username: ");
        JLabel psw = new JLabel("Password: ");
        JTextField usrTextField = new JTextField();
        JPasswordField passwordField =new JPasswordField();
        JCheckBox study = new JCheckBox("Studying");
        JCheckBox play = new JCheckBox("Playing");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        f.setLayout(null);

        user.setBounds(100, 50, 80, 50);
        psw.setBounds(100,80, 80,50);
        f.add(user);
        f.add(psw);

        usrTextField.setBounds(190, 50, 80, 20);
        passwordField.setBounds(190, 80, 80,20);
        f.add(usrTextField);
        f.add(passwordField);

        study.setBounds(100, 120, 80, 20);
        play.setBounds(100, 150, 80,20);
        f.add(study);
        f.add(play);

        male.setBounds(100, 180, 150, 20);
        female.setBounds(100, 210, 150, 20);
        f.add(male);
        f.add(female);

        f.setSize(500,300);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new SwingGUIControls();
    }
}
