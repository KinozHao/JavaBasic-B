package io_test.heima_test;

//�����ļ�
import java.io.*;
import java.util.Scanner;

public class TextB {
    public static void main(String[] args) throws IOException {
        File file =method();    //���÷���
        //����Ϊio���Ĵ���
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file.getName()));
        int len;
        while ((len = bis.read()) !=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();

    }
    public static File method(){
        Scanner sc=new Scanner(System.in);  //��������¼�����
        System.out.println("������Ҫ�������ļ�:");   //��ʾ
        while (true) {
            String line=sc.nextLine();      //���ܼ���¼���·��
            File file=new File(line);       //��װΪfile���������ж�
            if (!file.exists()){
                System.out.println("¼��Ŀ����Ч");
            }else if (file.isDirectory()){
                System.out.println("¼�����һ���ļ���");
            }else {
                return file;
            }
        }
    }
}
