package Projects.Intermediate.LibraryManagementSystem_advanced;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialization {
    static void main() {

        Book newBook = new Book("UUU", "NEO", "AUU", "GONAR", true);

        try {

            //FileOutputStream open the file in write mode, we can make changes.
            FileOutputStream fileOutputStream = new FileOutputStream("src/Projects/Intermediate/LibraryManagementSystem_advanced/storage/serial.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(newBook);

            String res = "Object saved in file.";
            System.out.println(res);

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
