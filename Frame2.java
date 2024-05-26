
import javax.swing.*;

public class Frame2 {
    public Frame2() {
        JFrame a = new JFrame();
        a.setTitle("Logged in Page");
        ImageIcon icon = new ImageIcon("D:\\downloads\\download (2).jpeg");
        JLabel lab2 = new JLabel(icon);
        lab2.setBounds(0, 0, 400, 400);
        a.setSize(400, 400);

        JMenu menu = new JMenu("Menu");
        JMenuBar m1 = new JMenuBar();
        JMenuItem a1 = new JMenuItem("Game 1");
        JMenuItem a2 = new JMenuItem("Game 2");
        JMenuItem a3 = new JMenuItem("Game 3");

        menu.add(a1);
        menu.add(a2);
        menu.add(a3);
        m1.add(menu);
        a.setJMenuBar(m1);
        JLabel label = new JLabel("You're Logged in");
        label.setBounds(140, 50, 150, 50);

        a.add(label);
        a.add(lab2);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
