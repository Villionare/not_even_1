import java.util.*;

public class Pythagores_theorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double perpendicular;
        double base;
        double hypotenuse;

        System.out.println("Enter the perpendicular: ");
        perpendicular = scanner.nextDouble();

        System.out.println("Enter the Base: ");
        base = scanner.nextDouble();

        hypotenuse = Math.pow(perpendicular, 2) + Math.pow(base, 2);

        System.out.println("So, the Hypotenuse is: " + Math.sqrt(hypotenuse));

        scanner.close();
    }
}
