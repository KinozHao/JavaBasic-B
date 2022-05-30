package b_byte;

import java.io.*;
/*
* flush
* 具有刷新功能读取完之后还能写
* close
* 具有刷新功能,再关闭流之前,就会先刷新一次缓冲区,将缓冲区的字节文件全部刷新到文件上
* 再关闭,close方法刷新玩之后就不能写了
* */
public class IOMethod {
    public static void main(String[] args) throws IOException {
    File F = new File("xxx.txt");

    System.out.println(F.createNewFile());

    FileInputStream fis=new FileInputStream("xxx.txt");
    FileOutputStream fos=new FileOutputStream("copy.txt");

    BufferedInputStream bis=new BufferedInputStream(fis);
    BufferedOutputStream bos=new BufferedOutputStream(fos);

    int data;
    while ((data = bis.read()) !=-1){
        bos.write(data);
//        bos.flush();  没读取以后还能继续写
//        bos.close();  读取一次就直接关闭流了写不了
    }
    bis.close();
    bos.close();
    }
}

