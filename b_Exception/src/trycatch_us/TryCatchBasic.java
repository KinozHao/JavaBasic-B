package trycatch_us;


import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**@apiNote  tryCatch�ڴ����еľ�������
*
* */

public class TryCatchBasic {
    @Test
    //����ʱ�쳣���
    public void method1(){
        String str1 = "abc";
        try {
            int num = Integer.parseInt(str1);
            System.out.println(num);
        }catch (NumberFormatException e){
            //1�������쳣�����쳣��Ϣ,�Լ��쳣��Ϣ���ֵ�λ��.����ֵΪvoid
            //e.printStackTrace();
            //2����ȡ�쳣��Ϣ,�����ַ���
            System.out.println(e.getMessage());
        }catch (Exception e){

        }
    }

    @Test
    //����ʱ�쳣���
    public void method2(){
        try {
            File fils = new File("hello.txt");
            FileInputStream fis = new FileInputStream(fils);
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            //�ر�����������Դ
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("��������쳣�����ܴ������ļ������ڡ�");
        }
    }
}
