import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

public class MainPage {
    public MainPage() {
        JFrame f1 = new JFrame("Launcher");
        JLabel label2 = new JLabel("Welcome to game Launcher ");
        ImageIcon icon1 = new ImageIcon("D:\\downloads\\num1.jpg");
        ImageIcon icon2 = new ImageIcon("D:\\downloads\\ascii2.jpg");
        ImageIcon icon3 = new ImageIcon("D:\\downloads\\rps.jpeg");
        ImageIcon icon4 = new ImageIcon("D:\\downloads\\chess2.png");
        
        label2.setBounds(550, 30, 4000, 130);
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.white);
        
        JButton b1 = new JButton(icon2);
        b1.setPreferredSize(new Dimension(icon2.getIconWidth(), icon2.getIconHeight()));
        JButton b2 = new JButton(icon1);
        b2.setPreferredSize(new Dimension(icon1.getIconWidth(), icon1.getIconHeight()));
        JButton b3 = new JButton(icon3);
        b3.setPreferredSize(new Dimension(icon3.getIconWidth(), icon3.getIconHeight()));
        JButton b4 = new JButton(icon4);
        b4.setPreferredSize(new Dimension(icon4.getIconWidth(), icon4.getIconHeight()));
        
        b1.setBounds(700, 125, 210, 130);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new Prac1();
            }
        });
        
        b2.setBounds(950, 125, 210, 130);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new GuessTheNumber();
            }
        });

        b3.setBounds(700, 290, 210, 130);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new Prac3();
            }
        });
        
        b4.setBounds(950, 290, 210, 130);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new Chess();
            }
        });

        ImageIcon icon = new ImageIcon("D:\\downloads\\-Cool-Gaming-Background1 (1).jpg");
        JLabel l1 = new JLabel(icon);
        l1.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        
        JButton Acc = new JButton("Account");
        Acc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            f1.dispose();
           new login();
            }
        });
        Acc.setOpaque(false);
        Acc.setContentAreaFilled(false);
        Acc.setBorderPainted(false);
        Acc.setFont(new Font("Arial", Font.BOLD, 24));
        Acc.setForeground(Color.white);
        Acc.setFocusPainted(false);
        Acc.setBounds(10, 10, 200, 50);
        
        f1.add(Acc);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(label2);
        f1.add(l1);
        f1.setSize(8000, 6000);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
