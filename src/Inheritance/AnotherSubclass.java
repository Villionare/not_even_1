package Inheritance;

public class AnotherSubclass extends ParentClass {
    int sub_var = 45;
    boolean sub_class = true;

    //isme ik param create karne main class se values dena hai to the parent class
    AnotherSubclass(String val) {
        super("\"(VALUE FROM ANOTHER_SUBCLASS)\" + FROM MAIN FUNCTION AS WELL: " + val);
    }

    void subClass2() {
        System.out.println("this is form the sub class 2");
        fun();
    }

//    @Override
//    void fun() {
//        System.out.println("now this is over ridden by childclass");
//    }
}