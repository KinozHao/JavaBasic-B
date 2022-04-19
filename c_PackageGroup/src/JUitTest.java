import org.junit.Test;

import java.util.Date;

/**
 * @author kinoz
 * @date 2022/4/9 - 21:22
 * @apiNote 单元测试方法
 */
public class JUitTest {
    int a =100;
    @Test
    public void equalsTest(){
        String s1 = "java";
        String s2 = "php";
        System.out.println(s1.equals(s2));

        System.out.println(a);

        Object obj = new String("MM");
        Date d = (Date)obj;
    }

    @Test
    public void charTest(){
        show();
    }

    public void show(){
        a = 20;
        System.out.println(a);
    }
}
