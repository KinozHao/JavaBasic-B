package ByteStream.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMethod2 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream fis=new FileInputStream("I:\\CodeProject\\JavaIntermedate\\picture.png");
        //创建输出流对象
        FileOutputStream fos=new FileOutputStream("I:\\CodeProject\\JavaIntermedate\\copy.png");
        /*
        int len=fis.available();
        System.out.println(len);*/

        byte[] arr=new byte[fis.read()];        //创建和文件大小一样的字节数组
        fis.read(arr);                          //将文件上的字节读取到内存中
        fos.write(arr);                         //将字节数组中的字节数据写到文件上

        fis.close();                            //关闭流释放内存
        fos.close();
    }
}
