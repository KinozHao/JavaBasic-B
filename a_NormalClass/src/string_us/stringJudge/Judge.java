package string_us.stringJudge;

public class Judge {
    public static void main(String[] args) {
        equalsMethod();
        System.out.println("------------");
        ContainsMethod();
        System.out.println("------------");
        StartWithAndendWithMethod();
        System.out.println("------------");
        EmptyorNot();

    }

    private static void EmptyorNot() {
        String q1="China";
        String q2="";
        String q3=null;
        //判断字符串是否为空
        System.out.println(q1.isEmpty());
        System.out.println(q2.isEmpty());
        //System.out.println(null);
    }

    private static void StartWithAndendWithMethod() {

        String y1="I like computer game";
        String y2="I";
        String y3="game";
        //判断字符串是否以某个指定的字符串开头
        System.out.println(y1.startsWith(y2));
        //判断字符串是否以某个指定的字符串结束
        System.out.println(y1.endsWith(y3));
    }

    private static void ContainsMethod() {
        //判断大字符串中是否包括小字符串
        String k1="This is one plus phone";
        String k2="one plus";
        String k3="IPhone";
        System.out.println(k1.contains(k2));
        System.out.println(k1.contains(k3));
    }

    private static void equalsMethod() {
        String s1="china";
        String s2="china";
        String s3="China";
        //比较字符串的内容是否相同,区分大小写
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        //比较字符串的内容是否相同,不区分大小写加了IgnoreCase
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
