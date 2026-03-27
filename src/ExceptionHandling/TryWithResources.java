package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    //basically when we have scenarios like of BufferReader, BufferWriter
    //we need to close those resources too

    static void main() throws CustomFILE_NOT_FOUND {
        System.out.println("try with resources");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("txt.io"))) {
            System.out.println(bufferedReader.readLine());

        } catch (IOException e) {
            throw new CustomFILE_NOT_FOUND("file is nottt found");
        }

        //so the bufferedReader.close() is already done by try with-resources
    }
}