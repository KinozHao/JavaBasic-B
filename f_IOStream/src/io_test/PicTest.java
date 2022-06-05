package io_test;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author kinoz
 * @Date 2022/6/3 - 22:41
 * @apiNote ��ͼƬ���� �Լ����ܽ��ܲ���
 */
public class PicTest {
    @Test
    public void Pic_Lock() throws IOException { //��ͼƬ����
        //1.��ȡ������
        FileInputStream original = new FileInputStream("1.jpg");
        FileOutputStream newone = new FileOutputStream("new.jpg");

        //2.�ļ��Ķ�д����
        byte[] bt = new byte[20];
        int len;
        while ((len = original.read(bt)) != -1){
            //2.1.ͼƬ����(�����ֽڽ����ɻ���������ֽ�)
            for (int i = 0; i < len; i++) {
                bt[i] = (byte) (bt[i] ^ 5);
            }
            //д���µ��ļ�
            newone.write(bt,0,len);
        }

        //3.�ͷ���
        original.close();
        newone.close();
    }
    @Test
    public void Pic_UnLock() throws IOException{ ///��ͼƬ����
        //1.��ȡ������
        FileInputStream original = new FileInputStream("new.jpg");
        FileOutputStream newone = new FileOutputStream("unlock_new.jpg");

        //2.�ļ��Ķ�д����
        byte[] bt = new byte[20];
        int len;
        while ((len = original.read(bt)) != -1){
            //2.1.ͼƬ����(�����ɻ��൱�ڽ���)
            for (int i = 0; i < len; i++) {
                bt[i] = (byte) (bt[i] ^ 5);
            }
            //д���µ��ļ�
            newone.write(bt,0,len);
        }

        //3.�ͷ���
        original.close();
        newone.close();
    }
}
