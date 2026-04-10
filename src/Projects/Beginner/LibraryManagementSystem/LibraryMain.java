package Projects.Beginner.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

//This is a library management system program.
//it has authentication system for users and also it does the basic operations regarding to books

public class LibraryMain {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> member = new ArrayList<>();
        ArrayList<Books> book = new ArrayList<>();

        System.out.println("Welcome to the X Library\nConfirm you identity to enter:");
        System.out.println("PRESS 1 TO SIGN IN AND 2 TO SIGN UP");

        Member user = null;
        boolean authenticated = false;
        boolean loop = true;
        int inp = scanner.nextInt();
        scanner.nextLine();

        if (inp >= 0 && inp <= AuthOptions.values().length) {

            AuthOptions authSelection = AuthOptions.values()[inp - 1];

            switch (authSelection) {
                case AuthOptions.SIGN_IN -> user = signIn(scanner, member);
                case AuthOptions.SIGN_UP -> user = signUp(scanner, member);
                default -> System.out.println("Invalid Input.");
            }

            if (user != null) {
                authenticated = true;
            }

            if (authenticated) {
                System.out.printf("Welcome %s\nFrom the options below choose the option that you wanna do:\n", user.getName());

                while (loop) {
                    System.out.println("------------------------------------------------");
                    System.out.println("""
                            1 - Add a book
                            2 - view all books
                            3 - search a book by name or author
                            4 - borrow a book
                            5 - return a book
                            6 - Exit""");

                    int inpAction = scanner.nextInt();
                    scanner.nextLine();

                    if (inpAction >= 1 && inpAction <= ACTIONS.values().length) {
                        ACTIONS inpAct = ACTIONS.values()[inpAction - 1];

                        switch (inpAct) {
                            case ACTIONS.ADD -> ADD(book, scanner);
                            case ACTIONS.VIEW -> VIEW(book);
                            case ACTIONS.SEARCH -> SEARCH(book, scanner);
                            case ACTIONS.BORROW -> BORROW(book, scanner);
                            case ACTIONS.RETURN -> RETURN(book, scanner);
                            case ACTIONS.EXIT -> {
                                System.out.println("Thank you");
                                loop = false;
                            }
                            default -> System.out.println("Enter correct option");
                        }

                    } else {
                        System.out.println("Enter Correct option");
                    }
                }
            }
        }
        scanner.close();
    }

    static Member signIn(Scanner scanner, ArrayList<Member> member) {

        while (true) {

            System.out.println("Enter your id");
            String id = scanner.nextLine();

            System.out.println("Enter your Password");
            String pw = scanner.nextLine();

            Member found = null;
            for (Member one : member) {
                if (one.getMemberId().equals(id)) {
                    found = one;
                    break;
                }
            }

            if (found == null) {
                System.out.println("User with this id is not found. Try again.");
            } else if (!found.getPassword().equals(pw)) {
                System.out.println("Wrong password. Try again.");
            } else {
                System.out.println("You are successfully logged in!");
                return found;
            }

        }
    }

    static Member signUp(Scanner scanner, ArrayList<Member> member) {

        try {
            System.out.println("When your id is generated, you will receive a id number. REMEMBER THAT!");
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your Password");
            String pw = scanner.nextLine();

            Member newMember = new Member(name, pw);
            member.add(newMember);
            System.out.println("You have signed up, id is: " + newMember.getMemberId());
            return newMember;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void ADD(ArrayList<Books> book, Scanner scanner) {
        try {
            System.out.println("Enter the Name of the book that you wanna add");
            String name = scanner.nextLine();
            System.out.println("Enter the Name of the Author");
            String author = scanner.nextLine();
            System.out.println("Enter the year of publishing");
            int year = scanner.nextInt();

            Books addBook = new Books(name, author, year, true);
            book.add(addBook);
            System.out.printf("Book %s by %s is added successfully with id: %s\n", name, author, addBook.getBook_id());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void VIEW(ArrayList<Books> book) {

        System.out.println("Here are the list of all the books that are currently listed in Library");
        System.out.println("Book ID | Name | Author | Year | Available");

        for (Books b : book) {
            System.out.printf("%s | %s | %s | %d | %b \n", b.getBook_id(), b.getName(), b.getAuthor(), b.getYear(), b.isAvailable());
        }
    }

    static void BORROW(ArrayList<Books> book, Scanner scanner) {

        Books borrow = null;
        VIEW(book);

        selectAgain:
        while (true) {

            System.out.println("Enter the book id that you wanna borrow");
            String id = scanner.nextLine();

            //check id
            for (Books borrowBook : book) {
                if (borrowBook.getBook_id().equals(id)) {
                    System.out.println("The Book that you mentioned is: " + borrowBook.getName() + " By " + borrowBook.getAuthor());
                    borrow = borrowBook;
                }
            }

            //check availability
            if (borrow != null && borrow.isAvailable()) {
                System.out.println("Yes, this book is available to borrow!");
            }

            while (true) {

                System.out.println("Confirm by typing 1 and 0 to select again");
                int confirm = Integer.parseInt(scanner.nextLine());

                if (borrow != null && confirm == 1) {

                    borrow.setAvailable(false);
                    System.out.println("Congrats you have successfully brought the book: " + borrow.getName() + " By " + borrow.getAuthor());
                    return;

                } else if (confirm == 0) {

                    break selectAgain;

                } else {
                    System.out.println("Wrong input");
                }
            }
        }
    }

    static void RETURN(ArrayList<Books> book, Scanner scanner) {
        VIEW(book);

        Books returnBook = null;

        selectAgain:
        while (true) {


            System.out.println("Enter the book id that you wanna return");
            String id = scanner.nextLine();

            //check id
            for (Books borrowBook : book) {
                if (borrowBook.getBook_id().equals(id)) {
                    System.out.println("The Book that you mentioned is: " + borrowBook.getName() + " By " + borrowBook.getAuthor());
                    returnBook = borrowBook;
                }
            }

            //check availability
            if (returnBook != null && !returnBook.isAvailable()) {
                System.out.println("Yes, you can return this book now!");
            } else {
                System.out.println("no this can't be returned at this moment");
            }

            while (true) {

                System.out.println("Confirm by typing 1 and 0 to select again");
                int confirm = Integer.parseInt(scanner.nextLine());

                if (returnBook != null && confirm == 1) {

                    returnBook.setAvailable(false);
                    System.out.println("Congrats you have successfully returned the book: " + returnBook.getName() + " By " + returnBook.getAuthor());
                    return;

                } else if (confirm == 0) {

                    break selectAgain;

                } else {
                    System.out.println("Wrong input");
                }
            }
        }
    }

    static void SEARCH(ArrayList<Books> book, Scanner scanner) {

        Books result = null;

        while (true) {

            System.out.println("""
                    Choose:
                    1 - Search by name
                    2 - Search by author
                    """);

            System.out.println("Enter keyword: ");
            int inp = Integer.parseInt(scanner.nextLine());

            switch (inp) {
                case 1 -> result = searchByName(book, scanner);
                case 2 -> result = searchByAuthor(book, scanner);
                default -> System.out.println("Invalid input, enter again");
            }

            if (result == null) {
                System.out.println("No results found\npress 0 to exit");
                var res = Integer.parseInt(scanner.nextLine());

                if (res == 0) {
                    break;
                } else {
                    continue;
                }

            } else {
                System.out.println("Result found:\n" + result.getBook_id() + " " + result.getName() + " " + result.getAuthor() + " " + result.getYear());
                break;
            }
        }
    }

    static Books searchByName(ArrayList<Books> book, Scanner scanner) {
        System.out.println("Enter name name");
        var nameKey = scanner.nextLine();

        for (Books item : book) {
            if (item.getName().equals(nameKey)) {
                return item;
            }
        }
        return null;
    }

    static Books searchByAuthor(ArrayList<Books> book, Scanner scanner) {
        System.out.println("Enter name Author");
        var authorKey = scanner.nextLine();

        for (Books item : book) {
            if (item.getAuthor().equals(authorKey)) {
                return item;
            }
        }
        return null;
    }

}