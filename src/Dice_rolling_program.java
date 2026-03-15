//create a function of dice rolling
//show the results
//add the results

import java.util.Scanner;
import java.util.Random;

public class Dice_rolling_program {

    static Random random = new Random();
    static String one = """
            --------------
            |                   |
            |         ●        |
            |                   |
            --------------
            """;
    static String two = """
            --------------
            |                   |
            |  ●          ●  |
            |                   |
            --------------
            """;
    ;
    static String three = """
            --------------
            |                   |
            |  ●    ●    ●  |
            |                   |
            --------------
            """;
    ;
    static String four = """
             --------------
            |  ●          ●   |
            |                   |
            |  ●          ●   |
            --------------
            """;
    static String five = """
            --------------
            |  ●          ●   |
            |        ●         |
            |  ●          ●   |
            --------------
            """;
    static String six = """
            --------------
            |  ●    ●    ●  |
            |                   |
            |  ●    ●    ●  |
            --------------
            """;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dice rolling program");
        System.out.println("Enter the number of time you wanna role the dice:");

        int no_of_times = scanner.nextInt();
        int sum_of_dices = 0;

        if (no_of_times > 0 && no_of_times < 7) {

            for (int i = 1; i <= no_of_times; i++) {
                sum_of_dices += Dice_rolling();
            }

        } else {
            System.out.println("The no of times should be greater than 0 less than 6.");
        }

        System.out.println("Sum of Dices are: " + sum_of_dices);
        scanner.close();
    }

    static int Dice_rolling() {
        int rand_number = random.nextInt(1, 7);

        switch (rand_number) {
            case 1 -> {
                System.out.println(one);
                return 1;
            }
            case 2 -> {
                System.out.println(two);
                return 2;
            }
            case 3 -> {
                System.out.println(three);
                return 3;
            }
            case 4 -> {
                System.out.println(four);
                return 4;
            }
            case 5 -> {
                System.out.println(five);
                return 5;
            }
            case 6 -> {
                System.out.println(six);
                return 6;
            }
        }
        return 0;
    }
}
