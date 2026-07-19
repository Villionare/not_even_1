package FILM;


public class Recursion {
    static void main() {
        

//      printing(i);
//        System.out.println(sum(10));
//        System.out.println(factorial(3));
        System.out.println(exponential(2, 3));
    }

    //printing numbers
    static void printing(int i) {
        //base condition
        if (i > 10) {
            return;
        }
        System.out.println(i);
        i++;
        printing(i);
    }

    //sum of first n numbers
    static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);

    }

    //factorial
    private static int factorial(int n) {

        //base condition
        if (n <= 1) {
            return 1;
        }

        //recursive condition
        return n * factorial(n - 1);
    }

    //power of 2
    private static int exponential(int base, int power) {
        if (power == 0) {
            return 1;
        }

        return base * exponential(base, power - 1);
    }
}
