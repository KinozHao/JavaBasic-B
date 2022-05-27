package a_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetFeatures {
    public static void main(String[] args) {
        System.out.println("PartA:---->>>>>>>>");
        Demo1();
        System.out.println("PartB:---->>>>>>>>");
        File dir=new File("I:\\ѧϰ��Ƶ\\Java����");
        String [] arr=dir.list();
        for (String string: arr) {
            System.out.println(string);
        }

        File[] subFiles =dir.listFiles();
        for (File file:subFiles) {
            System.out.println(file);
        }

    }

    private static void Demo1() {
        File s=new File("div.css");
        File b=new File("I:\\CodeProject\\JavaIntermedate\\div.css");
        System.out.println("��ȡ����·��"+s.getAbsolutePath());    //��ȡ����·��
        System.out.println("��ȡ����·��"+s.getAbsolutePath());

        System.out.println("��ȡ���췽�������·��"+s.getPath());            //��ȡ���췽�������·��
        System.out.println("��ȡ���췽�������·��"+b.getPath());

        System.out.println("��ȡ�ļ������ļ��е�����"+s.getName());              //��ȡ�ļ������ļ��е�����
        System.out.println("��ȡ�ļ������ļ��е�����"+b.getName());
        System.out.println("��ȡ�ļ��ַ�������"+s.length());              //��ȡ�ļ��ַ�������

        Date d=new Date(s.lastModified());          //��ȡ�ļ�������޸�ʱ��
        SimpleDateFormat sj=new SimpleDateFormat("yyy��:MM��:dd��:HH:mm:ss");
        System.out.println(sj.format(d));
    }
}
