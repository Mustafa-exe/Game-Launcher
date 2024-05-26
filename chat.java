import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        // mini chat room
        String user1;
        String user2;
        String user3;
        String choice;
        String option;
        String text;
        Scanner x = new Scanner(System.in);

        System.out.println("which user are you user1/user2/user3?");
        choice = x.next();
        choice.toLowerCase();
        if (choice.equals("user1")) {
            System.out.println("Who do you want to send message to? ");
            option = x.next();
            option.toLowerCase();
            if (option.equals("user2")) {
                System.out.println("enter your message ");
                x.nextLine();
                text = x.nextLine();
                System.out.println(text);
            }
        }

    }

}
