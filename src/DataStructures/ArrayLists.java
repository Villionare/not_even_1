package DataStructures;
import java.util.ArrayList;

//ArrayLists does not have any defined length, we can add as many as we want
// resizable array that can grow as needed.
// store elements and access them by index.

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("this");
        al1.add("is");
        al1.add("a");
        al1.add("Array List");

        System.out.println(al1);
    }
}
