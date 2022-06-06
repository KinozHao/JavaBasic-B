package b_io_basic;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 字节流(节点流)
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote FileInputStream和FileOutputStream的使用
 * @see FileInputStream
 * @see FileOutputStream
 */
public class FileIOBasic {
    @Test
    //开发中尽量使用tryCatch保证流可以关闭
    public void unText_Copy() throws IOException{
        //1.创建流对象获取文件
        FileInputStream lyo = new FileInputStream("accessData.txt");

        //2.读取数据
        byte[] bt = new byte[20];
        int len;
        //循环判断如果读取的字节数据不为-1就执行
        while ((len=lyo.read(bt)) != -1){
            //输出为数组
            /*for (int i = 0; i < len; i++) {
                System.out.print(bt[i]+" ");
            }*/
            //输出为字符
            String s = new String(bt, 0, len);
            System.out.println(s);
        }

        //3.释放流
        lyo.close();
    }

    @Test
    //对CopyMethod功能类的测试
    public void CMD_Test() throws IOException {
        CopyMethod.TextCopy("accessData.txt","b.txt");
        CopyMethod.unTestCopy("E:\\Videos\\滑板.mp4","bd.mp4");
    }
}
