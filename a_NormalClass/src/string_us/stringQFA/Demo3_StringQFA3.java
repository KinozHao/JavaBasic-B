package string_us.stringQFA;

public class Demo3_StringQFA3 {
    public static void main(String[] args) {
        String  s1=new String("aaa"); //记录的是stack的内存
        String  s2="aaa";                   //记录的是constant pool的内存
        System.out.println(s1.equals(s2));  //true      属性值
        System.out.println(s1==s2);         //false     地址值
    }
}
