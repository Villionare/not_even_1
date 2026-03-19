package series;

public class TypeInference extends Object {

    //the compiler automatically figures out the data type by checking the literal type, without you manually
    //writing it. using 'var' keyword

    public static void main(String[] args) {

        var a = "this is"; //string
        var b = false; //boolean
        var c = 5.66f; //float
        var d = 5.66;  //double
        var e = new int[5];

        var f = new String[]{"this is g", "ood and", "awesome", "Buddy"};
        System.out.println(f[1]);

        System.out.println(a.getClass().getName());
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e.getClass().getName());

    }
}