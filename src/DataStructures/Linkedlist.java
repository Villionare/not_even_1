package DataStructures;
import java.util.LinkedList;

//A LinkedList works like an ArrayList, but it stores elements in a chain.
//It's good when you need to add or remove items often.

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("this");
        ll1.add("is");
        ll1.add("a");
        ll1.add("LinkedList");

        System.out.println(ll1);
    }
}
