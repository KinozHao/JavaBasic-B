/**
 * @author kinoz
 * @Date 2022/5/2 - 14:31
 * @apiNote String常用构造器
 */
public class StringGzq {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("Java");
        System.out.println(s2);

        byte[] arr1 = {97,98,99,100,101};
        //解码:将计算机读懂的转换成我们能读懂的
        String s3 = new String(arr1);
        System.out.println(s3);

        //将arr2数组从索引二开始，获取length
        String s4=new String(arr1,2,3);
        System.out.println(s4);

        char[] arr2 ={'M','I','P','H','O','N','E'};
        //将字符数字转换成字符串
        String s5 = new String(arr2);
        System.out.println(s5);

        //将arr3字符数组,从索引三开始,取四个字符
        String s6=new String(arr2,3,4);
        System.out.println(s6);

    }
}
