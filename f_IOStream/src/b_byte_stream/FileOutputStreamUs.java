package b_byte_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamUs {
    public static void main(String[] args) throws IOException {
        First();
        //�����Ҫ��д�Ļ���Ҫ��FileOutputStream�����������true��ʾ��Ҫ�������
        FileOutputStream fos2=new FileOutputStream("b.txt",true);
        fos2.write(102);
        fos2.write(103);
        fos2.write(104);

        fos2.close();
    }

    private static void First() throws IOException {
        FileOutputStream fos=new FileOutputStream("b.txt"); //�����ֽ����������,��û�оͻ��Զ�����һ��
      /*  fos.write(97);  //д��Ϊһ��int��ֵ �����ļ�����ᴴ���ַ�,�Զ�ȥ��ǰ����8λ
        fos.write(98);
        fos.write(99);
        fos.write(100);*/
        fos.write(101);
        fos.close();    //����ǵùر����ͷ��ڴ�
    }
}
