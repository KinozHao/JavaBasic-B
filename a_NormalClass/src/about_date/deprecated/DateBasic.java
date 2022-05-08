package about_date.deprecated;

import org.junit.Test;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
/**
 * @author kinoz
 * @Date 2022/5/4 - 20:58
 * @apiNote Date类的使用
 * 缺点 已过时 存在偏移量问题
 */
public class DateBasic {
    @Test
    public void currentTime_Method(){
        //返回当前时间(纳秒数)
        long i = System.currentTimeMillis();
        System.out.println(i);
        //转换为日期格式
        Date date1 = new Date(i);
        System.out.println(date1);
    }

    @Test
    public void utilDateMethod(){
        //1.空参构造器 返回当前时间
        Date date = new Date();
        System.out.println(date);
        //获取当前对象纳秒数，时间戳
        System.out.println(date.getTime());

        //2.有参构造器 返回指定时间(存在偏移量问题)
        @Deprecated
        Date date1 = new Date(1990,4,4);
        System.out.println(date1);

        //与sql包下Date的转换
        Date date2 = new Date(33232323223L);
        //把纳米数通过getTime方法转换为常规日期，复制给sql的Date
        java.sql.Date sqldate = new java.sql.Date(date2.getTime());
        System.out.println(sqldate);
    }
}
