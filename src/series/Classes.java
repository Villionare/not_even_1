package series;

import java.util.Arrays;

public class Classes {
    static int gen = 5;
    String name = "bilaspur";
    int age = 999;
    float height;
    boolean male;

    public static void main(String[] args) {
        System.out.println("this is what we are getting from args: " + Arrays.toString(args));
        Classes obj = new Classes();
        obj.age = 78;
        System.out.println(obj.age);
        gen = 99;
        System.out.println(gen);
        start(354);
    }

    static public void start(int getVal) {
        System.out.println("this is a private function" + getVal);
        Classes obj2 = new Classes();
        obj2.age = 1;
        System.out.println("this is a private function" + obj2.age + " " + gen);
    }

    void fun() {
        System.out.println("this is not a static function");
    }
}