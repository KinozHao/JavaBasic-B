package b_byte;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FISBasic {
    @Test
    public void Write_one() throws IOException{    //可能读取文件有异常 抛出一下
        FileInputStream file = new FileInputStream("a.txt");
        int x = file.read();        //read方法从该输入流中读取一个字节的数据
        System.out.println(x);
        int y = file.read();
        System.out.println(y);
        int z = file.read();
        System.out.println(z);
        int o = file.read();        //如果读取的字节数据不存在 就输出-1了
        System.out.println(o);
    }

    @Test
    public void Write_two() throws IOException{
        FileInputStream Files = new FileInputStream("a.txt");
        //one相当于第一种方法中的x y z
        int one;
        //循环判断如果读取的字节数据不为-1就执行
        while ((one=Files.read()) != -1){
            System.out.println(one);
        }
    }
}
