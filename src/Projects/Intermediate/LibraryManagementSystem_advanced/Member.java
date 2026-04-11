package Projects.Intermediate.LibraryManagementSystem_advanced;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Member implements CSVWritable, Serializable {

    private final ArrayList<Book> issueBooksList = new ArrayList<>();
    private String username;
    private String name;
    private String email;
    private LocalDate dob;
    private String password;
    private int issueBooks;

    public Member(String username, String name, String email, LocalDate dob, String password, int issueBooks) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.password = password;
        this.issueBooks = issueBooks;
        this.username = username;
    }

    public ArrayList<Book> getIssueBooksList() {
        return issueBooksList;
    }

    public void setIssueBooksList(Book issueBook) {
        this.issueBooksList.add(issueBook);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIssueBooks() {
        return issueBooks;
    }

    public void setIssueBooks(int issueBooks) {
        this.issueBooks = issueBooks;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toCSV() {
        return getUsername() + getName() + getEmail() + getDob() + getPassword() + getIssueBooks();
    }
}
