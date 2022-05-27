package a_file;

import org.junit.Test;

import java.io.File;
/*
* File类重写以及构造的使用
* */
public class FileConstructor {
    @Test
    public void Part3() {   //根据一个父file对象和一个子文件/目录得到file对象
        File parent =new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass");
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }
    @Test
    public void Part2() {   //根据一个目录一个子文件/目录得到的file对象
        String parent="I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass";
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }
    @Test
    public void Part1() {   //exists方法是用来判断路径存不存在的
        //获取一个文件的位置包装成一个file对象
        File file1=new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass\\div.css");
        System.out.println(file1.exists());

        File file2=new File("b_file/div.css");
        System.out.println(file2.exists());

        File file3=new File("world.txt");
        System.out.println(file3.exists());
    }
}
