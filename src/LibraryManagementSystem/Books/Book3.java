package LibraryManagementSystem;

public class Book3 extends LibraryManagementSystem.Books {
    public Book3() {
        super("opi", "The Black Diamond", 20);
    }

    @Override
    void review() {
        System.out.println("God Level!!!");
    }
}

