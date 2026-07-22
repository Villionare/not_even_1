package FILM.ExceptionHandling;

//exception handling is done only through these 5 keywords:
//try catch throw throws finally


public class ExceptionHandling {
    static void main() throws RuntimeException {

        int j = 0;

        try {


//            j = 34 / 0;
//            System.out.println("this will not be printed");
            throw new ArithmeticException("not wanted");

        } catch (ArithmeticException e) {
            System.out.println("got an exception " + e.getCause());
//            throw new Dummy(e.getMessage());
//            System.out.println("zero" + e.getMessage());
        }

//        System.out.println("done");
    }

    static void infiniRun(int n) {
        if (n == 10000)
            return;

        System.out.println("how at " + n);
        infiniRun(n + 1);
    }
}
