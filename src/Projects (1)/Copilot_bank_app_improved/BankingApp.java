package Projects.Copilot_bank_app_improved;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user details
        System.out.println("\n🌍 Welcome to the World Bank");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        int initialDeposit = scanner.nextInt();

        // Create User & Bank objects
        User user = new User(name, initialDeposit);
        Bank bank = new Bank(user);

        // Start banking session
        bank.startSession();
    }
}
