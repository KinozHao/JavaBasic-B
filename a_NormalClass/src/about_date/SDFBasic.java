package about_date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/5/7 - 22:45
 * @apiNote SimpleDateFormal类的使用
 */
public class SDFBasic {
    @Test
    public void test1() throws ParseException {
        //默认构造器 只能使用默认提供的格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date dt = new Date();
        //解格式date原本数据
        System.out.println(sdf.format(dt));

        //解析回Date原本的格式
        Date dt2 = sdf.parse("2022/5/7 下午10:49");
        System.out.println(dt2);
    }

    @Test
    public void test2() throws ParseException {
        //默认构造器 只能使用默认提供的格式
        SimpleDateFormat sdf = new SimpleDateFormat("GG yyyy-MM-dd hh:mm:ss");
        Date dt = new Date();
        //格式化dt到我们自定义格式
        System.out.println(sdf.format(dt));

        //解析回Date原本的格式(parse里数据必须和我们自定义格式相同)
        //否则报ParseException
        Date dt2 = sdf.parse("公元 2022-05-07 10:53:29");
        System.out.println(dt2);
    }
}
