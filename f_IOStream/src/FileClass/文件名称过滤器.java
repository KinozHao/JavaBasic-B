package FileClass;

import java.io.File;
import java.io.FilenameFilter;

public class 文件名称过滤器 {
    public static void main(String[] args) {
        File dir=new File("F:\\CSS视频"); //获取一个File文件根目录
        String [] arr=dir.list(new FilenameFilter() {
            /*FilenameFilter作用
            用于实现此接口的类的实例用于过滤文件名。
            这些实例都用在过滤目录列表list类的方法File
            并通过抽象窗口工具包的文件对话框组件*/
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(dir);
                System.out.println(name);
                File King=new File(dir,name);
                return King.isFile() && King.getName().endsWith(".txt");
            }
        });
        for (String string : arr){
            System.out.println(string);
        }
    }
}
