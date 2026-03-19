package series.AbstractClasses;

public class Main extends AbstractClass {

    static void main() {
        Main m = new Main();
        m.start();
        m.func();
    }

    @Override
    void start() {
        System.out.println("The start method is implemented");
    }
}
