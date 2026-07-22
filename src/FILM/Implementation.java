package FILM;

public class Implementation implements MovingAbility {
    static void main() {
        Implementation implementation = new Implementation();

        System.out.println(implementation.square(5));
    }

    @Override
    public void star() {
        System.out.println("this is good");
    }
}