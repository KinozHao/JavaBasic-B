package a_file;

import org.junit.Test;

import java.io.File;
/*
* File����д�Լ������ʹ��
* */
public class FileConstructor {
    @Test
    public void Part3() {   //����һ����file�����һ�����ļ�/Ŀ¼�õ�file����
        File parent =new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass");
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }
    @Test
    public void Part2() {   //����һ��Ŀ¼һ�����ļ�/Ŀ¼�õ���file����
        String parent="I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass";
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }
    @Test
    public void Part1() {   //exists�����������ж�·���治���ڵ�
        //��ȡһ���ļ���λ�ð�װ��һ��file����
        File file1=new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass\\div.css");
        System.out.println(file1.exists());

        File file2=new File("b_file/div.css");
        System.out.println(file2.exists());

        File file3=new File("world.txt");
        System.out.println(file3.exists());
    }
}
