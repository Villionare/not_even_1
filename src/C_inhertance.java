public class C_inhertance extends B_inhertance {
    int a = 12;
    String ab = "this is from c class";

    C_inhertance() {
        System.out.println("this is a a class constructor");
    }

    public static void main(String[] args) {
        A_inhertance a_obj = new A_inhertance();
        System.out.println(a_obj.ab + " " + a_obj.a);
    }
}
