package a_file;

import java.io.File;
import java.io.IOException;

public class JudgeFeatures {
    public static void main(String[] args) throws IOException {
        System.out.println("Part1>>>>>>");
        JudgeDirectoryOrFile();
        System.out.println("Part2>>>>>>");
        File a=new File("a.txt");
        a.setReadable(false);   //����Ϊ���ɶ�
        System.out.println("�ɲ��ɶ�?"+a.canRead());    //windows default all of the document can read
        a.setWritable(false);   //���ò���д
        System.out.println("�ɲ���д?"+a.canWrite());   //windows can setting dontWrite

        File b=new File("I:\\CodeProject\\wenjian");
        System.out.println("�ǲ��ǲ�������?"+b.isHidden());
    }

    private static void JudgeDirectoryOrFile() {
        File a=new File("a.txt");   //��a.txt��װΪa����
        File b=new File("wenjian");
        //�ж��ǲ���һ����Ŀ¼�ļ�
        System.out.println(b.isDirectory());
        System.out.println(a.isDirectory());
        //�ж��ǲ���һ���ļ�
        System.out.println(a.isFile());
    }
}
