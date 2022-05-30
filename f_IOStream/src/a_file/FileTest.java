package a_file;

import java.io.File;

/**
 * @author kinoz
 * @Date 2022/5/30 - 14:38
 * @apiNote 获取指定路径下所有文件，包括子目录内文件
 */
public class FileTest {
    public static void main(String[] args) {
        File dir = new File("E:\\图片\\Blog素材");
        printSubFile(dir);
    }

    //递归嵌套
    public static void printSubFile(File dir){
        //打印目录子文件
        File[] files = dir.listFiles();
        for (File f : files){
            if (f.isDirectory()){  //判断是不是目录
                //是目录继续递归
                printSubFile(f);
            }else { //是文件就输出
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
