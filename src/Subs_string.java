import java.util.Scanner;

public class Subs_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        subsstring is a method used to sperate a part of a string
        String ss = "this is a string and now i am going to perform the substring method";

        System.out.println("Enter your EmailID:");
        String email = scanner.nextLine();

        if (email.contains("@")) {
            System.out.printf("Hello, %s", email.substring(0, email.indexOf("@")));
        } else {
            System.out.println("an email id must contain @ in it");
        }
//        System.out.println(ss.substring(1,8));
        scanner.close();
    }
}
