package Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean run = true;

        System.out.println("This a Calculator\n" +
                "Enter continueously numbers followed by +, -, *, /");
        System.out.println("commands: \"+\" - add");
        System.out.println("commands: \"-\" - subtract");
        System.out.println("commands: \"*\" - multiplication");
        System.out.println("commands: \"/\" - division");
        System.out.println("commands: \"exit\" - to exit");
        System.out.println("commands: \"eq\" - for final equals");
        System.out.println("__________________________________________________________");

        //helper loop
        while (true) {
            try {
                System.out.print("Enter Number: ");
                result = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
        }

        while (run) {
            System.out.println("display:  " + result);

            System.out.print("Enter Operation: ");
            String command = scanner.nextLine();

            switch (command) {
                case "+":
                    System.out.println("add another number to add: ");
                    try {
                        double add = Double.parseDouble(scanner.nextLine());
                        result += add;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, please try again.");
                    }
                    break;
                case "-":
                    System.out.println("add another number to subtract: ");
                    try {
                        double subs = Double.parseDouble(scanner.nextLine());
                        result -= subs;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, please try again.");
                    }
                    break;

                case "*": {
                    System.out.println("add another number to multiply: ");
                    try {
                        double mult = Double.parseDouble(scanner.nextLine());
                        result *= mult;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, please try again.");
                    }
                    break;
                }

                case "/":
                    System.out.println("add another number to divide: ");
                    try {
                        double devi = Double.parseDouble(scanner.nextLine());
                        if (devi == 0) {
                            System.out.println("0 in denominator will lead to infinity, write another denominator");
                        } else {
                            result /= devi;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, please try again.");
                    }
                    break;

                case "exit", "eq":
                    System.out.println("So, the final answer is: " + result);
                    run = false;
                    break;
                default:
                    System.out.println("Enter correct option");
            }
        }
        scanner.close();
    }
}