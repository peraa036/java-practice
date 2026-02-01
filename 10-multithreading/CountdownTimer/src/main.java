import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        final int[] time ={10};

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if(time[0] > 0){
                    System.out.println(time[0]);
                    time[0]--;
                } else {
                    System.out.println("Srecna Nova Godina!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}
