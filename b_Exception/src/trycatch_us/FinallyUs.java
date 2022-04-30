package trycatch_us;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author kinoz
 * @date 2022/4/21 - 21:01
 * @apiNote finally关键词在代码中的具体使用
 */
public class FinallyUs {

    @Test
    public void methodOne() {

        int[] arr = {1, 234, 35};
        try {
            System.out.println(arr[5]);
            //System.exit(0);   如果用了这个语句就不会出现finally语句的 直接结束jvm
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("finally下的句子必须执行除非特殊情况");
            }
        }
    }

    @Test
    public void methodTwo(){
        int num = exceptionMethod();
        System.out.println(num);
    }

    @Test
    //编译时异常finally的体现
    public void methodThree(){
        //都需要用的时候要把类进行初始化
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            //读取我们创建文件的信息
            fis = new FileInputStream(file);
            //获取信息
            int data = fis.read();
            while (data != -1) {
                //把int类型转换为char字符
                System.out.print((char) data);
                //输出流
                data = fis.read();
            }
        } catch (IOException e) {
            //打印异常信息
            e.printStackTrace();
            System.out.println("可能文件的路径存在一定问题。");
        } finally {
            try {
                //if的判断是为了以防释放流时候，再次出现IO异常
                if (fis != null)
                    //释放流，回收资源
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int exceptionMethod(){
        int [] arr = new int[4];
        try {
            System.out.println(arr[5]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return 2;
        }finally {
            System.out.println("finally执行体");
            return 3;
        }

    }
}

