package string_method;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/2 - 22:26
 * @apiNote ��һ�ѷ���
 */
public class Method_B {
    @Test
    public void test1_method(){
        String s1 = "helloworld";
        //1.�����ǲ�����ָ���ַ�����ʼ���β
        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.startsWith("ld"));
        //2.�ж�ָ���ַ����ǲ�����ָ��������ʼ��
        System.out.println(s1.startsWith("ll",2));

        //3.һ���ַ����Ƿ��������һ���ַ�������
        String s2 = "world";
        System.out.println(s1.contains(s2));

        //4.��ȡָ���ַ�������λ��(�����ַ��������ڷ���-1)
        System.out.println(s2.indexOf("ld"));
        //5.ָ��������ʼ��ָ���ַ���
        System.out.println(s2.indexOf("ld",5));
        //6.��indexOf������ʽ�պ��෴
        System.out.println(s2.lastIndexOf("wo"));
        System.out.println(s2.lastIndexOf('d',4));
    }
}
