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

    private static void Part3() {   //根据一个父file对象和一个子文件/目录得到file对象
        File parent =new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass");
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }

    private static void Part2() {   //根据一个目录一个子文件/目录得到的file对象
        String parent="I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass";
        String child="div.css";
        File file=new File(parent,child);
        System.out.println(file.exists());
    }

    private static void Part1() {   //exists方法是用来判断路径存不存在的
        //获取一个文件的位置包装成一个file对象
        File file1=new File("I:\\CodeProject\\JavaIntermedate\\Day19Expection\\src\\FileClass\\div.css");
        System.out.println(file1.exists());

        File file2=new File("FileClass/div.css");
        System.out.println(file2.exists());

        File file3=new File("world.txt");
        System.out.println(file3.exists());
    }
}
