package FileClass;

import java.io.File;
/*
*1:获取一个file根目录文件
2:定义一个数组通过File的list方法把读取到的文件赋值给数组
3:<1>做法1 只作为了解多用方法2
后期开发用的多
 <2>做法2定义一个File数组,用listFiles读取目录下的所有文件或文件夹
* */
public class 输出指定目录下指定后缀的文件名 {
    public static void main(String[] args) {
        File file=new File("F:\\CSS视频");
        String[] arr=file.list();           //读取根目录下的所有文件或文件夹
        /*for (String string: arr) {
            if (string.endsWith(".avi")){
                System.out.println(string);
            }
        }*/
        File [] subFile=file.listFiles();   //读取根目录下的所有文件或文件夹
        for (File Gos : subFile) {
            if (Gos.isFile() && Gos.getName().endsWith(".avi")){
                System.out.println(Gos);
            }
        }
    }
}
