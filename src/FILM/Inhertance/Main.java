package FILM.Inhertance;

public class Main {
    static void main() {
        var a = new A();
        var b = new B();
        var c = new C();

        A r;

        r = a;
        r.check();

        r = b;
        r.check();

        r = c;
        r.check();
    }
}