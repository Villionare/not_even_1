public class Variable_Scope {

    static int ab = 66;

    static void fun1(String fst) {
//        System.out.println("this is function 1");
//        System.out.println(fst);
        System.out.println(ab);
    }

    public static void main(String[] args) {
        String first = "this is a string for first function"; //local variable
        fun1(first);
        System.out.println(ab);
    }
}
