package FILM;

public class TypeCasting {
    static void main(String[] args) {

        //PRIMITIVES

        //integer type values
        byte c = 1;
        short b = 53;
        int a = 2;
        long ll = 4356346357L;

        //Floating Values
        float fp = 3.6546F;
        double dp = 4.56262623463654;

        //character datatype
        char cc = 'D', nb = 65;

        //boolean
        boolean ck = true;

        int check = c; //byte to int - implicit casting
        int check2 = b; //short to int - implicit casting
        int check3 = a; //int to int - implicit casting
        int check4 = (int) ll; //long to int - explicit casting

        double dd1 = dp; //double to double - implicit casting

        var jss = 64643654634L;

        int now = (int) jss;
        System.out.println(now);
    }
}
