import javax.swing.*;
import java.awt.event.*;

public class ayo {
    public static void main(String[] args) {
        new LoginPage();
    }
}

class LoginPage {
    public LoginPage() {
        JFrame f = new JFrame("login page");
        f.setSize(800, 500);
        f.setLayout(null);

        ImageIcon icon = new ImageIcon("D:\\downloads\\ayesha.png");
        JLabel b = new JLabel(icon);
        b.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); 

        JLabel l = new JLabel("Login to your account");
        l.setBounds(100, 50, 200, 50);
        f.add(l);
        JLabel l1 = new JLabel("Username");
        l1.setBounds(130, 90, 200, 50);
        JTextField tf = new JTextField();
        tf.setBounds(130, 130, 140, 25);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(130, 170, 150, 40);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(130, 210, 140, 25);

        f.add(l1);
        f.add(l2);
        f.add(tf);
        f.add(pf);

        JButton b1 = new JButton("login");
        b1.setBounds(130, 250, 100, 30);
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = tf.getText();
                String password = new String(pf.getPassword());

                if (username.equals("ayesha") && password.equals("alina")) {
                    JOptionPane.showMessageDialog(f, "TG logged in");
                    f.dispose();
                    // new MenuPage();
                } else {
                    JOptionPane.showMessageDialog(f, "successfully wasted my time");
                }
            }
        });

        f.add(b);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
