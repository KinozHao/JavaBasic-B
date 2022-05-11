package string_test;
import org.junit.Test;

public class AboutString {
        @Test
        public void test2_method() {
                //创建了几个对象?
                //ConstantPool(常量池) stack(堆)各一个
                String  s1 = new String("OnePlus");
                System.out.println(s1);
        }
        @Test
        public void test3_method() {
                //new的方式存储在stack
                String  s1 = new String("aaa");
                //字面量存储在ConstantPool
                String  s2 = "aaa";
                System.out.println(s1.equals(s2));  //true属性值
                System.out.println(s1 == s2);       //false地址值
        }
        @Test
        public void test4_method() {
                //常量池优化机制:在编译时直接把7赋值给了num
                byte num=3+3;
                System.out.println("Java常量池优化机制:"+num);

                String s1="a"+"b"+"c";
                String s2="abc";
                System.out.println(s1 == s2); //true java中有常量优化机制
                System.out.println(s1.equals(s2));  //true
        }
}
