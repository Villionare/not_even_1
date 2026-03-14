package series;

class Demo1 {
    //this is to demonstrate that we can return an object as well.

    int val = 55;

    Demo1 returnn() {
        Demo1 demo1 = new Demo1();
        return demo1;
    }

}

public class ReturnAnObject {
    static void main() {

        Demo1 oo = new Demo1();
        Demo1 start = oo.returnn();

        start.val = 100;

        System.out.println("this is the changed values: " + start.val);
    }
}
