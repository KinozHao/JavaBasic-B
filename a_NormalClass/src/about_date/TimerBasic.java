package about_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
 * @author kinoz
 * @Date 2022/4/26 - 21:18
 * @apiNote Timer相当一个计时器
 * 可以通过继承TimerTask类来指定某一时间做指定要输出的内容
 */

class TimerBasic extends TimerTask {
    @Override
    public void run() {
        System.out.println("You should Learn English");
    }

    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();

        t.schedule(new TimerBasic(),new Date(2018,Calendar.FEBRUARY,22,18,25),1000);
        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}
