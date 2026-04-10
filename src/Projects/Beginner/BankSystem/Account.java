package Projects.Beginner.BankSystem;


import java.util.ArrayList;

public class Account {
    private static int Counter = 1000;
    private final ArrayList<String> transaction = new ArrayList<>();
    private final int accountId;
    private final String holderName;
    private double balance;
    private String password;
    private int transactionsUnit = 0;

    public Account(String holderName, String password, double balance) {
        this.accountId = ++Counter;
        this.holderName = holderName;
        this.password = password;
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(int amt) {

        if (balance <= 0 || balance < amt) {
            throw new InsufficientBalance("You only have " + balance + " left.");
        } else {
            balance -= amt;
        }
    }

    public String getHolderName() {
        return holderName;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(String from, String to, double amt) {
        String newTransaction = "From " + from + " to " + to + " of Rs. " + amt;
        transaction.add(newTransaction);
    }

    public ArrayList<String> getTransaction() {
        return transaction;
    }

    public void setPasswordFromCSV(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getTransactionsUnit() {
        return transactionsUnit;
    }

    public void setTransactionsUnitFromCSV(int transactionsUnit) {
        this.transactionsUnit = transactionsUnit;
    }
}
