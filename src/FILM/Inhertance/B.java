package FILM.Inhertance;

public class B extends A {
    int age2 = 60;
    String name2 = "Father";

    public B() {
        super.testingOut = "this is good";
        System.out.println("B constructor executed");
    }

    void display2() {
        System.out.println("this is " + name2 + " of age " + age2);
    }

    void check() {
        System.out.println("this is from B check");
    }
}
