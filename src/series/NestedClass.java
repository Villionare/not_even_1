package series;

//A class declared inside another class is nested class.
//two types of nested classes
//Static Nested Class and Inner Class.

public class NestedClass {

    static void main() {

        //Inner class obj creation
        NestedClass obj = new NestedClass();
        NestedClass.NormalOne obj1 = obj.new NormalOne();
        obj1.display();

        //Nested Static class object creation
        NestedClass.StaticClass obj2 = new NestedClass.StaticClass();
        obj2.display();
    }

    void ObjCreation() {
        StaticClass staticClass = new StaticClass();
    }

    //1. static nested class
    static class StaticClass {
        int x = 65;

        void display() {
            System.out.println("this is from the static One");
        }
    }

    class NormalOne {
        int x = 54;

        void display() {
            System.out.println("this is from the Normal One");
        }
    }
}