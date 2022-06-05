package b_io_basic;

import java.io.*;

/**
 * @author kinoz
 * @Date 2022/6/1 - 22:14
 * @apiNote This class provide two static method
 * TestCopy and unTestCopy it mean's like it's name
 * That was the things they just can do -_- !
 * @see FileOutputStream
 * @see FileInputStream
 * @see FileReader
 * @see FileWriter
 * @version 11
 */
public class CopyMethod {
    @IOAnnotation("字符流最适合对文本文件的复制")
    public static void TextCopy(String beginPath,String endPath){
        FileReader fr= null;
        FileWriter fw= null;
        try {
            //1.创建流,并获取文件
            fr = new FileReader(beginPath);
            //被写入的文件可不存在会自动创建
            fw = new FileWriter(endPath);

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
    @IOAnnotation("字节流适用于除文本文件外文件的复制操作")
    public static void unTestCopy(String beginPath,String endPath) throws IOException{
        //1.创建流对象获取文件
        FileInputStream pic = new FileInputStream(beginPath);
        FileOutputStream cop = new FileOutputStream(endPath);

        //2.读取数据(大型文件通常数组为1024个字节)
        byte[] bt = new byte[1024];
        int len;
        while ((len = pic.read(bt)) != -1){
            cop.write(bt,0,len);
        }

        //3.释放流
        pic.close();
        cop.close();
    }

}
