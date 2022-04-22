package throwsus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author kinoz
 * @date 2022/4/22 - 10:12
 * @apiNote throws�ľ���ʹ�ã��൱��˦����������˵�����һֱ������
 */
public class ThrowsBasic {

    public static void main(String[] args) {
        //˦��main������û��˦�˱�����������
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("�����ļ���·������һ������");
        }
    }

    //method2����method1����û�ȼ���˦��
    public static void method2() throws IOException{
        method1();
    }


    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("b_Exception/hello.txt");
        //��ȡ���Ǵ����ļ�����Ϣ
        FileInputStream fis = new FileInputStream(file);
        //��ȡ��Ϣ
        int data = fis.read();
        while (data != -1) {
            //��int����ת��Ϊchar�ַ�
            System.out.print((char) data);
            //�����
            data = fis.read();
        }
        fis.close();

    }
}
