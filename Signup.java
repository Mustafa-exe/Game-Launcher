import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

public class Signup {

    public static String email;

    public Signup() {

        JFrame frame = new JFrame("Signup");

        JLabel nameLabel = new JLabel("Enter Full Name");
        nameLabel.setForeground(Color.WHITE);
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Enter email");
        emailLabel.setForeground(Color.WHITE);
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Enter Password");
        passwordLabel.setForeground(Color.WHITE);
        JPasswordField passwordField = new JPasswordField();

        JButton signupButton = new JButton("Signup");

        ImageIcon bgIcon = new ImageIcon("/mnt/data/image.png"); 
        ImageIcon logoIcon = new ImageIcon("D:\\downloads\\17251256088.png"); 
        JLabel bgLabel = new JLabel(bgIcon);
        JLabel logoLabel = new JLabel(logoIcon);
        JLabel Label2 = new JLabel();
        Label2.setOpaque(true);
        Label2.setBackground(new Color(13, 24, 30, 180));

        nameLabel.setBounds(650, 155, 200, 20);
        nameField.setBounds(650, 175, 200, 20);
        emailLabel.setBounds(650, 205, 200, 20);
        emailField.setBounds(650, 225, 200, 20);
        passwordLabel.setBounds(650, 255, 200, 20);
        passwordField.setBounds(650, 275, 200, 20);
        signupButton.setBounds(650, 310, 200, 25);
        bgLabel.setBounds(0, 0, bgIcon.getIconWidth(), bgIcon.getIconHeight());
        logoLabel.setBounds(0, -300, logoIcon.getIconWidth(), logoIcon.getIconHeight());
        Label2.setBounds(0, 0, 1366, 768); 

        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String name = nameField.getText();

                if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid email address");
                    return;
                }

                if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a password");
                    return;
                }

                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter your full name");
                    return;
                }

                if (insertUserDetails(name, email, password)) {
                    JOptionPane.showMessageDialog(frame, "Signed up successfully");
                    frame.dispose();
                    new MainPage();
                } else {
                    JOptionPane.showMessageDialog(frame, "Signup failed. Please try again.");
                }
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(signupButton);
        frame.add(Label2);
        frame.add(bgLabel);
        frame.add(logoLabel);
        frame.setBackground(Color.BLACK);
        frame.setSize(1366, 768); 
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static boolean insertUserDetails(String name, String email, String password) {
        String url = "jdbc:mysql://127.0.0.1:3306/project1";
        String user = "root";
        String dbPassword = "De@th123";

        String query = "INSERT INTO data (Name, email, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, dbPassword);
                PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);

            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return false;
        }
    }
}
