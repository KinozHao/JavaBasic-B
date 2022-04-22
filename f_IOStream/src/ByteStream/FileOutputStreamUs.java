package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamUs {
    public static void main(String[] args) throws IOException {
        First();
        //如果想要续写的话需要在FileOutputStream参数后面添加true表示还要进行添加
        FileOutputStream fos2=new FileOutputStream("b.txt",true);
        fos2.write(102);
        fos2.write(103);
        fos2.write(104);

        fos2.close();
    }

    private static void First() throws IOException {
        FileOutputStream fos=new FileOutputStream("b.txt"); //创建字节输出流对象,若没有就会自动创建一个
      /*  fos.write(97);  //写出为一个int数值 但是文件里面会创建字符,自动去除前三个8位
        fos.write(98);
        fos.write(99);
        fos.write(100);*/
        fos.write(101);
        fos.close();    //用完记得关闭流释放内存
    }
}
