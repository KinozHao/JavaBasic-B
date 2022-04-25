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
        while ((len=fis.read(arr)) !=-1){   //������Ǽ�arr,���صľͲ��Ƕ�ȡ�ĸ���,�����ֽڵ����ֵ
            fos.write(arr,0,len);
        }
        fis.close();
        fos.close();
    }

    private static void Demo2() throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        FileOutputStream fos=new FileOutputStream("c.txt");
        byte [] arr=new byte[3];        //����һ���ֽ�����
        int len;
        while ((len=fis.read(arr)) !=-1) {
            fos.write(arr,0,len);   //read(byte[] b,int off,int len);   �Ӹ���������ȡ��� len�ֽڵ�����Ϊ�ֽ�����
        }
        fis.close();        //�ر����ͷ��ڴ�
        fos.close();
    }

    private static void Demo1() throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");   //������
        byte[] arr=new byte[3];     //����һ���ֽ�����
        int a=fis.read(arr);        //���ļ��ϵ��ֽڶ�ȡ���ֽ�������

        System.out.println(a);      //��ȡ����Ч�ֽ�����
        for (byte b : arr) {
            System.out.println(b);  //��ȡ�����ϵ�abc
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
