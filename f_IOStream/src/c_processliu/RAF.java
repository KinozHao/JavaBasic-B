package c_processliu;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.*;

/**
 * @author kinoz
 * @Date 2022/6/6 - 21:13
 * @apiNote RandomAccessFile类使用
 * 此类即可作为读也可作为写 通过构造器第二个参数体现
 * r rw rwd rws参数
 */
public class RAF {
    @Test
    public void raf_test() throws IOException {
        //1.创建流对象,传入文件
        File fl = new File("1.jpg");
        File nfl = new File("2.jpg");
        RandomAccessFile raf = new RandomAccessFile(fl,"r");
        RandomAccessFile rag = new RandomAccessFile(nfl,"rw");

        //2.读写
        byte[] bytes = new byte[1024];
        int len;
        while ((len = raf.read(bytes)) != -1){
            rag.write(bytes,0,len);
        }
        //3.释放流
        raf.close();
        rag.close();
    }
    @Test//对原文件从头进行字节覆盖
    public void rafII_test() throws IOException{
        RandomAccessFile acs = new RandomAccessFile(new File("accessData.txt"), "rw");
        //指定光标位置进行插入
        acs.seek(3);
        acs.write("chinaNumberOne".getBytes());

        acs.close();
    }
    @Test
    public void rafIV_test() throws IOException{
        RandomAccessFile acs = new RandomAccessFile(new File("accessData.txt"), "rw");
        acs.seek(2);//指针调到索引为2的位置
        //指针索引后的数据存在Sb中(sbr的初始长度为File类的长度)
        StringBuffer sbr = new StringBuffer((int) new File("accessData.txt").length());

        byte[] bt = new byte[20];
        int len;
        while ((len = acs.read(bt)) != -1){
            sbr.append(new String(bt,0,len));
        }

        //调回指针，写入具体数据
        acs.seek(2);
        acs.write("插入数据".getBytes());

        //再把存在Sb中的数据写回去
        acs.write(sbr.toString().getBytes());

        acs.close();
    }
}
