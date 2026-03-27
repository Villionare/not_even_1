package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    static void main() throws FileNotFoundException {

        try {
            FileReader fileReader = new FileReader("nn.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File nahi mili");
        }
    }
}