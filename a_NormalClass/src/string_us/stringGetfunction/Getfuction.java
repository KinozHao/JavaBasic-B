package string_us.stringGetfunction;

public class Getfuction {
    public static void main(String[] args) {
        lengthMethod();
        System.out.println("———————————————");
        indexOfMethod();
        System.out.println("————————————————");
        lastindexof();
        System.out.println();
        substringstar();
    }

    private static void substringstar() {
        //String substring(int start):从指定位置开始截取字符串,默认到末尾
        //String substring(int strat int end):从指定位置开始到指定位置结束截取字符串
        String s1="jifengwudi";

        String s=s1.substring(6);
        System.out.println(s);

        String ss=s1.substring(0,6);     //包含头不包含尾 左闭右开
        System.out.println(ss);
    }

    private static void lastindexof() {
        //返回指定字符在此字符串中从指定位置后第一次出现处的索引
        String s1="jifengj";
        int index=s1.indexOf('j',1);    //从指定位置向后找
        System.out.println("从指定位置向后找的索引值:"+index);

        int index2=s1.lastIndexOf('j');         //从后向前找
        System.out.println("从后向前找的索引值:"+index2);

        int index3=s1.lastIndexOf('j',5);   //从指定位置向前找
        System.out.println("从指定位置向前找的索引值:"+index3);
    }

    private static void indexOfMethod() {
    /*
    int indexOf(int ch) 返回指定字符在字符串中第一次出现的索引
    int indexOf(String str) 返回指定字符串在字符串中第一次出现的索引
     */
        String s1="heima";
        int index=s1.indexOf('i');      //参数接受的是int类型,传递char类型会自动提升
        System.out.println("字符串中i字符的索引:"+index);

        int index2=s1.indexOf('z');
        System.out.println("字符串中不包含的字符索引是:"+index2);     //如果不存在返回值就是-1

        int index3=s1.indexOf("ma");    //获取字符串中第一个字符出现的位置
        System.out.println("字符串中字符串的索引:"+index3);

        int index4=s1.indexOf("ia");    //如果两个字符不是一起的,返回值也是-1
        System.out.println("字符串中两个字符未在一起的索引是:"+index4);
    }

    private static void lengthMethod() {
        //获取字符串的长度
        String s1="java";
        String s2="你好,java";

        System.out.println("字符串s1的索引"+s1.length());
        System.out.println("字符串s2的索引"+s2.length());
        //获取字符串的索引值
        char c=s1.charAt(3);
        System.out.println("获取指定位置的字符串"+c);

        char cw=s2.charAt(3);
        System.out.println("获取指定位置的字符串"+cw);
    }
}
