package Inheritance;

public class ParentClass {
    int super_var = 45;
    boolean super_class = true;

    ParentClass(String val) {
        System.out.println("this is a constructor from Parent Classes called from\n" +
                "AnotherSubclass constructor with value: " + val +
                " called using super keyword");
    }

    void parentClass() {
        System.out.println("this is form the parent class");
    }

    void fun() {
        System.out.println("this is a method from the parent class.");
    }
}
