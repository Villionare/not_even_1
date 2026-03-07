package series;

public class StaticVars {
    public static void main(String[] args) {

        String neatt = new String("new game is on");

        Classes obj3 = new Classes();

        Classes.main(new String[]{"this", "is", "Power"});
        Classes.start(0);

        obj3.fun();
        System.out.println(obj3.name);
        System.out.println(Classes.gen);
    }
}