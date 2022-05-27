package a_file;

import java.io.File;
import java.io.IOException;

public class JudgeFeatures {
    public static void main(String[] args) throws IOException {
        System.out.println("Part1>>>>>>");
        JudgeDirectoryOrFile();
        System.out.println("Part2>>>>>>");
        File a=new File("a.txt");
        a.setReadable(false);   //设置为不可读
        System.out.println("可不可读?"+a.canRead());    //windows default all of the document can read
        a.setWritable(false);   //设置不可写
        System.out.println("可不可写?"+a.canWrite());   //windows can setting dontWrite

        File b=new File("I:\\CodeProject\\wenjian");
        System.out.println("是不是藏起来了?"+b.isHidden());
    }

    private static void JudgeDirectoryOrFile() {
        File a=new File("a.txt");   //把a.txt封装为a对象
        File b=new File("wenjian");
        //判断是不是一个根目录文件
        System.out.println(b.isDirectory());
        System.out.println(a.isDirectory());
        //判断是不是一个文件
        System.out.println(a.isFile());
    }
}
