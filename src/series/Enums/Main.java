package series.Enums;

public class Main {
    static void main() {

        Enum_example eg = Enum_example.MEDIUM;

        System.out.println(eg.ordinal());
        for (Enum_example i : Enum_example.values()) {
            System.out.println(i);
        }

        System.out.println(eg.getDescription());
    }
}
