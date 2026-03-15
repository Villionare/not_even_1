import java.util.Scanner;

public class Arrays_start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to restorent");
        System.out.print("Enter the no: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        String[] items = new String[no];

        for (int i = 0; i < items.length; i++) {
            items[i] = scanner.nextLine();
        }

        System.out.println("the items that you have entered are:");
        for (String item : items) {
            System.out.println(item);
        }
        scanner.close();
    }
}