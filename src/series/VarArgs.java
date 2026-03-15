package series;

public class VarArgs {


    //there is a situation when there are variable numbers of arguments that are being passed
    //to a method so in that situation we use varagrs

    static void main() {


        //this is the old legacy method in which an array is passed as arguments then
        //accessed inside

        String[] arg = {"this", "is", "agrs"};
        legacyVarArgs(arg);

    }

    static void legacyVarArgs(String[] args) {
        System.out.println("Length of args: " + args.length);

        for (String x : args) {
            System.out.println(x);
        }
    }
}
