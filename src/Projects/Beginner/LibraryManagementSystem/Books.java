package Projects.Beginner.LibraryManagementSystem;

public class Books {
    static private int id = 0;
    private String book_id;
    private String name;
    private String Author;
    private int year;
    private boolean available;

    public Books(String name, String author, int year, boolean available) {
        book_id = "book_" + ++id;
        this.name = name;
        Author = author;
        this.year = year;
        this.available = available;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
