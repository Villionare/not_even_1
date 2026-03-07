package series;

public class ObjectCreation {

    ObjectCreation() {
        System.out.println("this is a constructor!");
    }

    public static void main(String[] args) {
        //in java creation of objects is a two step process
        //1. you declare a Class type variable that can hold the
        // reference to the new object of the class type
        //Class obj
        //2. then you actually create an object using new keyword
        //obj = new Class();

        //the new operator dynamically allocates memory for the new object
        //and return reference to it, that reference will be passed to the
        //variable that we declared in the 1st steps
    }
}
