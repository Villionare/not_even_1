package FILM;

public interface MovingAbility {
    String canMove = "yes it can move";
    int speed = 34;

    static void check() {
        System.out.println("this is just for checking static method");
    }

    void star();

    default double square(int i) {
        return i * i;
    }
}