import java.util.Random;
import java.util.Scanner;

public class Game_Random_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int actual_number = random.nextInt(1, 101);
        int user_inp;
        int attempt = 10;

        System.out.println("Number Guessing game: \n The number has been generated enter a number to Checkout:");
        do {
            System.out.println("(you have " + attempt + " attempts left)");
            user_inp = scanner.nextInt();
            if (user_inp > actual_number) {
                System.out.println("Thats Greater");
            } else if (user_inp < actual_number) {
                System.out.println("Thats smaller");
            }
            attempt--;
            System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
            if (attempt == 0) {
                System.out.println("0 attempts left\n Game Over!!!");
                System.out.println("The number was " + actual_number);
                break;
            }
            ;

            if (user_inp == actual_number) {
                System.out.println("Congrats!!! you won");
                System.out.println("The number was " + actual_number);
            }
            ;
        } while (user_inp != actual_number);

        scanner.close();
    }
}
