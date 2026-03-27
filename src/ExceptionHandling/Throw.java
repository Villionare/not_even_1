package ExceptionHandling;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throw {

    //if we manually throw an exception and there is no catch block to catch it,
    //the control will go to the caller fuc. that weather it have any catch to handle that
    //if there is no catch in any parent caller function the program will terminate
    //and the code after manual exception will not execute.

    static void main() {
        Scanner scanner = new Scanner(System.in);
        callerB(scanner);
    }

    private static void callerB(Scanner scanner) {
        callerA(scanner);
    }

    private static void callerA(Scanner scanner) {
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new FileNotFoundException("Age is less");
            } else {
                System.out.println("you are eligible");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("now the program ends");
    }
}