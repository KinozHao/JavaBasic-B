package FileClass.Features;

import java.io.File;
import java.io.IOException;

public class RenameAndDeleteFeatures {
    public static void main(String[] args) throws IOException {
        File a=new File("Go.txt");
        File b=new File("Java.txt");
        System.out.println(a.renameTo(b));  //路径相同的情况下,进行换名,如果不同就是剪贴和改名

        File c=new File("china.txt");
        //慎重使用delete功能 因为delete功能的删除不走回收站,一旦删除就很难找回来
        System.out.println(c.delete());     //delete用来删除文件 删除文件夹要保证文件夹为空里面没有东西

    }
}
