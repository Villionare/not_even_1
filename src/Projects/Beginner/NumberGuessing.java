package Projects.Beginner;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to number guessing game:\n" +
                "You will have 10 attempts only\n" +
                "So play CAREFULLY!!!\n" +
                "Press 1 and hit Enter to Start");

        int option = scanner.nextInt();

        while (option != 0) {

            if (option == 1) {
                game(scanner);
            } else {
                System.out.println("Choose 1 to start the game or 0 to exit");
            }
            System.out.println("Want to play again? press 1 to continue");
            option = scanner.nextInt();
        }

        scanner.close();
    }

    static void game(Scanner scanner) {
        Random rand = new Random();
        int attempts = 1;
        int random = rand.nextInt(50) + 1; //1 to 50
        System.out.println("Computer has chosen a number (between 1 to 50), start guessing it");

        while (attempts <= 10) {
            System.out.println("Enter your " + attempts + " attempt.");
            int userInput = scanner.nextInt();

            if (userInput > random) {
                System.out.println("You've entered a bigger number.");
            } else if (userInput < random) {
                System.out.println("You've entered a smaller number.");
            } else {
                System.out.println("You Got It!!!\nThe number was " + random);
                break;
            }
            attempts++;
        }

    }
}