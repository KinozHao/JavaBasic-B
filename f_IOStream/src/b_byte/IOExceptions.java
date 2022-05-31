package b_byte;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author kinoz
 * @Date 2022/5/30 - 13:48
 * @apiNote 关于IO流异常 JDK6/7的区别
 * @see FileInputStream
 * @see FileOutputStream
 */
public class IOExceptions{
    @Test
    public void Exception_Seven() throws IOException {
        try(    //close没有写 因为自动调用了close方法 可以查看输出或者输入流的源码
                FileInputStream fis =new FileInputStream("a.txt");
                FileOutputStream fos=new FileOutputStream("b.txt");
                MyIO mo = new MyIO();   //自定义类可以输出因为实现了AutoCloseable接口
        ){
            int flag;
            while ((flag = fis.read()) != -1){
                fos.write(flag);
            }
        }
    }
    @Test
    public void Exception_Six() throws IOException{
        //必须初始化，否则无法关闭流
        FileInputStream FIS =null;
        FileOutputStream FOS =null;
        try {
          new FileInputStream("xxx.txt");   //读取文件
          new FileOutputStream("copy.txt");

            int b;
            while ((b = FIS.read()) != -1) {
                FOS.write(b);
            }
        }finally {
            try {       //这样做的目的就是如果出问题尽量能关一个是一个
                if (FIS != null)
                    FIS.close();
            }finally {
                if (FOS != null)
                    FOS.close();
            }
        }
    }


}
class MyIO implements AutoCloseable{
    @Override
    public void close(){
        System.out.println("自动关闭流");
    }
}