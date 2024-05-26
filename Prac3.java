import java.util.Scanner;
import java.util.Random;

public class Prac3 {
    public Prac3() {
        String option;
        int userWin = 0;
        int CompWin = 0;
        int b=0;
        Scanner x = new Scanner(System.in);
       
        
        while(b<=5) {
            System.out.println("Enter your choice Rock/Paper/Scissor");
            System.out.println("enter exit to leave the program ");
            option = x.next();
            option.toLowerCase();
            Random random = new Random();
            int a = random.nextInt(3) + 1;
            if (a == 1) {
                // rock
                if (option.equals("rock")) {
                    System.out.println("Draw");
                } else if (option.equals("paper")) {
                    System.out.println("The computer chose rock you won");
                    userWin++;
                } else if (option.equals("Scissor")) {
                    System.out.println("The computer chose you loose");
                    CompWin++;
                } else {
                    System.out.println("invalid option");
                    System.out.println("try again ");
                }
            } else if (a == 2) {
                // paper
                if (option.equals("rock")) {
                    System.out.println("The computer chose paper you lost");
                    CompWin++;

                } else if (option.equals("paper")) {
                    System.out.println("draw");
                } else if (option.equals("Scissor")) {
                    System.out.println("The computer chose paper you win");
                    userWin++;
                } else {
                    System.out.println("invalid option");
                    System.out.println("try again ");
                }
            } else if(a==3) {
                // Scissor
                if (option.equals("rock")) {
                    System.out.println("The computer chose scissor you won");

                    userWin++;
                } else if (option.equals("paper")) {
                    System.out.println("The computer chose Scissor you lost");
                    CompWin++;
                } else if (option.equals("Scissor")) {
                    System.out.println("draw");

                } else {
                    System.out.println("invalid option");
                    System.out.println("try again ");
                }
            }
            else if(option.equals("exit"))
            {
                System.out.println("Good bye");
                break;
            }
            b++;
         
        }
        System.out.println("You won "+userWin +" times");
        System.out.println("The computer won "+CompWin +" times");

    }

}
