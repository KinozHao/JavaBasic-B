package a_file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author kinoz
 * @Date 2022/5/30 - 13:48
 * @apiNote File类的常用方法
 * @see File
 */
public class FileMethod {
    @Test
    public void file_Get() {
        File files = new File("accessData.txt");

        System.out.println("绝对路径"+files.getAbsolutePath());

        System.out.println("相对路径"+files.getPath());

        System.out.println("文件名字"+files.getName());

        System.out.println("文件字符串长度"+files.length());

        System.out.println("文件的最后修改时间"+new Date(files.lastModified()));

        //把文件重命名为指定的路径文件
        //需保证file1存在 file2不存在
        File file1 = new File("hello.txt");
        File file2 = new File("E:\\JavaCode\\SEImprove\\f_IOStream\\b.txt");
        System.out.println(file1.renameTo(file2));

        //删除方法不走回收站
        System.out.println(file2.delete());
    }

    @Test
    public void file_Make() throws IOException{
        File file = new File("E:\\JavaCode\\SEImprove\\LiuData\\InnerData");
        boolean mkdirs = file.mkdirs();
        if (mkdirs){
            System.out.println("创建成功");
        }
        File file1 = new File("E:\\JavaCode\\SEImprove\\Singles");
        boolean mkdir = file1.mkdir();
        if (mkdir == true){
            System.out.println("创建成功");
        }else {
            System.out.println("文件夹已经存在");
        }
    }

    @Test
    public void file_Judge() throws IOException {
        File file = new File("accessData.txt");
        //创建a.txt文件
        System.out.println(file.createNewFile());
        //判断是不是个文件夹
        System.out.println(file.isDirectory());
        //判断是不是个文件
        System.out.println(file.isFile());
        //判断是否存在
        System.out.println(file.exists());

    }
    @Test
    public void file_RW(){
        File file1 = new File("accessData.txt");
        //设置为不可读
        file1.setReadable(false);
        System.out.println("是否可读"+file1.canRead());

        //设置不可写
        file1.setWritable(true);
        System.out.println("是否可写"+file1.canWrite());

        System.out.println("是否隐藏"+file1.isHidden());
    }
}
