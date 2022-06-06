package a_file;

import org.junit.Test;

import java.io.*;

/**
 * @see File
 * @apiNote File�������ʵ����ʽ
 * Linux�ָ���"/"
 * Windows�ָ���"\\"
 * */
public class FileBasic {
    public static void main(String[] args) throws IOException {
        //�˳������ڿ�ƽ̨�����忴��Դ��
        System.out.println(File.separator);

        //ʵ����1
        File file = new File("word.txt");  //���·��
        File file2 = new File("E:\\JavaCode\\SEImprove\\f_IOStream\\hello.txt");  //����·��
        System.out.println(file);
        System.out.println(file2);
        //ʵ����2
        File dir1 = new File("E:\\JavaCode\\SEImprove", "MyDir");
        System.out.println(dir1);
        //ʵ����3
        File dirs = new File(dir1, "hello world");
        System.out.println(dirs);
    }
}
