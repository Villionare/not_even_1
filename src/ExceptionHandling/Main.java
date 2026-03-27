package ExceptionHandling;

public class Main {
    int vari = 343;

    public static void main(String[] args) {

        try {

            int[] denominator = {1, 2, 3, 4, 5, 6, 7};
            int[] numerator = {8, 9, 10, 0, 12, 13}; //Arithmetic Exception

            for (int i = 0; i < 10; i++) { //ArrayOutOfBonds Exception
                int result = divide(numerator[i], denominator[i]);
                System.out.println(result);
            }

            Main main = null;
            System.out.println(main.vari); //NullPointerException

            System.out.println("Statement ran even after exceptions, as i handled them.");

        } catch (ArithmeticException e) {
            //(IOException | ArithmeticException e) also multiple exceptions can be thrown in one catch

            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("this is because of division by 0");

        } catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println("this is because of reference 'main' is null");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("this is because of for loop goes beyond the size of arrays");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
        }
    }

    static int divide(int n, int d) {
        return n / d;
    }

    @Override
    public String toString() {
        System.out.println("String has been overridden also");
        return super.toString();
    }

    //there are two types of exceptions
    //checked(compile time) and unchecked(Runtime exceptions) exceptions
    //based on 5 keywords try, catch, finally, throw, throws

    //types of errors
    //syntax errors
    //logical errors
    //Runtime errors - exception handling

    //there is one parent class that is Throwable
    //and Throwable have two sub class - Error and Exception

    //Exception - exceptions that user program generated that are needed to be handled
    //These are problems that your program should catch and deal with
    //Like a speed bump — you can slow down and handle it
    //Examples: File not found, Network issues, Database errors

    //Errors - Serious JVM errors
    //These are serious JVM-level crashes
    //Like a car engine failure — you can't just patch it up
    //Your program should NOT try to catch these
    //Example: StackOverflowError — when your program runs out of memory due to infinite recursion

    //catch (ArithmeticException e) {} this means that e is a reference variable of type ArithmeticException
    //so when error happens the jvm will throw this error object of type ArithmeticException
    //which will later be caught by this 'e' reference variable

    //printStackTrace this is basically prints the stack of errors in series from where it begin.

    //CHECKED AND UNCHECKED EXCEPTIONS
    //when the compiler knows about the possibility of error it comes in checked exceptions
    //and compiler tell us to handle it.

    //when the compiler does not know and the exceptions arise in RunTime it is called Unchecked Exceptions
    //or Runtime Exceptions
}
