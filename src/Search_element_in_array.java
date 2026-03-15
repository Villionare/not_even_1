import java.util.Scanner;

public class Search_element_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of items:");
        int no = scanner.nextInt();
//        scanner.nextInt();  yahan pe iski zarurat nahi hai

        int[] items = new int[no];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter the" + i + "item:");
            items[i] = scanner.nextInt();
        }

        System.out.println("Enter the item you wanna find out");
        int find = scanner.nextInt();
        boolean is_found = false;
        for (int i : items) {
            if (i == find) {
                is_found = true;
                break;
            }
        }
        ;

        if (is_found) {
            System.out.println("item found!");
        } else {
            System.out.println("its not in there!");
        }

        scanner.close();
    }
}
