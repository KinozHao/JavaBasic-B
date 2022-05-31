package b_byte.Copy;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote 只适用于小型图片复制
 */
public class PicCopy {
    @Test
    public void pic_Test(){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            //创建输入流对象
            fis = new FileInputStream("E:\\图片\\Wallpaper\\1.jpg");
            //创建输出流对象
            fos = new FileOutputStream("test.jpg");
            int i;
            while ((i=fis.read()) != -1){       //不断的读取每一个字节
                fos.write(i);                   //写出每一个字节
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //用完之后记得关闭流 释放资源
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
