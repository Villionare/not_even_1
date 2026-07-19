package FILM;

public class AbstractClasses extends AbstractHuman {

    static void main() {
        AbstractClasses abstractClasses = new AbstractClasses();

        abstractClasses.name = "Ra.One";
        abstractClasses.age = 1000;

        abstractClasses.identity();
        abstractClasses.justDoIT();
    }

    @Override
    void identity() {
        super.identity();
    }

    @Override
    void justDoIT() {
        System.out.println("this is the implementation of the abstract method");
    }
}
