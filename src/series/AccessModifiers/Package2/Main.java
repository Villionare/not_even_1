package series.AccessModifiers.Package2;

import static series.AccessModifiers.Package1.Main.variable_public;

public class Main {
    static void main() {
        series.AccessModifiers.Package1.Main obj1 = new series.AccessModifiers.Package1.Main();

        System.out.println(variable_public);
    }
}
