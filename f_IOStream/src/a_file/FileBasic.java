package a_file;

import org.junit.Test;

import java.io.*;

/*
* ��д���ĵ�����
* ע��:һ������Ϊ�����ֽ�
* */
public class FileBasic {
    public static void main(String[] args) throws IOException {
        /*File file =new File("hello.md");
        System.out.println(file.createNewFile());
        FileOutputStream FOS =new FileOutputStream("hello.md");
        FOS.write("#Hello".getBytes());    //�������Ҫ�ѻ�ת��Ϊ�ֽڲſ������
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
