import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Seconds to count from:");
        int sec = scanner.nextInt();

        TimerTask task = new TimerTask() {
            int count = sec;

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if (count < 0) {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
        scanner.close();
    }
}