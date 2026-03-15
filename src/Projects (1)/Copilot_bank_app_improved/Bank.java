package Projects.Copilot_bank_app_improved;
import java.util.Scanner;

public class Bank {
    private User user;
    private boolean sessionActive = true;
    private Scanner scanner = new Scanner(System.in);

    public Bank(User user) {
        this.user = user;
    }

    public void startSession() {
        System.out.println("\n🌍 Welcome to the World Bank, " + user.getUserName() + "!");

        while (sessionActive) {
            showOptions();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("💰 Current Balance: $" + user.getBalance());
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> transferMoney();
                case 5 -> exitBank();
                default -> System.out.println("❌ Invalid option. Please try again.");
            }
        }
    }

    private void showOptions() {
        System.out.println("\n📌 Choose an Option:");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit Money");
        System.out.println("3 - Withdraw Money");
        System.out.println("4 - Transfer Money");
        System.out.println("5 - Exit");
        System.out.print("Your choice: ");
    }

    private void depositMoney() {
        System.out.print("Enter deposit amount: ");
        int amount = scanner.nextInt();
        user.deposit(amount);
        System.out.println("✅ Successfully deposited $" + amount);
    }

    private void withdrawMoney() {
        System.out.print("Enter withdrawal amount: ");
        int amount = scanner.nextInt();
        if (user.withdraw(amount)) {
            System.out.println("✅ Successfully withdrew $" + amount);
        }
    }

    private void transferMoney() {
        System.out.print("Enter transfer amount: ");
        int amount = scanner.nextInt();
        if (user.withdraw(amount)) {
            System.out.println("✅ Transfer Successful! Amount: $" + amount);
        }
    }

    private void exitBank() {
        System.out.println("👋 Thank you for using our bank!");
        sessionActive = false;
    }
}