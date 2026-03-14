package series.AccessModifiers.Package1;

import static series.AccessModifiers.Package1.Main.*;

public class Another {
    static void main() {
        Main main = new Main();
        System.out.println(variable_protected);
        System.out.println(variable_public);
        System.out.println(variable_default);
    }
}
