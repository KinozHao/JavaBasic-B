package string_us.stringQFA;

public class Demo3_StringQFA4 {
    public static void main(String[] args) {

        byte num=3+3;               //常量池优化机制:在编译时直接把7赋值给了num
        System.out.println("Java常量池优化机制:"+num);

        String s1="a"+"b"+"c";
        String s2="abc";
        System.out.println(s1==s2); //true java中有常量优化机制
        System.out.println(s1.equals(s2));  //true
    }
}
