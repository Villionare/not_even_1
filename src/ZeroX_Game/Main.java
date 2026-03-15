package ZeroX_Game;

import javax.swing.text.DefaultStyledDocument;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{

    int a =5,
        b=6__________0__0,
        r=786,
        c=45;
        static double bx = 0x12.2P2;

    static char[][] matrix = new char[3][3];
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println(bx);
            Start();
    }

    private static void Start(){
        System.out.println("Welcome to tic tac toe game!\n press S to continue\n'E' to exit.");
        char inp = scanner.nextLine().charAt(0);

        if(inp=='S'){
            symbolSelect();
        }else if(inp=='E'){
            System.out.println("Farewell");
            System.exit(0);
        }else{
            System.out.println("press S");
            Start();
        }
    }

    private static void symbolSelect(){
        System.out.println("Choose X or O");
        char sym = scanner.nextLine().charAt(0);

        if (sym=='X'){
            Game('X');
        } else if (sym=='O') {
            Game('O');
        }else {
            System.out.println("Press X or O");
            symbolSelect();
        }
    }

    private static void Game(char inp){

        for (char[] k:matrix){
            for (char i:k){
                if (i==' '){

                }
                System.out.printf("| %c |",i);
            }
            System.out.println(" ");
        }

        System.out.println("First is your turn make a move:");
    }

}
