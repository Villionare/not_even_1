public class Super_keyword extends A_inhertance {
    int a = super.a;

    Super_keyword(String str) {
        super();
        System.out.println("constructor called");
        System.out.println(a);
    }

    public static void main(String[] args) {
        Super_keyword obj = new Super_keyword("abhay");
        obj.fun();
    }

    void fun() {
        super.fun();
        System.out.println("this is fun from super class");
    }
}
