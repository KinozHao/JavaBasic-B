package ByteStream.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMethod2 {
    public static void main(String[] args) throws IOException {
        //��������������
        FileInputStream fis=new FileInputStream("I:\\CodeProject\\JavaIntermedate\\picture.png");
        //�������������
        FileOutputStream fos=new FileOutputStream("I:\\CodeProject\\JavaIntermedate\\copy.png");
        /*
        int len=fis.available();
        System.out.println(len);*/

        byte[] arr=new byte[fis.read()];        //�������ļ���Сһ�����ֽ�����
        fis.read(arr);                          //���ļ��ϵ��ֽڶ�ȡ���ڴ���
        fos.write(arr);                         //���ֽ������е��ֽ�����д���ļ���

        fis.close();                            //�ر����ͷ��ڴ�
        fos.close();
    }
}
