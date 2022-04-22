import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/10 - 22:39
 * @apiNote 面试题
 */
public class InterviewTest {
    @Test
    public void interviewTest(){
        //引用数据类型 比较的地址值
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);

        //自动拆箱 比较的是值
        Integer a = 2;
        Integer b = 2;
        System.out.println(a == b);

        /**
         * @apiNote
         * 返回为false 具体看Integer源码的IntegerCache结构的的Integer[]
         * Integer[]保存了-128~127的整数
         * 在此范围内,直接使用此数字元素,无需再new,提高开发效率
         */
        //x和y相当于new了两个对象 比较的是地址值了
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
