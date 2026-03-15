import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator BRO:");

        System.out.println("Enter First Number:");
        double num1 = scanner.nextDouble();

        System.out.println("Pick any one option: \n 1 - Addition(+) \n 2 - Substraction(-) \n 3 -  Multiplication \n 4 -  Division(/) ");
        char inp = scanner.next().charAt(0);

        System.out.println("Enter Second Number:");
        double num2 = scanner.nextDouble();
        double result = 0;

        switch (inp) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Denominator can't be 0");
                } else {
                    result = num1 / num2;
                }
            }
        }
        ;
        System.out.println(result);
        scanner.close();
    }
}
