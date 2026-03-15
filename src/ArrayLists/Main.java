package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //ArrayLists in java
        ArrayList<String> al = new ArrayList<>();
        al.add("this");
        al.add("is");
        al.add("a");
        al.add("car");

//        al.remove(2);
        al.set(3, "dinosaur");
        System.out.println(al.size());
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        for (String e : al){
            System.out.println(e);
        }
    }
}
