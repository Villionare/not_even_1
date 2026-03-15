import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissiors {

    static void main_fun(Scanner scanner) {
        Random random = new Random();
        String[] comper_move = {"rock", "paper", "scissors"};

        System.out.println("Welcome to the Game! -> ROCK PAPER - SCISSORS");
        System.out.println("Enter your move: - rock, paper or scissors:");
        String pick = scanner.nextLine().toLowerCase();

        if (!pick.equals("rock") && !pick.equals("paper") && !pick.equals("scissors")) {
            System.out.println("Wrong Keyword!");
            return;
        }

        String c_pick = comper_move[random.nextInt(0, 3)];

        System.out.println(c_pick);

        if (c_pick.equals(pick)) {
            System.out.println("tie");
        } else if (c_pick.equals("rock") && pick.equals("scissors") || c_pick.equals("paper") && pick.equals("rock") || c_pick.equals("scissors") && pick.equals("paper")) {
            System.out.println("you loose");
        } else {
            System.out.println("you win");
        }
    }

    ;

    static void play_again(Scanner scanner) {
        System.out.println("do you wanna play again?? -  yes or no");
        String inp = scanner.nextLine();
        if (inp.equals("yes")) {
            main_fun(scanner);
        } else if (inp.equals("no")) {
            System.out.println("game over");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        main_fun(scanner);
        play_again(scanner);
        scanner.close();
    }
}
