package about_date.fresh;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author kinoz
 * @Date 2022/5/8 - 21:55
 * @apiNote DateTimeFormatter类的使用 SDF's plus version
 * 要用于解析时间
 */
public class DTFBasic {
    @Test
    public void normalUs(){
        DateTimeFormatter ter3 = DateTimeFormatter.ofPattern("GGG:yyyy-MM-dd HH:mm:ss");
        //格式化
        String str_time = ter3.format(LocalDateTime.now());
        System.out.println(str_time);

        //解析
        System.out.println(ter3.parse("公元:2022-05-08 10:26:31"));

    }
    @Test
    public void standardInstance(){
        DateTimeFormatter ter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化 日期-->字符串
        String strtime = ter.format(LocalDateTime.now());
        System.out.println("日期格式:"+LocalDateTime.now());
        System.out.println("字符串格式:"+strtime);

        //解析 字符串-->日期
        System.out.println(ter.parse("2022-05-08T22:03:13.091247400"));

    }
    @Test
    public void InstanceII() {
        //jdk9往后需添加withZone(ZoneId.systemDefault())
        //Style有四种 SHORT MEDIUM LONG FULL

        //格式化
        DateTimeFormatter ter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(ZoneId.of("Asia/Shanghai"));
        String strsj = ter2.format(LocalDateTime.now());
        System.out.println(strsj);

        //解析
        System.out.println(ter2.parse("2022年5月8日 下午10:19:41"));
    }
}
