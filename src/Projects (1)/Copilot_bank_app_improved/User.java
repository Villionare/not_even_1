package Projects.Copilot_bank_app_improved;

public class User {
    private String userName;
    private int balance;

    public User(String name, int initialDeposit) {
        this.userName = name;
        this.balance = initialDeposit;
    }

    public String getUserName() {
        return userName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}