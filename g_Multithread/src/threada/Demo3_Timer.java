package threada;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {

        public static void main(String[] args) throws InterruptedException {
            Timer t =new Timer();
            t.schedule(new TimerStik(),new Date(2019,4,20,18,57,10),2000);
        while(true){
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}
class TimerStik extends TimerTask {

    @Override
    public void run() {
        System.out.println("You should Learn English");
    }
}
