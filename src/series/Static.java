package series;

public class Static {

    //these are instance variables.
    int start = 54;
    String alger = "this is how you do it";
    boolean bihari = true;

    static void main() {
        Static static_obj = new Static();

        System.out.println(static_obj.start);
    }
}
