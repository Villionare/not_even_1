package series;

//dynamic method dispatch java ka run time polymorphism me aata hai
//isme java run time me descide karta hai ki method ka konsa version run karna hai
//and vo depend karta hai konse object se call kiya jaa raha hai.
//WORKS IN THE SCENERIO OF INHERITANCE AND OVER RINDING

class A {
    void callThis() {
        System.out.println("this is from class A");
    }
}

class B extends A {
    @Override
    void callThis() {
        System.out.println("this is from class B");
    }
}

class C extends A {
    @Override
    void callThis() {
        System.out.println("this is from class C");
    }
}

public class DynamicMethodDispatch {

    static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; //r is a reference variable of type A
        r = a; //now Object of A class address is on r variable
        r.callThis(); //A class version is called

        r = b; //now object of B class is on r variable
        r.callThis(); //Now B class version is getting called

        r = c; //now r is point to the C class object.
        r.callThis(); //now C class version is getting called
    }
}
