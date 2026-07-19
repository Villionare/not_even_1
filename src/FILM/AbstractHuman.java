package FILM;

abstract class AbstractHuman {

    String name = "unknown";
    int age = 0;

    //abstract methods can have constructors too
    AbstractHuman() {
        System.out.println("this is the constructor called");
    }

    //default method
    void identity() {
        System.out.println("this is the person " + name + " and with the age of " + age);
    }

    //abstract method
    abstract void justDoIT();

}
