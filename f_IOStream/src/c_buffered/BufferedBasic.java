package c_buffered;

import org.junit.Test;

import java.io.*;
/**
 * @apiNote 缓冲流的基本使用
 * 字节流和字符流的使用体现
 * @see BufferedReader
 * @see BufferedWriter
 * @see BufferedInputStream
 * @see BufferedOutputStream
 * */
public class BufferedBasic {
    @Test
    public void rw_Copy() throws IOException {
        //1.创建字符流包装到缓冲流中
        BufferedReader br =new BufferedReader(new FileReader("hello.txt"));
        BufferedWriter bw =new BufferedWriter(new FileWriter("my.txt"));

        //2.方式一 使用char数组
        /*char[] cr = new char[5];
        int len;
        while ((len = br.read(cr)) != -1){
            bw.write(cr,0,len);
            bw.flush();//刷新缓冲区,后台会默认做无需手动实现
        }*/

        //2.方式二 使用String以及readLine方法
        String num;
        while ((num = br.readLine()) != null){
            bw.write(num+"\n");
        }

        //3.释放流(只释放外层即可)
        br.close();
        bw.close();
    }

    @Test
    public void io_Copy() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\Videos\\滑板.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("board.mp4"));

        //2.数据的读写
        byte[] bt = new byte[1024];
        int len;
        while ((len = bis.read(bt)) != -1){
            bos.write(bt,0,len);
        }

        //3.释放流(只释放外层即可)
        bis.close();
        bos.close();
    }
}
