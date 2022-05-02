package string_buffer_basic;
//Attention: 返回值类型不再是StringBuffer本身 而是String类型
public class SubstringMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("jifeng");

        String s=sb.substring(2);       //截取feng 从索引2开始
        System.out.println(s);

        String s2=sb.substring(0,2);       //截取ji 从索引0开始到索引2 不包含索引的尾
        System.out.println(s2);

        System.out.println(sb);            //对象本身不改变
    }
}
