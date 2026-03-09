package series;

class Over {
    void test() {
        System.out.println("with no args");
    }

    void test(int a, int b) {
        System.out.println("with int a and b args" + a + " " + b);
    }

    void test(double a) {
        System.out.println("with double a arg" + a);
    }
}

public class Overloading {
    static void main() {
        Over over = new Over();

        over.test();
        over.test(33);
        over.test(34, 535);
    }
}
