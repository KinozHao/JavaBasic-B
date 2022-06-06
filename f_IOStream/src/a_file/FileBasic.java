package a_file;

import org.junit.Test;

import java.io.*;

/**
 * @see File
 * @apiNote File类的三种实例方式
 * Linux分隔符"/"
 * Windows分隔符"\\"
 * */
public class FileBasic {
    public static void main(String[] args) throws IOException {
        //此常量用于跨平台，具体看看源码
        System.out.println(File.separator);

        //实例化1
        File file = new File("word.txt");  //相对路径
        File file2 = new File("E:\\JavaCode\\SEImprove\\f_IOStream\\hello.txt");  //绝对路径
        System.out.println(file);
        System.out.println(file2);
        //实例化2
        File dir1 = new File("E:\\JavaCode\\SEImprove", "MyDir");
        System.out.println(dir1);
        //实例化3
        File dirs = new File(dir1, "hello world");
        System.out.println(dirs);
    }
}
