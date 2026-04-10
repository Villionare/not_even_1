package Projects.Intermediate.LibraryManagementSystem_advanced;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FileManager {

    private static final String ADMIN_FILE_PATH =
            "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Admin.dat";

    //SAVE
    protected static void saveArrayListBooks(ArrayList<Book> bookArrayList) {
        String FILE = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Books.dat";

        File file = new File(FILE);

        if (!file.exists()) {
            System.out.println("Books.dat not found");
            return;
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {

            objectOutputStream.writeObject(bookArrayList);

        } catch (IOException e) {
            System.out.println("an IO exception happened");
            System.out.println(e.getMessage());
        }
    }

    protected static void saveAdminObject(HashMap<String, Admin> adminHashMap) {
        File file = new File(ADMIN_FILE_PATH);

        // Only needed if the directory might not exist yet
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            if (!parentDir.mkdirs()) {
                System.out.println("Failed to create directory: " + parentDir.getAbsolutePath());
                return; // No point continuing if directory creation failed
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(adminHashMap);
            System.out.println("Admin data saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save admin object: " + e.getMessage());
        }
    }

    protected static void saveMembersHashmap(HashMap<String, Member> user) {
        String FILE = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Members.dat";

        File file = new File(FILE);

        if (!file.exists()) {
            System.out.println("Can't find the Members.dat");
            return;
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {

            objectOutputStream.writeObject(user);

        } catch (IOException e) {
            System.out.println("an IO exception happened");
            System.out.println(e.getMessage());
        }
    }

    //LOAD
    protected static HashMap<String, Admin> loadAdminObject() {
        String FILE = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Admin.dat";

        File file = new File(FILE);

        if (!file.exists()) {
            System.out.println("cant find the Members.dat");
            try {
                boolean res = file.getParentFile().mkdirs(); //this will create all the folders that are missing.
                boolean result = file.createNewFile();
                if (res && result) {
                    System.out.println("Admin.dat created at: " + file.getAbsolutePath());

                }
            } catch (IOException e) {
                System.out.println("Got an IO Exception: " + e.getMessage());
            }

            return new HashMap<>();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE))) {

            return (HashMap<String, Admin>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception has been caught");
        }

        return new HashMap<>();
    }

    protected static HashMap<String, Member> loadMembersHashmap() {
        String FILE = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Members.dat";

        File file = new File(FILE);

        if (!file.exists()) {
            System.out.println("cant find the Members.dat");
            return new HashMap<>();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE))) {

            return (HashMap<String, Member>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("an IO exception happened");
            System.out.println(e.getMessage());
            return new HashMap<>();
        }
    }

    protected static ArrayList<Book> loadArrayListBooks() {
        String FILE = "src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/Books.dat";

        File file = new File(FILE);

        if (!file.exists()) {
            System.out.println("cant find the Members.dat");
            return new ArrayList<>();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE))) {

            return (ArrayList<Book>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("an IO exception happened");
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

}
