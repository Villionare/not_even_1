package Access_modifiers;

public class P3 {
//this is for private access use

    private P3() {
    }

    ;

    public static void main(String[] args) {
        P3 oo = new P3();
        oo.fun();
    }

    private void fun() {
        System.out.println("this is a private function");
    }
}