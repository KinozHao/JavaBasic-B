package about_date;

import org.junit.Test;

import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/5/4 - 20:58
 * @apiNote Date类的使用
 */
public class DateBasic {
    @Test
    public void utilDateMethod(){
        //1.空参构造器 返回当前时间
        Date date = new Date();
        System.out.println(date.toString());
        //获取当前对象纳秒数，时间戳
        System.out.println(date.getTime());

        //2.有参构造器 返回指定时间
        @Deprecated
        Date date1 = new Date(1990,3,4,13,22);

        //与sql包下Date的转换
        Date date2 = new Date(33232323223L);
        //把纳米数通过getTime方法转换为常规日期，复制给sql的Date
        java.sql.Date date3 = new java.sql.Date(date2.getTime());
        System.out.println(date3);
    }
}
