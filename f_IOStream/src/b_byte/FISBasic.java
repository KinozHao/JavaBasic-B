package b_byte;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FISBasic {
    @Test
    public void Write_one() throws IOException{    //���ܶ�ȡ�ļ����쳣 �׳�һ��
        FileInputStream file = new FileInputStream("a.txt");
        int x = file.read();        //read�����Ӹ��������ж�ȡһ���ֽڵ�����
        System.out.println(x);
        int y = file.read();
        System.out.println(y);
        int z = file.read();
        System.out.println(z);
        int o = file.read();        //�����ȡ���ֽ����ݲ����� �����-1��
        System.out.println(o);
    }

    @Test
    public void Write_two() throws IOException{
        FileInputStream Files = new FileInputStream("a.txt");
        //one�൱�ڵ�һ�ַ����е�x y z
        int one;
        //ѭ���ж������ȡ���ֽ����ݲ�Ϊ-1��ִ��
        while ((one=Files.read()) != -1){
            System.out.println(one);
        }
    }
}
