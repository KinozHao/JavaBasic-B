package FileClass;

import java.io.File;

public class FileClassOverviewAndConstruction {
    public static void main(String[] args) {
        System.out.println("The first part");
        Part1();
        System.out.println("The second part");
        Part2();
        System.out.println("The third part");
        Part3();
    }

    private static void Part3() {   //����һ����file�����һ�����ļ�/Ŀ¼�õ�file����
        File parent =new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass");
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }

    private static void Part2() {   //����һ��Ŀ¼һ�����ļ�/Ŀ¼�õ���file����
        String parent="I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass";
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }

    private static void Part1() {   //exists�����������ж�·���治���ڵ�
        //��ȡһ���ļ���λ�ð�װ��һ��file����
        File file1=new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass\\div.css");
        System.out.println(file1.exists());

        File file2=new File("FileClass/div.css");
        System.out.println(file2.exists());

        File file3=new File("world.txt");
        System.out.println(file3.exists());
    }
}
