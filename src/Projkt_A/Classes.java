package Projkt_A;

//this is a not public, top-level-class
class Car {
    int year;
    String name;

    public String carStatus(){
        return name + " of "+ year + " is running...";
    }
}

//types of classes in java:
//  1 - Concrete Classes = the basic class, a regular One. Default

//  2 - Abstract Class = class with abstract keyword and functions, can't be instantiated.

//  3 - Final Class = declared using final keyword and there can't be extended and subclassed, but we still can create an object of it onto some other class.
final class DragonMen{
    String name = "dragon First";
    long age = 345;

    DragonMen(){
        System.out.println("Name is: " + name + " and age is " + age);
    }
}

//  4 - Inner Class = Classes defined within another class, there are 4 types
        // 1 - Nested Inner Class
        // 2 - Method Local Inner class
        // 3 - Anonymous Inner Class
        // 4 - Static Nested Class


public class Classes {
    String className;
    int temp;

    public static void main(String[] args) {
        //JUST PRACTISE - (non-public) top-level classes.
        //these are the classes that are defined in the same file but not inside the main public class
        Car car = new Car();
        car.name = "Maruti Suzuki";
        car.year = 2025;
        System.out.println(car.carStatus());

        //FINAL CLASS EXAMPLE
        DragonMen dragonMen = new DragonMen();
    }
}