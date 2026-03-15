public class D_inhertance extends A_inhertance {
    int a = 5;
    String abc = "this is a d class str";

    D_inhertance() {
        System.out.println("this is a d class constructor");
    }

    ;

    public static void main(String[] args) {
        A_inhertance a_obj = new A_inhertance();
        System.out.println(a_obj.ab + " " + a_obj.a);

        B_inhertance b_obj = new B_inhertance();
        System.out.println(b_obj.ab);

        C_inhertance c_obj = new C_inhertance();
        System.out.println(c_obj.ab);
    }
}
