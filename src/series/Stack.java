package series;

import java.util.Scanner;

public class Stack {
    static void main() {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int index = 0;

        System.out.println("This is a stack program");
        while (run) {

            System.out.print("[ ");
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println("]");

            System.out.println("Choose any OPTIONS from below:");
            System.out.println("1 - push into last\n2 - pop last element\n3 - Quit");
            int inp = scanner.nextInt();

            switch (inp) {
                case 1:
                    System.out.println("Enter an Integer to push:");
                    int push = scanner.nextInt();
                    arr[index] = push;
                    index++;
                    break;
                case 2:
                    arr[index] = 0;
                    index--;
                    System.out.println("pop-ed the last element");
                    break;
                case 3: {
                    run = false;
                    break;
                }
            }
        }

    }
}
