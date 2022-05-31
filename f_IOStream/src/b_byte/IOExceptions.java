package b_byte;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author kinoz
 * @Date 2022/5/30 - 13:48
 * @apiNote ����IO���쳣 JDK6/7������
 * @see FileInputStream
 * @see FileOutputStream
 */
public class IOExceptions{
    @Test
    public void Exception_Seven() throws IOException {
        try(    //closeû��д ��Ϊ�Զ�������close���� ���Բ鿴���������������Դ��
                FileInputStream fis =new FileInputStream("a.txt");
                FileOutputStream fos=new FileOutputStream("b.txt");
                MyIO mo = new MyIO();   //�Զ�������������Ϊʵ����AutoCloseable�ӿ�
        ){
            int flag;
            while ((flag = fis.read()) != -1){
                fos.write(flag);
            }
        }
    }
    @Test
    public void Exception_Six() throws IOException{
        //�����ʼ���������޷��ر���
        FileInputStream FIS =null;
        FileOutputStream FOS =null;
        try {
          new FileInputStream("xxx.txt");   //��ȡ�ļ�
          new FileOutputStream("copy.txt");

            int b;
            while ((b = FIS.read()) != -1) {
                FOS.write(b);
            }
        }finally {
            try {       //��������Ŀ�ľ�����������⾡���ܹ�һ����һ��
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
        System.out.println("�Զ��ر���");
    }
}