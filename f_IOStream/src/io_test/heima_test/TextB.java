package io_test.heima_test;

//拷贝文件
import java.io.*;
import java.util.Scanner;

public class TextB {
    public static void main(String[] args) throws IOException {
        File file =method();    //调用方法
        //下面为io核心代码
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file.getName()));
        int len;
        while ((len = bis.read()) !=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();

    }
    public static File method(){
        Scanner sc=new Scanner(System.in);  //创建键盘录入对象
        System.out.println("请输入要拷贝的文件:");   //提示
        while (true) {
            String line=sc.nextLine();      //接受键盘录入的路径
            File file=new File(line);       //封装为file对象并且做判断
            if (!file.exists()){
                System.out.println("录入目标无效");
            }else if (file.isDirectory()){
                System.out.println("录入的是一个文件夹");
            }else {
                return file;
            }
        }
    }
}
