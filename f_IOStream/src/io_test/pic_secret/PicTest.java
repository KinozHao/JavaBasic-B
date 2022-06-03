package io_test.pic_secret;

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
        FileInputStream original = new FileInputStream("1.jpg");
        FileOutputStream newone = new FileOutputStream("new.jpg");

        byte[] bt = new byte[20];
        int len;
        while ((len = original.read(bt)) != -1){
            for (int i = 0; i < len; i++) {
                bt[i] = (byte) (bt[i] ^ 5);
            }
            newone.write(bt,0,len);
        }

        original.close();
        newone.close();
    }
    @Test
    public void Pic_UnLock() throws IOException{ ///��ͼƬ����
        FileInputStream original = new FileInputStream("new.jpg");
        FileOutputStream newone = new FileOutputStream("unlock_new.jpg");

        byte[] bt = new byte[20];
        int len;
        while ((len = original.read(bt)) != -1){
            for (int i = 0; i < len; i++) {
                bt[i] = (byte) (bt[i] ^ 5);
            }
            newone.write(bt,0,len);
        }

        original.close();
        newone.close();
    }
}
