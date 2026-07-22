package FILM;

import FILM.Inhertance.A;
import FILM.Inhertance.B;
import FILM.Inhertance.C;

public class TypeInference {

    //this is all about the 'var'
    //var uses the declared type of the expression on the right-hand side to determine the variable's type.
    //VAR IS RESOLVED AT COMPILE TIME


    static void main() {

        Object j = new Object();
        System.out.println("class: " + j.getClass());
        System.out.println("class: " + j.toString());
        System.out.println("printing object: " + j);

        var a = 10; //we know that var will become int

        A c = new C(); //here the reference variable type is A and actual object is of C;
        var k = c; //here the value of var will be A, JAVA only looks at the variable's declared type.

        var n = new C(); //here the value of var will be C

        var ab = getAnimal();

        //var always copies the reference variable's declared type, not the runtime object's type.
    }

    static A getAnimal() {
        if (Math.random() > 0.5)
            return new B();
        else
            return new C();
    }

}
