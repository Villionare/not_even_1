package Inheritance;

public interface firstOne {
    void thisOne();

    default void normalFun() {
        System.out.println("this is normal one");
    }

    default void defaultFun() {
        System.out.println("this is the default function that we can work with.");
    }
}