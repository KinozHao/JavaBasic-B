package trycatch_us;


import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**@apiNote  tryCatch在代码中的具体体现
*
* */

public class TryCatchBasic {
    @Test
    //运行时异常体会
    public void method1(){
        String str1 = "abc";
        try {
            int num = Integer.parseInt(str1);
            System.out.println(num);
        }catch (NumberFormatException e){
            //1：返回异常类名异常信息,以及异常信息出现的位置.返回值为void
            //e.printStackTrace();
            //2：获取异常信息,返回字符串
            System.out.println(e.getMessage());
        }catch (Exception e){

        }
    }

    @Test
    //编译时异常体会
    public void method2(){
        try {
            File fils = new File("hello.txt");
            FileInputStream fis = new FileInputStream(fils);
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            //关闭流，回收资源
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("编译出现异常，可能传递流文件不存在。");
        }
    }
}
