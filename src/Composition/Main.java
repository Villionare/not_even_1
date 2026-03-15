package Composition;

public class Main {
    public static void main(String[] args) {
        Humanoid  r1 = new Humanoid("TheFirst", "steel", "active1");

        r1.Display();
        System.out.println(r1.core.core_main);
    }
}
