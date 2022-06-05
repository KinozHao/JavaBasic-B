package c_processliu;

import org.junit.Test;

import java.io.*;

/**
 * @author kinoz
 * @Date 2022/6/4 - 14:07
 * @apiNote 处理流二:转换流
 */
public class TransformBasic {
    @Test
    public void file_Convert() throws IOException {
        //相当于解码的操作
        //InputStreamReader把字节转换为字符
        //1.获取流对象,添加进转换流中
        FileInputStream files = new FileInputStream("hello.txt");
        //可以指定字符格式为gbk,也可以不写即为默认
        InputStreamReader isr = new InputStreamReader(files,"gbk");

        //2.读取数据
        int len;
        char[] cr = new char[10];
        while ((len = isr.read(cr)) != -1){
            //通过String把数据通过控制台打印
            String data = new String(cr, 0, len);
            System.out.print(data);
        }
        //3.关闭流
        isr.close();
    }

    @Test
    public void file_ConvertII() throws IOException{
        //相当于编码操作
        //1.创建转换流以及流对象 确定转换的字符集
        FileInputStream origin = new FileInputStream("my.txt");
        FileOutputStream after = new FileOutputStream("my_utf8.txt");
        InputStreamReader gbk = new InputStreamReader(origin, "gbk");
        OutputStreamWriter utf = new OutputStreamWriter(after, "utf-8");

        //2.数据读写操作
        int len;
        char[] cr = new char[10];
        while ((len = gbk.read(cr)) != -1){
            utf.write(cr,0,len);
        }

        //3.关闭流
        gbk.close();
        utf.close();
    }
}
