package b_byte;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamUs {
    public static void main(String[] args) throws IOException {
        System.out.println("第一种基础写法");
        MethodOne();
        System.out.println("第二种循环写法");
        FileInputStream Files = new FileInputStream("a.txt");
        int one;            //one相当于第一种方法中的x y z
        while ((one=Files.read()) != -1){   //循环判断如果读取的字节数据不为-1就执行
            System.out.println(one);
        }
    }

    private static void MethodOne() throws IOException {    //可能读取文件有异常 抛出一下
        FileInputStream file = new FileInputStream("a.txt");    //创建流文件
        int x = file.read();        //read方法从该输入流中读取一个字节的数据
        System.out.println(x);
        int y = file.read();
        System.out.println(y);
        int z = file.read();
        System.out.println(z);
        int o = file.read();        //如果读取的字节数据不存在 就输出-1了
        System.out.println(o);
    }
}
