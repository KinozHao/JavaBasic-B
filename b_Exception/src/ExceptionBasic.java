import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @author kinoz
 * @date 2022/4/21 - 10:53
 * @apiNote �������쳣������
 */
public class ExceptionBasic {
    @Test
    //���±�������Ϊ����ʱ�쳣(����throws Exception����)
    public void text7() throws Exception{
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        //�ر�����������Դ
        fis.close();
    }

    //����Ϊ����������ʱ�쳣
    @Test
    //NullPointerException
    public void test1(){
        int [] arr = null;
        System.out.println(arr[3]);
    }

    @Test
    //IndexOutOfBoundsException
    public void test2(){
        //1 ArrayIndexOutOfBoundsException
        int [] arr = new int[5];
        System.out.println(arr[5]);
        //2 StringIndexOutOfBoundsException
        String str ="abc";
        //charAt��ѯ�ַ��������һ���ַ�
        System.out.println(str.charAt(3));
    }

    @Test
    //ClassCastException
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
        System.out.println(str);
    }

    @Test
    //ArithmeticException
    public void test4(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }

    @Test
    //NumberFormatException
    public void test5(){
        String str1 = "abc";
        int num = Integer.parseInt(str1);
        System.out.println(num);
    }

    @Test
    //InputMismatchException
    public void test6(){
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        sc.close();
    }

}
