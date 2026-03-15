import java.util.Timer;
import java.util.TimerTask;

public class TimesandTimerTasks {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("this is timer");
            }
        };
        timer.schedule(timerTask, 1000);
    }
}
