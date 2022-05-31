package c_character;

import org.junit.Test;

import java.io.*;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote 对文件进行复制操作
 * @see FileReader
 * @see FileWriter
 */
public class FileCopy {
    @Test
    public void Copy_A(){
        FileReader fr= null;
        FileWriter fw= null;
        try {
            //1.创建流,并获取文件
            fr = new FileReader("a.txt");
            fw = new FileWriter("b.txt");

            //2.数据读写操作
            char[] cr = new char[5];
            int len;   //记录每次读入到cbuf数组中的字符个数
            while ((len=fr.read(cr)) !=-1){
                //每次写出len个字符
                fw.write(cr,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //3.关闭两个流
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
