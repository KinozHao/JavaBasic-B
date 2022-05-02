package string_method;
/**
 * @author kinoz
 * @Date 2022/5/2 - 14:31
 * @apiNote 转换方法
 */
public class Method_E_Transform {
    public static void main(String[] args) {
        getBytes();
        System.out.println("----------");
        toCharArray();
        System.out.println("----------");
        valueOf();
        copyValueOf();
    }
    private static void copyValueOf() {
        //把字符数组转换为字符串   方法相同于valueOf
        char[] arr2={'a','c','x'};
        String s5=String.copyValueOf(arr2);
        System.out.println(s5);
    }

    //包装类提及过
    private static void valueOf() {
        //把字符数组转换为字符串
        char[] arr={'a','b','c'};
        String s4 = String.valueOf(arr);
        System.out.println(s4);

        //把int类型的数据转成字符串
        int a = 100;
        String s5 = String.valueOf(a);
        System.out.println(s5);
    }

    private static void toCharArray() {
        //把字符串转换为字符数
        String s3="Hello";
        char[] arr=s3.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void getBytes() {
        //把字符串转换为字节数组
        String s="abc";
        byte[] arr=s.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        String s2="机蜂程序员";      //通过gbk码表将字符串转换为字节数组
        byte[] arr2=s2.getBytes();  //编码:把我们看的懂的转换为计算级看的懂的
        for (int i = 0; i < arr2.length; i++) { //gbk码表一个中文代表两个字节
            System.out.print(arr2[i]+" ");  //gbk码表还有一个特点,中文第一个肯定是负数
        }
        System.out.println();
    }
}
