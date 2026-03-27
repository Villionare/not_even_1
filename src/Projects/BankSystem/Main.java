package Projects.BankSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        Account user = null;

        //loading all the data from csv to ArrayList
        loadAccountsCSV(accounts);
        System.out.println("WELCOME TO DIDDY BANK");

        while (true) {

            System.out.println("""
                    -------------------------------------------
                    Press 1 to sign in
                    press 2 from sign up
                    """);

            int inp = Integer.parseInt(scanner.nextLine());

            if (inp >= 1 && inp <= 2) {
                switch (inp) {
                    case 1 -> user = signIn(accounts, scanner);
                    case 2 -> user = signUp(accounts, scanner);
                    default -> System.out.println("Invalid input");
                }
                break;
            } else {
                System.out.println("Invalid Input, Either enter 1 or 2");
                continue;
            }
        }

        if (user != null) {
            bankOperations(scanner, user);
        }

        scanner.close();
    }

    private static Account signIn(ArrayList<Account> accounts, Scanner scanner) {

        Account holder = null;

        System.out.println("Enter your bank ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your bank password:");
        String pass = scanner.nextLine();

        for (Account i : accounts) {
            if (i.getAccountId() == id) {
                holder = i;
            }
        }

        if (holder == null) {
            System.out.println("no such Account ID exists");
        } else if (!holder.getPassword().equals(pass)) {
            System.out.println("wrong password");
        } else {
            System.out.println("Congratulations" + holder.getHolderName() + " Your identification is confirmed");
            return holder;
        }

        return null;
    }

    private static Account signUp(ArrayList<Account> accounts, Scanner scanner) {
        Account holder = null;
        String filePath = "/home/duedull/IdeaProjects/not_even_1/src/Projects/BankSystem/accounts.csv";
        System.out.println("Kindly fill the following details to Create an Account");

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your bank password:");
        String pass = scanner.nextLine();
        System.out.println("Enter the amount that you wanna deposit:");
        double balance = scanner.nextDouble();


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {

            holder = new Account(name, pass, balance);
            accounts.add(holder);

            //move to the new line
            bufferedWriter.newLine();
            bufferedWriter.write(
                    holder.getAccountId() + "," +
                            name + "," +
                            pass + "," +
                            balance + "," +
                            holder.getTransactionsUnit()
            );

            System.out.println(name + "Successfully created your account");
            System.out.println(name + "Your account id is: " + holder.getAccountId());
            return holder;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void bankOperations(Scanner scanner, Account user) {

        while (true) {

            System.out.println("""
                    Choose the following options to perform actions:
                    1 - Deposit Money
                    2 - Withdraw
                    3 - Check Balance
                    4 - Add Transactions
                    5 - Mini Statement
                    6 - Exit
                    """);

            int inp = scanner.nextInt();
            scanner.nextLine();

            if (inp >= 1 && inp <= 6) {
                Actions select = Actions.values()[inp - 1];

                switch (select) {
                    case Actions.DEPOSIT -> deposit(scanner, user);
                    case Actions.WITHDRAW -> withdraw(scanner, user);
                    case Actions.CHECK_BALANCE -> checkBalance(user);
                    case Actions.MINI_STATEMENT -> miniStatement(user);
                    case Actions.ADD_TRANSACTIONS -> addTransaction(user, scanner);
                    case Actions.EXIT -> {
                        System.out.println("Thank you for using bank");
                        return;
                    }
                }
            }
        }
    }

    static void deposit(Scanner scanner, Account user) throws InsufficientBalance {
        System.out.println("Enter the amount the you wanna deposit");
        double moneyAdd = scanner.nextDouble();
        user.deposit(moneyAdd);
        System.out.println("Money added to your bank");

    }

    static void withdraw(Scanner scanner, Account user) {
        try {
            System.out.println("Enter the amount you want to withdraw");
            int moneyWithdraw = scanner.nextInt();
            user.withdraw(moneyWithdraw);
            System.out.println("Money withdrawn successfully from your bank");
        } catch (InsufficientBalance e) {
            System.out.println("Error: " + e.getMessage()); // handle it, don't re-throw
        }
    }

    static void checkBalance(Account user) {
        System.out.println("The available balance in your account is: " + user.getBalance());
    }

    static void addTransaction(Account user, Scanner scanner) {
        System.out.println("Enter the receiver name");
        String receiver = scanner.nextLine();
        System.out.println("Enter the amount");
        int amt = scanner.nextInt();

        user.addTransaction(user.getHolderName(), receiver, amt);
        System.out.println("Transaction Added");
    }

    static void miniStatement(Account user) {
        System.out.println("There are the 5 mini transactions:");

        for (String transaction : user.getTransaction()) {
            System.out.println(transaction);
        }
    }

    static void loadAccountsCSV(ArrayList<Account> accounts) {

        String line = null;
        String filePath = "/home/duedull/IdeaProjects/not_even_1/src/Projects/BankSystem/accounts.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            //this skips the next line
            bufferedReader.readLine();


            while ((line = bufferedReader.readLine()) != null) {

                //creating array with indexes separated by ,
                var newAccountAddition = getAccount(line);

                //now saving that account in ArrayList
                accounts.add(newAccountAddition);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Account getAccount(String line) {
        String[] data = line.split(",");

        //here we are putting data in specific index
        String accountID = data[0];
        String holderName = data[1];
        String password = data[2];
        double balance = Double.parseDouble(data[3]);
        int transactionUnit = Integer.parseInt(data[4]);

        //adding new Account
        Account newAccountAddition = new Account(holderName, accountID, balance);
        newAccountAddition.setPasswordFromCSV(password);
        newAccountAddition.setTransactionsUnitFromCSV(transactionUnit);
        return newAccountAddition;
    }

}