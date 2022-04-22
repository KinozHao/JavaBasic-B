package throwsus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author kinoz
 * @date 2022/4/22 - 10:12
 * @apiNote throws的具体使用，相当于甩锅，解决不了的问题一直往上抛
 */
public class ThrowsBasic {

    public static void main(String[] args) {
        //甩到main方法就没法甩了必须做出处理
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("可能文件的路径存在一定问题");
        }
    }

    //method2接盘method1发现没救继续甩锅
    public static void method2() throws IOException{
        method1();
    }


    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("b_Exception/hello.txt");
        //读取我们创建文件的信息
        FileInputStream fis = new FileInputStream(file);
        //获取信息
        int data = fis.read();
        while (data != -1) {
            //把int类型转换为char字符
            System.out.print((char) data);
            //输出流
            data = fis.read();
        }
        fis.close();

    }
}
