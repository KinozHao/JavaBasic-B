package b_byte_stream.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//此方法用于小型文件的copy 如果大型的文件会copy很慢 因为是逐个字节进行copy的
public class CopyIOSteamCore {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream fis=new FileInputStream("I:\\CodeProject\\JavaIntermedate\\picture.png");
        //创建输出流对象
        FileOutputStream fos=new FileOutputStream("I:\\CodeProject\\JavaIntermedate\\copy.png");
        int i;
        while ((i=fis.read()) != -1){       //不断的读取每一个字节
            fos.write(i);                   //写出每一个字节
        }
        fis.close();                        //用完之后记得关闭流 释放资源
        fos.close();
    }
}
