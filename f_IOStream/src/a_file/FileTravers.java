package a_file;

import java.io.File;

/**
 * @author kinoz
 * @Date 2022/5/30 - 13:48
 * @apiNote File遍历 即批量读取目录下数据
 */
public class FileTravers {
    public static void main(String[] args) {
        //相对路径读取
        File file = new File("E:\\图片\\Blog素材");
        String[] arr = file.list();
        /*for (String string: arr) {
            if (string.endsWith(".avi")){
                System.out.println(string);
            }
        }*/

        //绝对路径读取
        File [] subFile = file.listFiles();
        //2.对此File[]遍历,获取全部文件
        for (File files : subFile) {
            //3.只读取以.png结尾的数据
            if (files.isFile() && files.getName().endsWith(".png")){
                System.out.println(files);
            }
        }
    }
}
