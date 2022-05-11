import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/5/11 - 19:41
 * @apiNote 一些其他的类
 */
public class OtherClass {
    @Test
    public void SystemTest(){
        System.gc();
        String s1 = System.getProperty("java.version");
        String s2 = System.getProperty("java.home");
        String s3 = System.getProperty("os.version");
        String s4 = System.getProperty("os.name");
        //System.exit(0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
    @Test
    public void MathTest(){
        System.out.println(Math.cos(90));
        System.out.println(Math.tan(180));
        System.out.println(Math.log(20));
        System.out.println(Math.sqrt(300));
    }

    @Test
    //使用数值超过Long最大就需要使用BigInteger
    //表示不可变的任意精度的整数
    public void BigIntegerTest(){
        BigInteger bir = new BigInteger("1156464867494981654979151355246796113546794163467943");
        BigInteger bir2 = new BigInteger("222");
        System.out.println(bir.add(bir2));
    }
    @Test
    //与之对应BigDecimal为浮点型
    public void BigDecimalTest(){
        BigDecimal bdl1 = new BigDecimal(2435323424325646242243464353242342343274.2442);
        BigDecimal bdl2 = new BigDecimal(244.22);
        //两数相除，保留2位小数
        System.out.println(bdl1.divide(bdl2,2,BigDecimal.ROUND_HALF_UP));
    }
}
