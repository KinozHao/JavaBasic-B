package string_method;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/2 - 19:52
 * @apiNote 一堆常用方法
 */
public class Method_A {
    @Test
    public void String_Method1(){
        String character = "technology";
        //1.获取索引
        System.out.println(character.length());
        //2.截取指定字符
        System.out.println(character.charAt(3));


        //3.判断此对象是否为空
        System.out.println(character.isEmpty());
        //4.转换大小写
        System.out.println(character.toUpperCase());
        System.out.println(character.toLowerCase());


        //5.忽略首尾空格
        String fruit = "  a ppl e  ";
        String afterfruit = fruit.trim();
        System.out.println("-"+afterfruit+"-");
    }

    @Test
    public void String_Method2(){
        //IgnoreCase即不区分大小写
        String character1 = "hello";
        String character2 = "HellO";
        //6.比较方法
        System.out.println(character1.equals(character2));
        System.out.println(character1.equalsIgnoreCase(character2));

        //7.涉及字符串排序，不考虑堆和常量池，只比较结果(输出为0表示相同)
        System.out.println(character1.compareTo(character2));
        System.out.println(character1.compareToIgnoreCase(character2));

        //8.取出指定索引字符串，左闭右开
        String character3 = "GermanyScotland";
        System.out.println(character3.substring(7));
        System.out.println(character3.substring(0,6));

        //9.连接,用的少一半用+
        String world = character2.concat("world");
        System.out.println(world);
    }
}
