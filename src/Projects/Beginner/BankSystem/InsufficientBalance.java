package Projects.Beginner.BankSystem;

public class InsufficientBalance extends RuntimeException {

    public InsufficientBalance(String message) {
        super(message);
    }
}
