package FILM.NestedAndInnerClasses;

public class InsideLoop {

    int vv = 34;

    void ClassesCreation() {
        for (int i = 0; i <= 5; i++) {
            class newOne {
                void display() {
                    System.out.println("this is the val: " + vv);
                }
            }

            newOne nn = new newOne();
            nn.display();
        }
    }

}

class MainOne {
    static void main() {
        InsideLoop ii = new InsideLoop();
        ii.ClassesCreation();
    }
}