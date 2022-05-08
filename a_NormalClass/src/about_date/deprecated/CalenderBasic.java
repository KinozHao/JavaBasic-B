package about_date.deprecated;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;


/**
 * @author kinoz
 * @Date 2022/5/8 - 19:07
 * @apiNote Calender类的使用
 * 缺点 具有可变性
 */
public class CalenderBasic{
    @Test
    public void instance_Method(){
        //实例化
        Calendar mycalendar = Calendar.getInstance();
        //查看Calendar的实例类
        System.out.println(mycalendar.getClass());
        //获取当前时间
        System.out.println(mycalendar.getTime());

        //get方法
        int days = mycalendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("今天是当月的第:"+days+"天");
        int days2 = mycalendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是今年的第:"+days2+"天");

        //set方法
        //指定当前时间为今年的几天
        mycalendar.set(Calendar.DAY_OF_YEAR,1);
        days2 = mycalendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是今年的第:"+days2+"天");

        //add方法
        //把当前时间往前增加指定天
        mycalendar.add(Calendar.DAY_OF_YEAR,3);
        days2 = mycalendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是今年的第:"+days2+"天");
    }
    @Test
    public void format_Parse(){
        Calendar CDR = Calendar.getInstance();
        //格式化 日历类-->时间类
        System.out.println(CDR.getTime());
        //解析 时间类-->日历类
        Date date = new Date();
        CDR.setTime(date);
        System.out.println("今年的第:"+CDR.get(Calendar.DAY_OF_YEAR)+"天");

    }

}
