package about_date.deprecated;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/5/8 - 22:43
 * @apiNote 三天打鱼两天晒网问题
 */
public class FishTest {
    public static void main(String[] args) throws ParseException {
        //起始日
        String dt1 = "1990-01-01";
        //结束日
        String dt2 = "2022-05-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        Date begin = sdf.parse(dt1);
        Date last = sdf.parse(dt2);
        //计算时间差
        System.out.println("开始到结束的总天数:"+(last.getTime() - begin.getTime())/(1000*60*60*24)+1);
        //1 2 3打鱼 4 0晒网
        System.out.println(118151 % 5);

    }
}
