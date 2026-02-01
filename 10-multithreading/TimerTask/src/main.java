import java.util.Timer;
import java.util.TimerTask;

public class main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Zadatak izvrsen!");
            }
        };
        //timer.schedule(task, 3000);
        timer.schedule(task, 0, 1000);
    }
}
