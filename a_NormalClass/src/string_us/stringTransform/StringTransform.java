package string_us.stringTransform;

public class StringTransform {
    public static void main(String[] args) {
        getBytes();
        System.out.println("----------");
        toCharArray();
        System.out.println("----------");
        valueOf();
        copyValueOf();
        System.out.println("----------");
        LowerAndUpper();
        System.out.println("----------");
        concat();
    }

    private static void concat() {
    /*
    concat方法的作用把字符串拼接在一起
    concat和+符号的区别:
    +符号可以让字符串和任何类型相加
    concat方法调用和传入的都必须是字符串
    */
        String str1="JIFENG";
        String str2="jifeng";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));
    }

    private static void LowerAndUpper() {
    /*
    toLowerCase方法的作用是把大写的字符串转换为小写
    toUpperCase方法的作用是把小写的字符串转换为大写
    */
        String bigs="ABCDE";
        String smalls="fghig";
        System.out.println(bigs.toLowerCase());
        System.out.println(smalls.toUpperCase());
    }

    private static void copyValueOf() {
        //把字符数组转换为字符串   方法相同于valueOf
        char[] arr2={'a','c','x'};
        String s5=String.copyValueOf(arr2);
        System.out.println(s5);
    }

    private static void valueOf() {
        //把字符数组转换为字符串
        char[] arr={'a','b','c'};
        String s4=String.valueOf(arr);  //底层是由String类的构造方法完成的
        System.out.println(s4);

        //把int类型的数据转成字符串
        int a=1;
        String s5=String.valueOf(100);  //将100转换成字符串的100
        System.out.println(s5);
    }

    private static void toCharArray() {
//      把字符串转换为字符数组
        String s3="Hello";
        char[] arr=s3.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void getBytes() {
//        把字符串转换为字节数组
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
