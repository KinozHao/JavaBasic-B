package string_method;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author kinoz
 * @Date 2022/5/2 - 14:31
 * @apiNote String���������ṹ֮���ת��
 */
public class String_Transform {
    @Test
    public void withIntInteger() {
        //��int���͵�����ת���ַ���
        int a = 100;
        String s5 = String.valueOf(a);
        System.out.println(s5);

        //Stringת��int
        String str = "1548";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }

    @Test
    public void withCharArray() {
        //Stringת��Ϊchar[]
        String s3="Hello";
        char[] arr4 = s3.toCharArray();
        //����char����
        System.out.println(Arrays.toString(arr4));

        //char[]��ת��ΪString
        char[] arr = {'J','E','F','E','N','G'};
        System.out.println(new String(arr));
    }

    //ǣ�����룬�������� ����ȥ�������˽���������ϵͳ
    @Test
    public void withByteArray() {
        //����: Stringת��ΪByte[]
        String str = "abc����";
        byte[] arr = str.getBytes();

        //�����ֽ�����(Ĭ���ֽ�ΪUTF-8һ�����������ֽ�)
        System.out.println(Arrays.toString(arr));

        //ʹ��ָ�����뼯���
        String s2="�������Ա";
        try {
            byte[] arr2=s2.getBytes("UTF-16");
            System.out.println(Arrays.toString(arr2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //����: Byte[]ת��ΪString
        byte[] s3 = {'J','E','F','E','N','G'};
        System.out.println(new String(s3));

        //ת������ʽ��һ����������
        try {
            System.out.println(new String(s3,"UTF-16"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
