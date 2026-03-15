import java.util.Scanner;
import java.util.Random;

public class Slot_game {

//    enter the bet money
//    play the game

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] outcomes = {"🍉", "🍇", "🍈"};
        int betting_amt = 0;

        System.out.println("Welcome to Slot Fruit Game");
        System.out.println("Enter amount you wanna add:");
        int amt = scanner.nextInt();

        do {
            System.out.println("Current Balance: " + amt);
            System.out.print("Enter the amount to bet: ");
            betting_amt = scanner.nextInt();

            String a = outcomes[random.nextInt(0, 3)];
            String b = outcomes[random.nextInt(0, 3)];
            String c = outcomes[random.nextInt(0, 3)];

            System.out.println(a + b + c);

            if (a.equals(b) && a.equals(c)) {
                System.out.println("Bingo You won");
                amt += betting_amt;
            } else {
                System.out.println("Fuck!! loosed");
                amt -= betting_amt;
            }
        } while (amt != 0);
    }
}
