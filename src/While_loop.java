import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ab = "";
        int a;

//        while (ab.isEmpty()){
//            System.out.println("Enter your name:");
//            ab = scanner.nextLine();
//        }

        do {
            System.out.println("Enter a number:");
            a = scanner.nextInt();
        } while (a < 1 || a > 10);

        scanner.close();
    }
}
