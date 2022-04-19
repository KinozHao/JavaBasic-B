package FileClass.Features;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetFeatures {
    public static void main(String[] args) {
        System.out.println("PartA:---->>>>>>>>");
        Demo1();
        System.out.println("PartB:---->>>>>>>>");
        File dir=new File("I:\\学习视频\\Java基础");
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
        System.out.println("获取绝对路径"+s.getAbsolutePath());    //获取绝对路径
        System.out.println("获取绝对路径"+s.getAbsolutePath());

        System.out.println("获取构造方法传入的路径"+s.getPath());            //获取构造方法传入的路径
        System.out.println("获取构造方法传入的路径"+b.getPath());

        System.out.println("获取文件或者文件夹的名字"+s.getName());              //获取文件或者文件夹的名字
        System.out.println("获取文件或者文件夹的名字"+b.getName());
        System.out.println("获取文件字符串长度"+s.length());              //获取文件字符串长度

        Date d=new Date(s.lastModified());          //获取文件的最后修改时间
        SimpleDateFormat sj=new SimpleDateFormat("yyy年:MM月:dd日:HH:mm:ss");
        System.out.println(sj.format(d));
    }
}
