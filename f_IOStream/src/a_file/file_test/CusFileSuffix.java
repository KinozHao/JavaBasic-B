package a_file.file_test;

import java.io.File;

/**
 * @author kinoz
 * @Date 2022/5/27 - 13:13
 * @apiNote
 * 1:获取一个file根目录文件
 * 2:定义一个数组通过File的list方法把读取到的文件赋值给数组
 */
public class CusFileSuffix {
    public static void main(String[] args) {
        //方法一 了解
        File file=new File("E:\\图片\\Blog素材");
        String[] arr = file.list();           //读取根目录下的所有文件或文件夹
        /*for (String string: arr) {
            if (string.endsWith(".avi")){
                System.out.println(string);
            }
        }*/
        //方法二 开放常用 定义一个File数组,用listFiles读取目录下的所有文件或文件夹
        File [] subFile = file.listFiles();
        for (File Gos : subFile) {
            if (Gos.isFile() && Gos.getName().endsWith(".png")){
                System.out.println(Gos);
            }
        }
    }
}
