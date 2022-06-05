package c_processliu;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * @author kinoz
 * @Date 2022/6/4 - 15:03
 * @apiNote 其他处理流使用
 * 1.标准输入输出流
 * 2.打印流
 * 3.数据流
 */
public class OtherStream {
    public static void main(String[] args) throws IOException {
        //标准输入输出流
        //1.通过转换流把输入的数据由字节转换为字符
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader brr = new BufferedReader(isr);

        while (true){
            System.out.print("输入数据:");
            //2.整行读取数据
            String data = brr.readLine();
            //3.输入数据为e/exit时 停止循环(且忽略大小写)
            if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                System.out.println("程序结束");
                break;
            }
            //3.每次对输入数据进行字母大写化
            System.out.println(data.toUpperCase());
        }

        //4.关闭流
        brr.close();
    }

    //数据流
    @Test
    public void data_Stream() throws  IOException{
        //1.创建数据流,并指定写出文件位置
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("datastream.txt"));
        //2.添加写出的数据
        dos.writeUTF("Toms");
        //flush方法相当于添加
        dos.flush();
        dos.writeInt(20);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();

        //3.流的释放
        dos.close();
    }
    @Test
    public void data_StreamII() throws  IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("datastream.txt"));

        String s = dis.readUTF();
        System.out.println(s);
    }
}
