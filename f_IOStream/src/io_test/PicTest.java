package io_test;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author kinoz
 * @Date 2022/6/3 - 22:41
 * @apiNote 对图片复制 以及加密解密操作
 */
public class PicTest {
    @Test
    public void Pic_Lock() throws IOException { //给图片加密
        //1.获取流对象
        FileInputStream original = new FileInputStream("old.png");
        FileOutputStream newone = new FileOutputStream("new.png");

        //2.文件的读写操作
        byte[] bt = new byte[20];
        int len;
        while ((len = original.read(bt)) != -1){
            //2.1.图片加密(即对字节进行疑惑运算打乱字节)
            for (int i = 0; i < len; i++) {
                bt[i] = (byte) (bt[i] ^ 5);
            }
            //写入新的文件
            newone.write(bt,0,len);
        }

        //3.释放流
        original.close();
        newone.close();
    }
    @Test
    public void Pic_UnLock() throws IOException{ ///给图片解密
        //1.获取流对象
        FileInputStream original = new FileInputStream("new.txt");
        FileOutputStream newone = new FileOutputStream("unlock_new.txt");

        //2.文件的读写操作
        byte[] bt = new byte[20];
        int len;
        while ((len = original.read(bt)) != -1){
            //2.1.图片加密(二次疑惑相当于解密)
            for (int i = 0; i < len; i++) {
                bt[i] = (byte) (bt[i] ^ 5);
            }
            //写入新的文件
            newone.write(bt,0,len);
        }

        //3.释放流
        original.close();
        newone.close();
    }
}
