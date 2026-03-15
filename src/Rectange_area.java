import java.util.Scanner;

public class Rectange_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L;
        double b;
        double r;

        System.out.println("enter the length and breath of the rectangle");

        System.out.print("Length: ");
        L = scanner.nextDouble();

        System.out.print("Breath: ");
        b = scanner.nextDouble();

        r = L * b;

        System.out.println("So, the area of rectangle is: " + r + "cm²");
        scanner.close();
    }
}
