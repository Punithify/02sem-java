import javax.swing.*;
import java.awt.event.*;

class MySwing extends JFrame {
    JLabel l1, l2, l3;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton submitButton;

    MySwing(String s) {
        super(s);
    }

    public void setComponents() {
        l1 = new JLabel("Login Form");
        l2 = new JLabel("Username:");
        l3 = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        submitButton = new JButton("Submit");

        setContentPane(new JLabel(new ImageIcon("./discord.jpg")));
        setLayout(null);

        l1.setBounds(120, 30, 200, 20);
        l2.setBounds(50, 80, 100, 20);
        usernameField.setBounds(150, 80, 100, 20);
        l3.setBounds(50, 130, 100, 20);
        passwordField.setBounds(150, 130, 100, 20);
        submitButton.setBounds(80, 180, 100, 20);

        submitButton.addActionListener(new Handler());

        add(l1);
        add(l2);
        add(usernameField);
        add(l3);
        add(passwordField);
        add(submitButton);
    }

    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            if (validateLogin(username, password)) {
                JOptionPane.showMessageDialog(MySwing.this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(MySwing.this, "Invalid username or password");
            }
        }
    }

    private boolean validateLogin(String username, String password) {

        return "admin".equals(username) && "admin".equals(password);
    }

    public static void main(String args[]) {
        MySwing jf = new MySwing("Login Form");
        jf.setComponents();
        jf.setSize(300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
