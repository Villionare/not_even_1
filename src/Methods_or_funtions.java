public class Methods_or_funtions {

    static String str_fun() {
        return "this is a string function";
    }

    public static void main(String[] args) {
        Methods_or_funtions obj1 = new Methods_or_funtions();
        obj1.fun1();
        System.out.println(str_fun());
    }

    void fun1() {
        System.out.println("This is a new function");
    }
}
