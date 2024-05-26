import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class GuessTheNumber {

    private static int guess;
    private static int alpha;

    public GuessTheNumber (){
        JFrame frame = new JFrame("Guess The Number");
        JLabel label=new JLabel(" Guess the Number  ");
        label.setBounds(450, 100, 3000, 100);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        JLabel label3 =new JLabel();
        label3.setBounds(0,0,10000,1000);
        label3.setBackground(Color.BLACK);
        label3.setOpaque(true);
            ImageIcon icon=new ImageIcon("D:\\downloads\\phy.png");
        JLabel label2=new JLabel(icon);
        

        label2.setBounds(170,50,icon.getIconWidth(),icon.getIconHeight());
       

        JTextField text1 = new JTextField();
        text1.setBounds(480, 250, 300, 40);
    
        JButton button = new JButton("Submit");
        button.setBounds(540,310, 170, 35);
       
        Random random = new Random();
        alpha = random.nextInt(30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = text1.getText();
                try {
                    guess = Integer.parseInt(input);
                    if (guess == alpha) {
                        JOptionPane.showMessageDialog(frame, "Correct! The number was: " + alpha);
                    } else if(guess > alpha) {

                        JOptionPane.showMessageDialog(frame, "The number is smaler " );

                    }
                 else if(guess < alpha) {

                    JOptionPane.showMessageDialog(frame, "The number is greater " );

                }
                else
                    {
                        JOptionPane.showMessageDialog(frame, "Incorrect! Try again.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
                text1.setText("");
            }
        });
      
        frame.add(label);
        frame.add(text1);
        frame.add(button);
        frame.add(label2);
        frame.add(label3);




        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(10000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
