package FILM.Inhertance;

public class C extends B {
    int age3 = 25;
    String name3 = "Me";

    public C() {
        System.out.println("C constructor executed");
    }

    void display3() {
        System.out.println("this is " + name3 + " of age " + age3);
    }

    void check() {
        System.out.println("this is from C check");
    }
}
