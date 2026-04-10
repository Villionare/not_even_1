package Projects.Intermediate.LibraryManagementSystem_advanced;

//Add/View/Search/Delete Books & Members
//Issue & Return books (with due dates)
//Fine calculation
//Save all data in files (or serialized objects)
//Admin & User login

//Buffered reader, writer, File writer, Object Serialization
//ArrayList, HashMap, LocalDate, Exception Handling,
//Enums

import java.time.LocalDate;
import java.util.*;

public class Main {

    static void main() {

        Admin admin = null;
        Member loggedInMember = null;

        Scanner scanner = new Scanner(System.in);

        //Admin Hashmap getting loaded from object file .dat
        HashMap<String, Admin> adminHashMap = FileManager.loadAdminObject();

        //managing users data with different data structures for different purposes
        HashMap<String, Member> user = FileManager.loadMembersHashmap();
//        ArrayList<Member> memberArrayList = new ArrayList<>();

        //managing book data with different data structures for different purposes
        HashMap<String, Book> bookHashMap = new HashMap<>();
        ArrayList<Book> bookArrayList = FileManager.loadArrayListBooks();

        System.out.println("Welcome to GuardiansX Library");
        System.out.println("Confirm your Identity\n1 - Login\n2 - SignUp\n3 - Admin Login\n4 - Admin SignUp\n5 - Exit");

        //loading all the users into the hashmap
//        loadUsersCSV(user, memberArrayList);
//        loadBooksCSV(bookHashMap, bookArrayList);

        //saving all the loaded object in file
        FileManager.saveArrayListBooks(bookArrayList);
        FileManager.saveMembersHashmap(user);

        while (true) {

            int inpOpt = Integer.parseInt(scanner.nextLine().trim());

            if (inpOpt >= 1 && inpOpt <= 5) {
                AuthenticationOptions inpOption = AuthenticationOptions.values()[inpOpt - 1];
                switch (inpOption) {
                    case AuthenticationOptions.SIGN_IN -> loggedInMember = signIn(user, scanner);
                    case AuthenticationOptions.SIGN_UP -> loggedInMember = signUp(user, scanner);
                    case AuthenticationOptions.ADMIN_LOGIN -> admin = adminLogin(scanner, adminHashMap);
                    case AuthenticationOptions.ADMIN_REGISTRATION -> admin = adminSignUp(scanner, adminHashMap);
                    case AuthenticationOptions.EXIT -> {
                        System.out.println("Have a nice day!");
                        return;
                    }
                }

                break;
            } else {
                System.out.println("Enter Correct Option 1,2,3");
            }
        }

        optionsLoop:
        while (true) {
            if (loggedInMember != null || admin != null) {
                System.out.println("Kindly choose from the following options");
                System.out.println("""
                        1-ADD a book
                        2-VIEW all books
                        3-SEARCH a book
                        4-DELETE a book
                        5-Logout and Exit""");

                int inp = Integer.parseInt(scanner.nextLine().trim());

                if (inp >= 1 && inp <= 5) {
                    Actions actions = Actions.values()[inp - 1];

                    switch (actions) {
                        case Actions.ADD -> addBook(scanner, bookHashMap, bookArrayList);
                        case Actions.VIEW -> viewBook(bookArrayList);
                        case Actions.SEARCH -> searchBook(scanner, bookArrayList);
                        case Actions.DELETE -> deleteBook(bookArrayList, bookHashMap, scanner);
                        case Actions.EXIT -> {
                            System.out.println("You have been logged out\nHave a nice day!");
                            break optionsLoop;
                        }
                    }
                }
            }
        }
        scanner.close();
    }

    private static Admin adminSignUp(Scanner scanner, HashMap<String, Admin> adminHashMap) {

        Admin newAdmin;

        System.out.println("===== Admin Sign Up =====");

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter full name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Enter date of birth (YYYY-MM-DD): ");
        LocalDate dob = LocalDate.parse(scanner.nextLine().trim());

        String password;
        while (true) {
            System.out.print("Enter password (min. 8 characters): ");
            password = scanner.nextLine().trim();
            if (password.length() >= 8) break;
            System.out.println("Password too short. Try again.");
        }

        while (true) {
            System.out.print("Confirm password: ");
            String confirm = scanner.nextLine().trim();
            if (password.equals(confirm)) {
                break;
            }
        }

        newAdmin = new Admin(username, name, email, dob, password);
        adminHashMap.put(username, newAdmin);

        //save object in File (object Serialization)
        FileManager.saveAdminObject(adminHashMap);

        System.out.println("Account created successfully! Welcome, " + name + ".");
        return newAdmin;
    }

    private static Admin adminLogin(Scanner scanner, HashMap<String, Admin> adminHashMap) {

        Admin admin;
        System.out.println("===== Admin Login =====");

        while (true) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine().trim();

            System.out.print("Enter password: ");
            String password = scanner.nextLine().trim();

            if (!adminHashMap.containsKey(username)) {
                System.out.println("Admin not found. Please check your username.");
                continue;
            }

            admin = adminHashMap.get(username);

            if (!admin.getPassword().equals(password)) {
                System.out.println("Incorrect password. Access denied.");
                continue;
            }
            break;
        }

