import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/10 - 21:15
 * @apiNote 包装类<---->基本数据类型转换
 */
public class WrapperTest {

    // 基本数据类型---->包装类(调用构造器)
    @Test
    public void normalTest(){
        //调用包装类的构造器，把基本数据类型放进去即可
        //经过包装 就具有了调用方法的功能
        Integer i1 = new Integer(300);
        System.out.println(i1.toString());

        //传参为String时，只能为纯数字，否则就会报错
        Integer i2 = new Integer("300");
        System.out.println(i2.toString());

        //String状态下不是true这个词，返回就是false
        Boolean b1 = new Boolean("trdue");
        Boolean b2 = new Boolean("false");
        System.out.println(b1);
        System.out.println(b2);
    }

    //包装类---->基本数据类型转换(调用xxxValue)
    @Test
    public void revereTest(){
        Float ft = new Float(13.2);
        float ft2 = ft.floatValue();
        System.out.println(ft2 + 26.9);
    }

    public void orderTest(){
        Order or = new Order();
        System.out.println(or.isFlag);  //boolean默认返回false
        System.out.println(or.isFLAG);  //包装类，不赋值，默认输出null
    }
}

class Order {
    boolean isFlag;
    Boolean isFLAG;
}
