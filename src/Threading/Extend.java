package Threading;


//threading is getting done by extending to Thread and then using its object in here

public class Extend {

    public static void main(String[] args) {
        Another an =  new Another();
        an.start();
        System.out.println("this is the main thread");
    }
}