        System.out.println("Login successful. Welcome, " + admin.getName() + "!");
        return admin;
    }

    private static void addBook(Scanner scanner, HashMap<String, Book> bookHashMap, ArrayList<Book> bookArrayList) {

        while (true) {

            try {
                System.out.println("Enter book title");
                String name = scanner.nextLine().trim();
                System.out.println("Enter book author");
                String author = scanner.nextLine().trim();
                System.out.println("Enter book genre");
                String genre = scanner.nextLine().trim();

                int totalSize = bookHashMap.size();
                String newSize = String.format("%03d", ++totalSize);
                String newID = "B" + newSize;

                Book book = new Book(newID, name, author, genre, true);
//              writeIntoBooksCSV(book);
                bookArrayList.add(book);
                bookHashMap.put(newID, book);
                FileManager.saveArrayListBooks(bookArrayList);

                System.out.println("Book has been Added Successfully");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter correct input");
            }
        }
    }

    private static void viewBook(ArrayList<Book> bookArrayList) {
        System.out.println("Showing all the available books in the library: ");
        System.out.println("BOOK_ID | NAME | AUTHOR | GENRE | AVAILABLE");
        for (Book book : bookArrayList) {
            System.out.println(book.getBookId() + "|" + book.getTitle() + "|" + book.getAuthor() + "|" + book.getGenre() + "|" + book.isAvailable());
        }
    }

    private static void searchBook(Scanner scanner, ArrayList<Book> bookArrayList) {

        ArrayList<Book> searchResults = new ArrayList<>();
        boolean found = false;

        while (true) {

            System.out.println("Enter the book ID or Book title that you want to search: ");
            String query = scanner.nextLine().trim();

            for (Book book : bookArrayList) {
                if (book.getTitle().toLowerCase().contains(query.toLowerCase()) || book.getBookId().equals(query)) {
                    found = true;
                    searchResults.add(book);
                }
            }

            //store the results in arraylist, search through arraylist as well
            if (found) {
                System.out.println("Found Book:");

                System.out.println("BOOK_ID | NAME | AUTHOR | GENRE | AVAILABLE");
                for (Book book : searchResults) {
                    System.out.println(book.getBookId() + "|" + book.getTitle() + "|" + book.getAuthor() + "|" + book.getGenre() + "|" + book.isAvailable());
                }

            } else {
                System.out.println("No Results Found!");
            }


            int inp;

            while (true) {
                System.out.println("press 1 to close or 2 to search again");

                try {
                    inp = scanner.nextInt();
                    scanner.nextLine();

                    if (inp == 1 || inp == 2) {
                        break;
                    } else {
                        System.out.println("please enter 1 or 2");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a Integer number 1 or 2");
                    scanner.nextLine();
                }
            }

            found = false;
            searchResults.clear();

            if (inp == 1) {
                System.out.println("Closing search...");
                break; // outer loop exit1
            }
        }
    }

    private static void deleteBook(ArrayList<Book> bookArrayList, HashMap<String, Book> bookHashMap, Scanner scanner) {

        String ID;
        String path = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Books.csv";

        while (true) {


            viewBook(bookArrayList);

            System.out.println("Enter the book ID that you want to delete...");

            while (true) {

                try {
                    ID = scanner.nextLine().trim();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter ID correctly");
                }
            }

            Book book = bookHashMap.get(ID);

            if (book != null) {
                System.out.println("Found: ");
                System.out.println("BOOK_ID | NAME | AUTHOR | GENRE | AVAILABLE");
                System.out.println(book.getBookId() + "|" + book.getTitle() + "|" + book.getAuthor() + "|" + book.getGenre() + "|" + book.isAvailable());

                System.out.println("Confirm by typing 1 or 0 to select again.");
                int inp;

                while (true) {
                    try {
                        inp = scanner.nextInt();
                        scanner.nextLine();

                        if (inp == 1 || inp == 0) {
                            break;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Enter correct Integer Number 1 or 0");
                    }
                }

                if (inp == 1) {

                    bookArrayList.remove(book);
                    bookHashMap.remove(book.getBookId());
//                    deleteLineFromCSV(bookArrayList, path);

                    System.out.println("Book has been deleted successfully!");
                    break;
                }
            }
        }
    }

    private static Member signIn(HashMap<String, Member> user, Scanner scanner) {

        Member found;

        while (true) {

            System.out.println("Enter your username: ");
            String username = scanner.nextLine().trim();

            System.out.println("Enter your password: ");
            String pw = scanner.nextLine().trim();

            found = user.get(username);

            if (found == null) {
                System.out.println("User not found");
            } else if (found.getPassword().equals(pw)) {
                System.out.println("Your Identity is confirmed " + found.getName());
                return found;
            } else {
                System.out.println("Wrong Password");
            }
        }
    }

    private static Member signUp(HashMap<String, Member> user, Scanner scanner) {
        Member newMember;
        String email1;
        String email2;

        while (true) {

            try {

                System.out.println("Enter your Name: ");
                String name = scanner.nextLine().trim();

                System.out.println("Enter your Date of Birth ff:(yyyy-mm-dd): ");
                LocalDate dob = LocalDate.parse(scanner.nextLine().trim());

                while (true) {

                    System.out.println("Enter your email: ");
                    email1 = scanner.nextLine().trim();

                    System.out.println("confirm again your email: ");
                    email2 = scanner.nextLine().trim();

                    if (!Objects.equals(email1, email2)) {
                        System.out.println("Both emails does not match");
                        continue;
                    }
                    break;
                }

                System.out.println("Enter your password:");
                String pw = scanner.nextLine().trim();

                int sizeOfDate = user.size();
                String size = String.format("%03d", ++sizeOfDate);
                String id = "U" + size;

                System.out.println("so the id generated here is : " + id);

                //this will crate a new user object + also will make an entry into the csv
                newMember = new Member(id, name, email1, dob, pw, 0);
                user.put(id, newMember);

//                writeIntoUsersCSV(newMember);
                FileManager.saveMembersHashmap(user);
                return newMember;

            } catch (InputMismatchException e) {
                System.out.println("Enter correct Data");
                System.out.println(e.getMessage());
            }
        }
    }

//    private static <T extends CSVWritable> void deleteLineFromCSV(ArrayList<T> arrayListToUpdate, String path) {
//
//        //<T extends CSVWritable> means = T is of any type which implements CSVWritable
//        //we will delete the line from that will have the id given from params
//
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
//
//            for (T book : arrayListToUpdate) {
//                bufferedWriter.write(book.toCSV());
//                bufferedWriter.newLine(); //new line
//            }
//
//        } catch (IOException e) {
//            System.out.println("IO Exception encountered while reading the books csv file to delete a line.");
//        }
//    }
//
//    private static void loadUsersCSV(HashMap<String, Member> user, ArrayList<Member> memberArrayList) {
//
//        String line;
//        Member storeMember;
//        String filePath = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Users.csv";
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
//
//            //skip the first line for headings
//            bufferedReader.readLine();
//
//            //loop and add till there are line != null
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] userArray = line.split(",");
//
//                String username = userArray[0];
//                String name = userArray[1];
//                String email = userArray[2];
//                LocalDate dob = LocalDate.parse(userArray[3]);
//                String password = userArray[4];
//                int issueBooks = Integer.parseInt(userArray[5]);
//
//                storeMember = new Member(username, name, email, dob, password, issueBooks);
//                user.put(username, storeMember);
//                memberArrayList.add(storeMember);
//
//            }
//
//        } catch (IOException e) {
//            System.out.println("Got a IO Exception " + e.getMessage());
//        }
//
//    }
//
//    private static void writeIntoUsersCSV(Member newMember) {
//
//        String path = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Users.csv";
//        try (FileWriter fileWriter = new FileWriter(path, true)) {
//
//            fileWriter.write("\n");
//            fileWriter.write(newMember.getUsername() + "," + newMember.getName() + "," + newMember.getEmail() + "," + newMember.getDob() + "," + newMember.getPassword() + "," + newMember.getIssueBooks());
//            System.out.println("Profile Saved in database!");
//
//        } catch (IOException e) {
//
//            System.out.println("IO Exception occurred" + e.getMessage());
//        }
//    }
//
//    private static void loadBooksCSV(HashMap<String, Book> bookHashMap, ArrayList<Book> bookArrayList) {
//        String path = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Books.csv";
//        String line;
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//
//            //skipping the first line
////            bufferedReader.readLine(); (not needed)
//
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] data = line.split(",");
//
//                String bookId = data[0];
//                String title = data[1];
//                String author = data[2];
//                String genre = data[3];
//                boolean available = Boolean.parseBoolean(data[4]);
//
//                //creating new Book object
//                Book book = new Book(bookId, title, author, genre, available);
//                bookHashMap.put(bookId, book);
//                bookArrayList.add(book);
//            }
//
//        } catch (IOException e) {
//            System.out.println("Runtime exception IO occurred " + e.getMessage());
//        }
//    }
//
//    private static void writeIntoBooksCSV(Book newBookAddition) {
//        String path = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Books.csv";
//
//        try (FileWriter fileWriter = new FileWriter(path, true)) {
//
//            fileWriter.write("\n");
//            fileWriter.write(newBookAddition.getBookId() + "," + newBookAddition.getTitle() + "," + newBookAddition.getAuthor() + "," + newBookAddition.getGenre() + "," + newBookAddition.isAvailable());
//            System.out.println("Book saved in Database!");
//
//        } catch (IOException e) {
//            System.out.println("IO Exception while writing into books csv " + e.getMessage());
//        }
//    }
}