public class AnoynomousClass {
    public static void main(String[] args) {
        AnoynomousClass obj1 = new AnoynomousClass();
        AnoynomousClass obj2 = new AnoynomousClass() {
            @Override
            void fun1() {
                System.out.println("this is from a anonymous class");
            }
        };


        obj1.fun1();
        obj2.fun1();
    }

    void fun1() {
        System.out.println("this is a function");
    }
}
