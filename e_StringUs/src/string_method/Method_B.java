package string_method;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/2 - 22:26
 * @apiNote 又一堆方法
 */
public class Method_B {
    @Test
    public void test1_method(){
        String s1 = "helloworld";
        //1.测试是不是以指定字符串开始或结尾
        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.startsWith("ld"));
        //2.判断指定字符串是不是以指定索引开始的
        System.out.println(s1.startsWith("ll",2));

        //3.一个字符串是否包含另外一个字符串内容
        String s2 = "world";
        System.out.println(s1.contains(s2));

        //4.获取指定字符串索引位置(若此字符串不存在返回-1)
        System.out.println(s2.indexOf("ld"));
        //5.指定索引开始找指定字符串
        System.out.println(s2.indexOf("ld",5));
        //6.和indexOf操作方式刚好相反
        System.out.println(s2.lastIndexOf("wo"));
        System.out.println(s2.lastIndexOf('d',4));
    }
}
