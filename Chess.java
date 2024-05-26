import java.util.Scanner;

public class Chess {
    public Chess() {
        char a[][] = new char[8][8];
        char move;
        int num1, num2;
        Scanner x = new Scanner(System.in);
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = 'P';
            }
        }
        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = 'p';
            }
        }
        a[0][0] = 'R';
        a[0][1] = 'N';
        a[0][2] = 'B';
        a[0][3] = 'Q';
        a[0][4] = 'K';
        a[0][5] = 'B';
        a[0][6] = 'N';
        a[0][7] = 'R';
        a[7][0] = 'r';
        a[7][1] = 'n';
        a[7][2] = 'b';
        a[7][3] = 'q';
        a[7][4] = 'k';
        a[7][5] = 'b';
        a[7][6] = 'n';
        a[7][7] = 'r';
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        while (true) {
            System.out.println("Move piece from:");
            move = x.next().charAt(0);
            num1 = x.nextInt();
            int c = 0, d = 0;
            switch (move) {
                case 'a':
                    d = 0;
                    break;
                case 'b':
                    d = 1;
                    break;
                case 'c':
                    d = 2;
                    break;
                case 'd':
                    d = 3;
                    break;
                case 'e':
                    d = 4;
                    break;
                case 'f':
                    d = 5;
                    break;
                case 'g':
                    d = 6;
                    break;
                case 'h':
                    d = 7;
                    break;
                default:
                    System.out.println("Invalid move");
                    return;
            }

            char temp = a[num1][d];
            a[num1][d] = ' ';
            a[c][d] = temp;

            System.out.println("Move piece to:");
            move = x.next().charAt(0);
            num2 = x.nextInt();

            switch (move) {
                case 'a':
                    c = 0;
                    break;
                case 'b':
                    c = 1;
                    break;
                case 'c':
                    c = 2;
                    break;
                case 'd':
                    c = 3;
                    break;
                case 'e':
                    c = 4;
                    break;
                case 'f':
                    c = 5;
                    break;
                case 'g':
                    c = 6;
                    break;
                case 'h':
                    c = 7;
                    break;
                default:
                    System.out.println("Invalid move");
                    return;
            }

            temp = a[c][d];
            a[c][d] = a[num1][num2];
            a[num1][num2] = temp;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    
    }
}
