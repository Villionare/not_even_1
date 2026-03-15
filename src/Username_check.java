import java.util.*;

public class Username_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name_inp;

        System.out.println("Enter your username:");
        name_inp = scanner.nextLine();

        //rules:
        //username must be in 4-12 range
        //username must not conatain any spaces and underscores

        int inp_length = name_inp.length();

        if (4 <= inp_length && inp_length <= 12) {
            if (name_inp.contains(" ")) {
                System.out.println("The username should not contain any spaces");
            } else {
                if (name_inp.contains("_")) {
                    System.out.println("username should not contain any userscores ( _ )");
                } else {
                    System.out.println("Congrats you have created your unique user id");
                }
            }
        } else {
            System.out.println("the username must be in the range of 4-12");
        }
        scanner.close();
    }
}
