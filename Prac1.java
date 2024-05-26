import java.util.Scanner;
import java.util.Random;

public class Prac1 {
    public Prac1() {
        int number;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the ASCII of given character: ");
        Random random = new Random();
        char alpha = (char) ('!' + random.nextInt(93));
        System.out.println(alpha);
        int asc = (int) alpha;
        while (true) {
            number = x.nextInt();
            if (number == asc) {
                System.out.println("you got it ");
                break;
            } else if (number > asc) {
                System.out.println("nope you dumbass ");
                System.out.println("Try smaller ");
            } else if (number < asc) {
                System.out.println("nope you dumbass ");
                System.out.println("Try greater ");
            }

        }
    }
}
