package string_us.stringOverview;

public class Demo2_StringConstruction {
    public static void main(String[] args) {
        String s1=new String();
        System.out.println(s1);

        byte[] arr1={97,98,99};
        String s2=new String(arr1);         //解码:将计算机读懂的转换成我们能读懂的
        System.out.println(s2);

        byte[] arr2={97,98,99,100,101};
        String s3=new String(arr2,2,3); //将arr2数组从2索引开始转换三个
        System.out.println(s3);

        char[] arr3={'M','I','P','H','O','N','E'};
        String s4=new String(arr3);         //将字符数字转换成字符串
        System.out.println(s4);

        String s5=new String(arr3,3,4); //将arr3字符数组,从1索引开始,转换三个
        System.out.println(s5);

        String s6=new String("Java");
        System.out.println(s6);
    }
}
