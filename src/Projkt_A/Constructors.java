package Projkt_A;

import ZERO.Strings;

public class Constructors {
    int va1, val2;
    String name = "";

    //PARAMETERS DO NOT HAVE RETURN TYPE
    //three types of constructors
//    1 - Default Projkt_A.Constructors = just default like not creating one, just with the 'new' keyword
//    2 - No Arg Projkt_A.Constructors = defined but without any parameters
//    3 - Parameterized Projkt_A.Constructors = defined with parameters

    Constructors(){
        this("dragon");  //this keyword calls the other constructor form same class
        name = "nanna";
        System.out.println("this is just a basic constructor, name " + name);
    }

    Constructors(String a){
        this("yurama", 99);  //this keyword calls the other constructor form same class, based on the parameters
        this.name = a;
        System.out.println("this one is the parameterized constructors, name " + name);
    }

    Constructors(String a, int b){
        this.name = a;
        System.out.println("int" + b + "name" + name);
    }

    void fun(){
        System.out.println("this is just a basic function");
    }

    public static void main(String[] args) {
        Constructors obj1 = new Constructors();
        obj1.fun();

        //super keyword is the same as this, but it calls the parent constructor
    }
}
