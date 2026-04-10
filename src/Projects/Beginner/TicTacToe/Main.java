package Projects.Beginner.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to tic tac toe game: ");

        outerloop:
        while (true) {
            char[][] plane = {
                    {'_', '_', '_'},
                    {'_', '_', '_'},
                    {'_', '_', '_'},
            };

            gameloop:
            while (true) {
                System.out.println("select: \n1 - vs computer\n2 - two players\n3 - Exit");
                int inpGameType = scanner.nextInt();
                if (inpGameType >= 1 && inpGameType <= 3) {
                    Actions actions = Actions.values()[inpGameType - 1];
                    switch (actions) {
                        case Actions.SINGLE -> {
                            vsComputer(random, scanner, plane);
                            System.out.println("Want to play again? - press 1 or exit press 0");
                            int ans = scanner.nextInt();
                            if (ans != 1) {
                                break outerloop;
                            }
                        }
                        case Actions.TWO_PLAYER -> {
                            twoPlayers(scanner, plane);
                            System.out.println("Want to play again? - press 1 or exit press 0");
                            int ans = scanner.nextInt();
                            if (ans != 1) {
                                break outerloop;
                            }
                        }
                        case Actions.EXIT -> {
                            System.out.println("Thank you for playing tic tac toe");
                            break gameloop;
                        }
                        default -> System.out.println("invalid input");
                    }
                } else {
                    System.out.println("Invalid Input, chose appropriate value 1, 2, 3");
                }
            }


        }
        System.out.println("Thank you for playing tic tac toe");
    }

    private static void twoPlayers(Scanner scanner, char[][] plane) {

        int times = 0;
        boolean win = false;
        char turn_of = 'X';

        loop:
        while (true) {

            printBoard(plane);

            //player(X) turn
            win = turnOf(turn_of, scanner, plane);

            if (win) {
                break loop;
            } else {
                //player(O) turn
                turn_of = 'O';
                win = turnOf(turn_of, scanner, plane);
                if (win) {
                    break loop;
                }
            }
            turn_of = 'X';
            times++;

            if (times > 9) {
                break loop;
            }
        }

        if (win) {
            System.out.printf("player(%c) has won the game", turn_of);
            printBoard(plane);
        } else {
            System.out.println("its a draw");
        }

    }

    private static boolean turnOf(char player, Scanner scanner, char[][] plane) {

        loop:
        while (true) {

            System.out.printf("Player(%c) Enter the coordinates\n", player);

            System.out.print("row ");
            int row = scanner.nextInt();

            System.out.print("column ");
            int col = scanner.nextInt();

            //check valid move
            boolean isValidMove = isValidMove(plane, row, col);

            if (isValidMove) {
                //filling the coordinates
                plane[row][col] = player;
                return checkWin(plane, player);
            } else {
                System.out.println("Enter correct row and column");
                continue loop;
            }
        }

        //check win condition
    }

    private static void printBoard(char[][] plane) {

        //printing the plane
        for (char[] i : plane) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    private static boolean checkWin(char[][] plane, char player) {

        //check rows
        for (int i = 0; i <= 2; i++) {
            if (plane[i][0] == player && plane[i][1] == player && plane[i][2] == player) {
                return true;
            }
        }

        //check columns
        for (int i = 0; i <= 2; i++) {
            if (plane[0][i] == player && plane[1][i] == player && plane[2][i] == player) {
                return true;
            }
        }

        //check diagonals for X
        return plane[0][0] == player && plane[1][1] == player && plane[2][2] == player || plane[0][2] == player && plane[1][1] == player && plane[2][0] == player;
    }

    private static boolean isValidMove(char[][] plane, int row, int col) {

        //check weather the given location is already filled
        if (plane[row][col] == 'X' || plane[row][col] == 'O') {
            return false;
        }

        //check weather the given location is out of bound of the 2d array
        return row <= 2 && col <= 2;
    }

    private static void vsComputer(Random random, Scanner scanner, char[][] plane) {

        int times = 0;
        boolean win = false;
        String turn_of = "Player";

        System.out.println("Player choose you want to play with 'X' or 'O' ");
        System.out.println("1 - X\n2 - O");

        int selection = scanner.nextInt();
        char player_symbol = (selection == 1) ? 'X' : 'O';
        char computer_symbol = (player_symbol == 'X') ? 'O' : 'X';

        loop:
        while (true) {

            printBoard(plane);

            //player turn
            win = turnOfPlayer(player_symbol, scanner, plane);

            if (win) {
                break loop;
            } else {

                //Computer turn
                turn_of = "Computer";
                win = computerMove(random, computer_symbol, plane);
                if (win) {
                    break loop;
                }
            }

            times++;
            if (times > 9) {
                break loop;
            } else {
                turn_of = "Player";
            }
        }

        if (win) {
            System.out.printf("%s has won the game\n", turn_of);
            printBoard(plane);
        } else {
            System.out.println("Its a Draw");
        }
    }

    private static boolean turnOfPlayer(char symbol, Scanner scanner, char[][] plane) {

        loop:
        while (true) {

            System.out.println("Player enter the coordinates\n");

            System.out.print("row: ");
            int row = scanner.nextInt();

            System.out.print("column: ");
            int col = scanner.nextInt();

            //check valid move
            boolean isValidMove = isValidMove(plane, row, col);

            if (isValidMove) {
                //filling the coordinates
                plane[row][col] = symbol;

                //check win condition
                return checkWin(plane, symbol);
            } else {
                System.out.println("Enter correct row and column");
                continue loop;
            }
        }

    }

    private static boolean computerMove(Random random, char symbol, char[][] plane) {

        int row = 0;
        int col = 0;
        boolean rightMove = false;

        while (!rightMove) {

            //random.nextInt(max - min + 1) - min;
            //max = 2, min = 0
            row = random.nextInt(3);
            col = random.nextInt(3);

            rightMove = isValidMove(plane, row, col);
        }

        plane[row][col] = symbol;

        System.out.printf("Computer has made its move at row: %d, column: %d \n", row, col);
        printBoard(plane);
        System.out.println("---------------------------------------------------");

        return checkWin(plane, symbol);
    }

}
