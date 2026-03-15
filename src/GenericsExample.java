class A {
    A fun() {

        return this;
    }
}

class B extends A {

    @Override
    B fun() {

        return this;
    }
}

public class GenericsExample<T, U> {
    public T a;
    public U b;

    GenericsExample(T a, U b) {
        this.a = a;
        this.b = b;
    }

    void show() {
        System.out.println(this.a + " " + this.b);
    }
}
