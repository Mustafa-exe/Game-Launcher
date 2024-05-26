import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class login {
    private String username;
    private Connection connection;

    public login() {
        JFrame frame = new JFrame("Login Page");
        JLabel label = new JLabel(" Welcome ");
        JLabel label4 = new JLabel(" Login to Your Account ");
        JLabel label5 = new JLabel(" Signup and Experience a new world ");

        JButton button1 = new JButton("Login ");
        JButton button2 = new JButton("Signup ");

        JTextField text1 = new JTextField();
        JLabel label1 = new JLabel("User Name");

        JPasswordField text2 = new JPasswordField();
        JLabel label3 = new JLabel("Password");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                username = text1.getText().trim();
                username = username.toUpperCase();
                String password = new String(text2.getPassword()).trim();
                validateLogin(password);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Signup();
            }
        });

        ImageIcon icon1 = new ImageIcon("D:\\downloads\\logg4.png");
        ImageIcon icon2 = new ImageIcon("D:\\downloads\\lo.png");
        JLabel gameLauncher = new JLabel("Game Launcher ");
        JLabel logo = new JLabel(icon2);
        ImageIcon background = new ImageIcon("D:\\downloads\\elbg2.jpg");
        JLabel Background = new JLabel(background);
        JLabel label2 = new JLabel(icon1);

        label.setFont(new Font("Arial", Font.BOLD, 40));
        label1.setFont(new Font("Arial", Font.BOLD, 15));
        label3.setFont(new Font("Arial", Font.BOLD, 15));
        label4.setFont(new Font("Arial", Font.BOLD, 35));
        label5.setFont(new Font("Arial", Font.BOLD, 22));

        label.setBounds(270, 100, 450, 30);
        label4.setBounds(210, 200, 450, 50);
        label5.setBounds(765, 300, 450, 50);
        label1.setBounds(330, 295, 150, 20);
        label3.setBounds(330, 365, 300, 20);
        text1.setBounds(240, 320, 270, 30);
        text2.setBounds(240, 390, 270, 30);
        button1.setBounds(260, 440, 200, 40);
        button2.setBounds(850, 450, 210, 55);
        label2.setBounds(100, 0, icon1.getIconWidth(), icon1.getIconHeight());
        logo.setBounds(750, -250, 400, icon1.getIconHeight());
        gameLauncher.setBounds(1000, -130, 500, 500);
        Background.setBounds(10, 0, background.getIconWidth(), background.getIconHeight());

        button2.setBackground(Color.white);
        button1.setBackground(new Color(41, 181, 153));
        button1.setFocusPainted(false);
        button2.setFocusPainted(false);

        text2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = new String(text2.getPassword()).trim();
                validateLogin(password);
            }
        });

        frame.add(text1);
        frame.add(text2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(button1);
        frame.add(button2);
        frame.add(gameLauncher);
        frame.add(logo);
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(Background);

        frame.setSize(10000, 720);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        establishConnection();
    }

    private void establishConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "De@th123");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Connection Failed");
        }
    }

    private void validateUsername() {
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username");
            return;
        }

        try {
            String query = "SELECT * FROM data WHERE UPPER(name) = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Enter Password");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Query Failed");
        }
    }

    private void validateLogin(String password) {
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both username and password");
            return;
        }

        try {
            String query = "SELECT * FROM data WHERE UPPER(name) = ? AND password = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Logged in");
                new MainPage();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid password");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Query Failed");
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
