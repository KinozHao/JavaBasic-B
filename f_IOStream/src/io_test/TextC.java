package io_test;
//¼�����ݿ������ļ�
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TextC {
    public static void main(String[] args) throws IOException {
        //��������¼�����
        Scanner sc=new Scanner(System.in);
        //�������������,����xxx.txt�ļ�
        FileOutputStream bos=new FileOutputStream("xxx.txt");
        //��������ѭ��
        while (true){
            String line =sc.nextLine(); //¼�����ݴ��
            //����quit���Ƴ�
            if ("quit".equals(line)){
                break;
            }
            bos.write(line.getBytes()); //д���������ֽڸ�ʽ
            bos.write("\r\n".getBytes());
        }
        bos.close();    //���ر�
    }
}
