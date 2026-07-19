package FILM.Inhertance;

public class A {
    int age = 90;
    String name = "Grandpa";

    String testingOut;

    public A() {
        System.out.println("A constructor executed");
    }

    void display() {
        System.out.println("this is " + name + " of age " + age);
    }

    void check() {
        System.out.println("this is from A check");
    }
}