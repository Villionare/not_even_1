import java.util.Scanner;

public class Variable_arguments {
    static int var_fun(int... arr) {
        //so we have created an array arr of integers in the arguments section and all the paramenters we will give to the fuction  while calling will be stored in it,
        for (int a : arr) {
            System.out.println(a);
        }

        return 0;
    }

    ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var_fun(1, 2, 3, 4, 5, 6, 7, 8, 9);
        scanner.close();
    }
}
