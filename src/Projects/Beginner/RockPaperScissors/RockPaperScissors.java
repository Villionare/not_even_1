package Projects.Beginner.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {

        int time = 1;
        int score_CC = 0;
        int score_YC = 0;

        Option cc;
        String yc;


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("The computer will first randomly choose Rock, Paper or Scissors.");


        System.out.println("""
                Computer has Chosen already,
                Enter you input -\s
                R - for ROCK,\
                P - for PAPER,\
                S - for SCISSORS""");

        while (true) {
            System.out.println("---------------------------------------------------------------------------------");
            do {

                int num = random.nextInt(3);
                cc = Option.values()[num]; // directly maps 0→ROCK, 1→PAPER, 2→SCISSORS

                System.out.printf("Your Score - %d\nComputer Score - %d\n", score_YC, score_CC);
                System.out.printf("Match %d of 3\n", time);

                //this loop is just for checking weather user has entered a correct input
                while (true) {
                    System.out.print("Enter Your Option: ");
                    yc = scanner.nextLine();

                    if (yc.equalsIgnoreCase("R") || yc.equalsIgnoreCase("P") || yc.equalsIgnoreCase("S")) {
                        break;
                    } else {
                        System.out.println("Invalid input, choose either R,P,S");
                    }

                }

                CASES result = checkWinner(yc, cc);

                if (result.equals(CASES.LOSE)) {
                    score_CC++;
                    System.out.println("YOU LOOSE!\ncomputer has choosen: " + cc);
                } else if (result.equals(CASES.WIN)) {
                    score_YC++;
                    System.out.println("YOU WIN!\ncomputer has choosen: " + cc);
                } else {
                    System.out.println("ITS A DRAW!\ncomputer has choosen: " + cc);
                }

                if (result != CASES.DRAW) time++;

            } while (time <= 3);

            if (score_YC > score_CC) {
                System.out.println("🏆 YOU WIN THE MATCH!");
            } else if (score_CC > score_YC) {
                System.out.println("💻 COMPUTER WINS THE MATCH!");
            } else {
                System.out.println("🤝 THE MATCH IS A TIE!");
            }

            System.out.printf("FINAL SCORE- YOU: %d | COMPUTER: %d\nWant a Rematch?\nEnter 1 to start, 0 to quit ", score_YC, score_CC);
            int option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                time = 1;
                score_CC = 0;
                score_YC = 0;
            } else {
                System.out.println("Have a nice Day!");
                break;
            }
        }

        scanner.close();
    }

    static CASES checkWinner(String yc, Option cc) {

        if (yc.equalsIgnoreCase("R") && cc.equals(Option.ROCK) || yc.equalsIgnoreCase("P") && cc.equals(Option.PAPER) || yc.equalsIgnoreCase("S") && cc.equals(Option.SCISSORS)) {
            return CASES.DRAW;
        } else if (yc.equalsIgnoreCase("R") && cc.equals(Option.SCISSORS) || yc.equalsIgnoreCase("P") && cc.equals(Option.ROCK) || yc.equalsIgnoreCase("S") && cc.equals(Option.PAPER)) {
            return CASES.WIN;
        } else {
            return CASES.LOSE;
        }

    }

}
