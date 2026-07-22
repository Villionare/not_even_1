package FILM;

public class ForCheck {
    static void main() {
        boolean stop = false;

        AbstractClasses abstractClasses = new AbstractClasses();

        ForCheck ff = new ForCheck();

        System.out.println(ff.getClass());

        for (int i = 0; !stop; i++) {
            if (i == 10) {
                stop = true;
            }
            System.out.println(i);
        }
    }
}
