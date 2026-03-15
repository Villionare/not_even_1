package FileHanding;

import java.io.*;

///Key Classes for File Handling
//- File – Represents a file or directory.
//- FileWriter – Writes text to a file.
//- FileReader – Reads text from a file.
//- BufferedReader – Reads text efficiently.
//- BufferedWriter – Writes text efficiently.
//- PrintWriter – Writes formatted text.
//- FileOutputStream / FileInputStream – Works with binary data.

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\home4\\Intelli_java\\runn\\src\\FileHanding\\file1.txt";
        String textContent = """
                this is the content that will go inside of the 
                text file.
                """;

        try(FileWriter f1 = new FileWriter(filePath)){
            System.out.println("file created!!!");
            f1.write(textContent);
            System.out.println("file has been written!!!");
            }catch (FileNotFoundException e){
            System.out.println("File is not found " + e);
            } catch (IOException e){
            System.out.println("could not create the file " + e);
        }

        //file reader
        //so for this we will be combining the BufferedReader and FileReader

        String readPath = "C:\\Users\\home4\\Intelli_java\\runn\\src\\FileHanding\\file1.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(readPath))){
            System.out.println("file found");
            String Line;

            while ((Line = reader.readLine()) != null){
                System.out.println(Line);
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}
