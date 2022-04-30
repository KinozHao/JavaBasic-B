package trycatch_us;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author kinoz
 * @date 2022/4/21 - 21:01
 * @apiNote finally�ؼ����ڴ����еľ���ʹ��
 */
public class FinallyUs {

    @Test
    public void methodOne() {

        int[] arr = {1, 234, 35};
        try {
            System.out.println(arr[5]);
            //System.exit(0);   �������������Ͳ������finally���� ֱ�ӽ���jvm
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
                System.out.println("finally�µľ��ӱ���ִ�г����������");
            }
        }
    }

    @Test
    public void methodTwo(){
        int num = exceptionMethod();
        System.out.println(num);
    }

    @Test
    //����ʱ�쳣finally������
    public void methodThree(){
        //����Ҫ�õ�ʱ��Ҫ������г�ʼ��
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            //��ȡ���Ǵ����ļ�����Ϣ
            fis = new FileInputStream(file);
            //��ȡ��Ϣ
            int data = fis.read();
            while (data != -1) {
                //��int����ת��Ϊchar�ַ�
                System.out.print((char) data);
                //�����
                data = fis.read();
            }
        } catch (IOException e) {
            //��ӡ�쳣��Ϣ
            e.printStackTrace();
            System.out.println("�����ļ���·������һ�����⡣");
        } finally {
            try {
                //if���ж���Ϊ���Է��ͷ���ʱ���ٴγ���IO�쳣
                if (fis != null)
                    //�ͷ�����������Դ
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
            System.out.println("finallyִ����");
            return 3;
        }

    }
}

