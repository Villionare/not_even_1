package Projects;
import java.util.Scanner;

public class Banking_app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User obj2 = new User();

        System.out.println("**Welcome to the world bank**");
        System.out.print("Please Enter your name: ");
        obj2.user_name = scanner.nextLine();
        System.out.print("Please Enter your bank amount: ");
        obj2.depositeAmt = scanner.nextInt();
        obj2.availBalance = obj2.depositeAmt;

        System.out.println("Welcome" + obj2.user_name);

        do {
            System.out.println("Please Click on any of the following Options (e.g. 1,2,3,4)");
            System.out.println("1 - Check Available Balance");
            System.out.println("2 - Deposit Money");
            System.out.println("3 - Withdraw Money");
            System.out.println("4 - Money Transfer");
            System.out.println("5 - Exit");

            obj2.userInput =  scanner.nextInt();

            switch (obj2.userInput){
                case 1 -> System.out.println("The Balance available in your account is: $" + obj2.availBalance);
                case 2 -> {
                    System.out.print("Please Enter the amount you want to deposit: ");
                    obj2.depositeAmt = scanner.nextInt();
                    obj2.availBalance  += obj2.depositeAmt;
                    System.out.println("Done!");
                }
                case 3 -> {
                    System.out.print("Please Enter the amount you want to Withdraw: ");
                    obj2.withdrawAmt = scanner.nextInt();
                    obj2.availBalance  -= obj2.withdrawAmt;
                    System.out.println("Done!");
                }
                case 4 -> {
                    System.out.print("Please Enter the amount you want to Transfer: ");
                    obj2.withdrawAmt = scanner.nextInt();
                    obj2.availBalance  -= obj2.withdrawAmt;
                    System.out.println("Done!");
                }
                case 5 -> {
                    obj2.sessionStatus = false;
                    System.out.println("Thankyou for using the bank!");
                }

                default -> System.out.println("you might have entered a wrong keyword");
            }
        } while (obj2.sessionStatus != false);
    };
}
