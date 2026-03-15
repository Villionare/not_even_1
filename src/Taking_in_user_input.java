import java.util.Scanner;

public class Taking_in_user_input {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        //here if we use next() only if will ony read till the spaces
//        System.out.println(str);
//        System.out.println("now write anything");;
//        double thiss = scanner.nextDouble();
//        System.out.println(thiss);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age");
//        int age = scanner.nextInt();
//
//        System.out.println("So, Your name is " + name + " and your age is " + age);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); //-- in case of any error, use this

        System.out.println("Enter your favorite color:");
        String color = scanner.nextLine();
        System.out.println("you are " + age + "years old");
        System.out.println("you like the color " + color);
        scanner.close();
    }
}
