package a_file;

import java.io.File;
import java.io.FilenameFilter;
/*
文件名称过滤器
FilenameFilter作用
1.用于实现此接口的类的实例用于过滤文件名。
2.这些实例都用在过滤目录列表list类的方法File
3.并通过抽象窗口工具包的文件对话框组件
* */
public class FileFilter {
    public static void main(String[] args) {
        File dir = new File("E:\\图片\\Blog素材"); //获取一个File文件根目录
        System.out.println("Root directory"+dir);
        FilenameFilter fter = new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(name);
                File wj = new File(dir,name);
                return wj.isFile() && wj.getName().endsWith(".png");
            }
        };
        String [] arr = dir.list(fter);
        for (String str : arr){
            System.out.println(str);
        }
    }
}
