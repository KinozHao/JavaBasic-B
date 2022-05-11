package string_method;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author kinoz
 * @Date 2022/5/2 - 14:31
 * @apiNote String类与其他结构之间的转换
 */
public class String_Transform {
    @Test
    public void withIntInteger() {
        //把int类型的数据转成字符串
        int a = 100;
        String s5 = String.valueOf(a);
        System.out.println(s5);

        //String转成int
        String str = "1548";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }

    @Test
    public void withCharArray() {
        //String转换为char[]
        String s3="Hello";
        char[] arr4 = s3.toCharArray();
        //遍历char数组
        System.out.println(Arrays.toString(arr4));

        //char[]组转换为String
        char[] arr = {'J','E','F','E','N','G'};
        System.out.println(new String(arr));
    }

    //牵扯编码，解码问题 可以去看深入了解计算机操作系统
    @Test
    public void withByteArray() {
        //编码: String转换为Byte[]
        String str = "abc淮信";
        byte[] arr = str.getBytes();

        //遍历字节数组(默认字节为UTF-8一个汉字三个字节)
        System.out.println(Arrays.toString(arr));

        //使用指定编码集输出
        String s2="机蜂程序员";
        try {
            byte[] arr2=s2.getBytes("UTF-16");
            System.out.println(Arrays.toString(arr2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //解码: Byte[]转换为String
        byte[] s3 = {'J','E','F','E','N','G'};
        System.out.println(new String(s3));

        //转码编码格式不一样，会乱码
        try {
            System.out.println(new String(s3,"UTF-16"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
