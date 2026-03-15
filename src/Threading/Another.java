package Threading;

public class Another extends Thread {
    @Override
    public void run() {
        System.out.println("this is from another thread!");
    }
}
