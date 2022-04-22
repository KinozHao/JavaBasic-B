import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/10 - 21:43
 * @apiNote 自动装箱/拆箱 jdk1.5后
 * 与String的转换
 */
public class AutoPackage {

    @Test
    public void testAuto(){
        //自动装箱1.5之后
        int num = 1000;
        aMethod(num);

        //1.5之前写法要新造一个对象通过传参方式把num传进去
        aMethod(new Integer(num));

        //自动拆箱
        Integer it1 = new Integer(300);
        System.out.println(it1.toString());

        int num2 = it1;
        System.out.println(num2 + 500);

        //自动装箱
        int num3 = 100;
        Integer it2 = num3;
        System.out.println("此时为Integer类型了:"+it2.toString());

    }


    public void aMethod(Object obj){ //多态体现
        System.out.println("编译左,运行右"+obj);
    }


    //基本数据类型/包装类----->String
    //通过String重载的valueOf方法即可
    @Test
    public void testWithString(){
        int t1 = 100;
        String s1 = String.valueOf(t1);
        System.out.println(s1);

        Character c1 = new Character('A');
        String s2 = String.valueOf(c1);
        System.out.println(s2);

    }

    //String----->基本数据类型/包装类
    //通过包装类的parseXXX()方法
    @Test
    public void testReverseString(){
        String s1 = "123.456232";
        //自动拆箱体现
        float f1 = Float.parseFloat(s1);
        System.out.println(f1);

        String s2 = "TRUE";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);
    }

}
