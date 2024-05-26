
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class choice {
    public choice() {
        JFrame Frame1 = new JFrame();
        JButton Sign = new JButton("Signup");
     
        ImageIcon icon1=new ImageIcon("D:\\downloads\\Untitled-1.png");
        JLabel label=new JLabel(icon1);
        ImageIcon icon3=new ImageIcon("D:\\downloads\\ah.jpg");
        JLabel label2=new JLabel(icon3);
        ImageIcon icon4=new ImageIcon("D:\\downloads\\yes.jpg");
        JLabel label3=new JLabel(icon4);
        label3.setBounds(150, 45, icon3.getIconWidth(), icon3.getIconHeight());
        label2.setBounds(180, 45, icon3.getIconWidth(), icon3.getIconHeight());
       
        label.setBounds(0, 0, icon1.getIconWidth(), icon1.getIconHeight());
        Frame1.add(Sign);
        Sign.setBounds(100, 15, 500,700);
        Sign.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Frame1.dispose();

                new Signup();

            }
        });
       
        Sign.setContentAreaFilled(false);
        Sign.setBorderPainted(false);
        Sign.setFont(new Font("Arial", Font.BOLD, 52));
        Sign.setForeground(Color.white);
        Sign.setFocusPainted(false);
        
        JButton Log = new JButton("Login ");
        Log.setBounds(650, 15, 500, 700);
        Log.setContentAreaFilled(false);
       
        Log.setBorderPainted(false);
        Log.setFont(new Font("Arial", Font.BOLD, 52));
        Log.setForeground(Color.white);
        Log.setFocusPainted(false);

        Log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Frame1.dispose();

                new login();

            }
        });

        Frame1.add(Log);
        
      
        Frame1.setSize(10000, 10000);
        Frame1.setLayout(null);
        Frame1.setVisible(true);
        Frame1.add(label3);
        Frame1.add(label2);
        Frame1.add(label);
        Frame1.setLocationRelativeTo(null);
        Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
