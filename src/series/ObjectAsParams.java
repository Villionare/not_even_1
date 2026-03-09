package series;

class Test {
    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test obj) {
        return (obj.a == a && obj.b == b);
    }
}

public class ObjectAsParams {
    static void main() {
        Test o = new Test(100, 22);
        Test m = new Test(100, 22);
        Test n = new Test(-1, -1);

        System.out.println(o.equalTo(m));
        System.out.println(m.equalTo(n));
    }
}
