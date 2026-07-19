package FILM;

public class ForCheck {
    static void main() {
        boolean stop = false;

        for (int i = 0; !stop; i++) {
            if (i == 10000000) {
                stop = true;
            }
            System.out.println(i);
        }
    }
}
