package ByteStream.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMethod3 {
    public static void main(String[] args) throws IOException {
        //Text1();
        //Text2();
        FileInputStream fis =new FileInputStream("Music.mp3");
        FileOutputStream fos=new FileOutputStream("copys.mp3");
        byte [] arr=new byte[1024 * 8];
        int len;
        while ((len=fis.read(arr)) !=-1){   //如果忘记加arr,返回的就不是读取的个数,而是字节的码表值
            fos.write(arr,0,len);
        }
        fis.close();
        fos.close();
    }

    private static void Demo2() throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        FileOutputStream fos=new FileOutputStream("c.txt");
        byte [] arr=new byte[3];        //定义一个字节数组
        int len;
        while ((len=fis.read(arr)) !=-1) {
            fos.write(arr,0,len);   //read(byte[] b,int off,int len);   从该输入流读取最多 len字节的数据为字节数组
        }
        fis.close();        //关闭流释放内存
        fos.close();
    }

    private static void Demo1() throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");   //输入流
        byte[] arr=new byte[3];     //定义一个字节数组
        int a=fis.read(arr);        //把文件上的字节读取到字节数组中

        System.out.println(a);      //读取到有效字节数组
        for (byte b : arr) {
            System.out.println(b);  //获取键盘上的abc
        }
        System.out.println("-----------------------------");
        int c=fis.read(arr);
        System.out.println(c);
        for (byte b : arr){
            System.out.println(b);
        }
        fis.close();
    }
}
