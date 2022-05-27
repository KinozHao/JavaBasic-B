package a_file;

import org.junit.Test;

import java.io.*;

/*
* 读写中文的问题
* 注意:一个中文为两个字节
* */
public class FileBasic {
    public static void main(String[] args) throws IOException {
        /*File file =new File("hello.md");
        System.out.println(file.createNewFile());
        FileOutputStream FOS =new FileOutputStream("hello.md");
        FOS.write("#Hello".getBytes());    //输出必须要把话转换为字节才可以输出
        FOS.close();*/
    }
    @Test
    public void Test1() throws IOException {
        File file = new File("xxx.txt");
        System.out.println(file.createNewFile());
        FileInputStream FIS=new FileInputStream("xxx.txt");
        byte [] b = new byte[6];
        int len;
        while ((len=FIS.read(b)) != -1){
            System.out.println(new String(b));
        }
        FIS.close();
    }
}
