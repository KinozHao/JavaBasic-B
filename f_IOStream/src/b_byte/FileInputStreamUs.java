package b_byte;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamUs {
    public static void main(String[] args) throws IOException {
        System.out.println("��һ�ֻ���д��");
        MethodOne();
        System.out.println("�ڶ���ѭ��д��");
        FileInputStream Files = new FileInputStream("a.txt");
        int one;            //one�൱�ڵ�һ�ַ����е�x y z
        while ((one=Files.read()) != -1){   //ѭ���ж������ȡ���ֽ����ݲ�Ϊ-1��ִ��
            System.out.println(one);
        }
    }

    private static void MethodOne() throws IOException {    //���ܶ�ȡ�ļ����쳣 �׳�һ��
        FileInputStream file = new FileInputStream("a.txt");    //�������ļ�
        int x = file.read();        //read�����Ӹ��������ж�ȡһ���ֽڵ�����
        System.out.println(x);
        int y = file.read();
        System.out.println(y);
        int z = file.read();
        System.out.println(z);
        int o = file.read();        //�����ȡ���ֽ����ݲ����� �����-1��
        System.out.println(o);
    }
}
