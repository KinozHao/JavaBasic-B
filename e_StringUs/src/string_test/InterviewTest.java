package string_test;

import org.junit.Test;

public class InterviewTest {
    @Test
    public void test1() {
        String str = "HeiMa";
        //substring会产生一个新的字符串,需要将新的字符串记录
        str.substring(4);
        System.out.println(str);
    }

    String str = new String("hello");
    char[] ch = {'a','t','t','a','c','k'};
    public void change(String str,char ch[]){
        str = "world";
        ch[0] = 'b';
    }
    @Test
    public void test2(){
        InterviewTest iqa = new InterviewTest();
        /*相当于又传了个新的String对象
        Char只是改变了索引字符
        String不可变，数组可变*/
        iqa.change(iqa.str,iqa.ch);
        System.out.println(iqa.str);
        System.out.println(iqa.ch);
    }

}
