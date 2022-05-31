package io_test;
//录入数据拷贝到文件
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TextC {
    public static void main(String[] args) throws IOException {
        //创建键盘录入对象
        Scanner sc=new Scanner(System.in);
        //创建输出流对象,关联xxx.txt文件
        FileOutputStream bos=new FileOutputStream("xxx.txt");
        //定义无限循环
        while (true){
            String line =sc.nextLine(); //录入数据存放
            //遇到quit就推出
            if ("quit".equals(line)){
                break;
            }
            bos.write(line.getBytes()); //写出必须是字节格式
            bos.write("\r\n".getBytes());
        }
        bos.close();    //流关闭
    }
}
