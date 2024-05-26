import java.util.Scanner;
import java.util.Random;

public class Prac2 {
    public Prac2() {
   
        char[][] a = new char[5][5];
        int[][] b = new int[5][5];
        Scanner x = new Scanner(System.in);
        Random random = new Random();
        int k = random.nextInt(5);
        int l = random.nextInt(5);

      
        char p = (char) ( 'A');
        a[k][l] = p;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              
               b[i][j] =0;
            }
         
        }

            
        int num1, num2;
        while (true) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                  
                    System.out.print("|" + " " + b[i][j] + " ");
                }
                System.out.println("|");
            }

            System.out.println("Enter the number of row 1-5 ");
            num1 = x.nextInt();
            System.out.println("Enter the number of column 1-5 ");
            num2 = x.nextInt();
            if (num1 < 1 || num1 > 5 || num2 < 1 || num2 > 5) {
                System.out.println("Invalid input ");
              
            }

            if (num1 - 1 == k && num2 - 1 == l) {
                System.out.println("Character found: " + p);
                break;
            } else {
                System.out.println("Not found ");
                b[num1 - 1][num2 - 1] = 1;
            }
        }
    }
}