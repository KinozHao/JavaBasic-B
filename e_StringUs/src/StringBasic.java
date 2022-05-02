import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/2 - 14:31
 * @apiNote String的基本理解
 */
public class StringBasic {
    @Test
    //了解String
    public void test_String(){
        //1.字面量定义方式
        String s1 ="abc";
        String s2 ="abc";
        //地址值是相同的
        System.out.println(s1 == s2);
        //不可变性体现
        s2 = "hello";
        System.out.println(s2);

        System.out.println("********************");
        String s3 = "abc";
        s3 +="-dde";
        System.out.println(s3);
        System.out.println(s1);
        //相当于在常量池又新造了一个对象，并没有对原有对象改变
        String s4 = s3.replace('c', 'd');
        System.out.println(s4);
    }
    @Test
    //创建对象问题
    public void test2_String(){
        //相当于new了两个一个在堆中，一个在常量池中
        //2.构造器new的方式定义
        String a = new String("中国");
        String b = new String("中国");
        String c = "中国";
        //不相等因为是两个对象
        System.out.println(a == b);
        //所在区域不同，一个在常量池，一个在堆中
        System.out.println(a == c);
    }

    @Test
    //intern方法
    public void test3_String(){
        String s1 = "rocker";
        String s3 = "rockerfall";
        String s2 = s1+"fall";
        //返回这得到的s4使用的是常量池中的rockerfall‘
        //intern强制在常量池中声明
        String s4 = s2.intern();
        System.out.println(s3 == s4);

    }
}
