public class Static_keyword {

    static int a;
    static String str = "this is a string";

    Static_keyword() {
        System.out.println("this is a constructor");
        a++;
    }

    static void ab(int a, String b) {
        System.out.println("this is a function" + a + b);
    }

    public static void main(String[] args) {

        TempClass obj1 = new TempClass(a);

        System.out.println(Static_keyword.a); //static keyword can be accesses directly through writing the class name
//        System.out.println(object.str);
    }
};