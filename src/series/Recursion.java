package series;

import java.util.Scanner;

public class Recursion {

    static void main() {
//THIS IS MY SOLUTION:
        Scanner scanner = new Scanner(System.in);
        int inp, factorial = 1;
        System.out.println("Input the no you want to find the Factorial of: ");
        inp = scanner.nextInt();


//        for (int i = (inp - 1); i > 0; i--) {
//            inp *= i;
//        }

//      NOW DOING THROUGH RECURSION:
//      System.out.println("The factorial would be: " + inp);
        System.out.println("The factorial would be: " + Factiorial(inp));
        scanner.close();

    }

    static int Factiorial(int n) {
        int result;
        if (n == 1) return 1;
        result = Factiorial(n - 1) * n;
        return result;
    }
}
