package series;

public class VarArgs {


    //there is a situation when there are variable numbers of arguments that are being passed
    //to a method so in that situation we use varagrs (...)

    static void main() {

        //this is the old legacy method in which an array is passed as arguments then
        //accessed inside

        String[] arg = {"this", "is", "agrs"};
        legacyVarArgs(arg);

        newVarArgs("this", "is", "what", "you", "ask");
        newVarArgs(1, new int[]{3});
        newVarArgs(new int[]{1, 2, 3, 4});
        newVarArgs(true, false, true, true);

    }

    static void legacyVarArgs(String[] args) {
        System.out.println("Length of args: " + args.length);

        for (String x : args) {
            System.out.println(x);
        }
    }

    static void newVarArgs(String... v) {
        System.out.println("Length of args: " + v.length);

        for (String x : v) {
            System.out.println(x);
        }
    }

    static void newVarArgs(boolean... v) {
        System.out.println("Length of args: " + v.length);

        for (boolean x : v) {
            System.out.println(x);
        }
    }

    static void newVarArgs(int... v) {
        System.out.println("Length of args: " + v.length);

        for (int x : v) {
            System.out.println(x);
        }
    }

    static void newVarArgs(int p, int... v) {
        System.out.println("1st Argument: " + p);
        System.out.println("Length of args: " + v.length);

        for (int x : v) {
            System.out.println(x);
        }
    }
}
