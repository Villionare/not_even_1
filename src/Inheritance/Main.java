package Inheritance;

public class Main implements firstOne {
    static void main() {

        var obj1 = new AnotherSubclass("VALUE FROM MAIN");
        System.out.println(obj1.sub_class);
        System.out.println(obj1.sub_var);
        System.out.println(obj1.super_class);
        System.out.println(obj1.super_var);
        obj1.subClass2();
        obj1.parentClass();
    }

    @Override
    public void thisOne() {
        System.out.println("this is the mandatory function that was needed to be declared");
    }
}
