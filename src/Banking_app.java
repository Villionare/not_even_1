import java.util.Scanner;

public class Banking_app {
    static int balance = 0;
    static int withdraw;
    static int deposit;
    static int menu_option = 0;

    static void Deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        deposit = scanner.nextInt();
        balance += deposit;
    }

    static void Withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to Withdraw:");
        withdraw = scanner.nextInt();
        balance -= withdraw;
    }

    static void showBalance() {
        System.out.println("Your current Balance is:");
        System.out.printf("%d\n", balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Welcome to xxx Bank;");
            System.out.println("\nPlease choose any operation below (type 1, 2, 3, 4)");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            menu_option = scanner.nextInt();

            if (menu_option == 1) {
                showBalance();
            } else if (menu_option == 2) {
                Withdraw();
            } else if (menu_option == 3) {
                Deposit();
            } else if (menu_option == 4) {
                break;
            } else {
                System.out.println("You have entered a wrong Keyword");
            }

        } while (menu_option != 4);

        System.out.println("Thankyou for using XXX bank");
        scanner.close();
    }
}
