package b_byte_stream.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//�˷�������С���ļ���copy ������͵��ļ���copy���� ��Ϊ������ֽڽ���copy��
public class CopyIOSteamCore {
    public static void main(String[] args) throws IOException {
        //��������������
        FileInputStream fis=new FileInputStream("I:\\CodeProject\\JavaIntermedate\\picture.png");
        //�������������
        FileOutputStream fos=new FileOutputStream("I:\\CodeProject\\JavaIntermedate\\copy.png");
        int i;
        while ((i=fis.read()) != -1){       //���ϵĶ�ȡÿһ���ֽ�
            fos.write(i);                   //д��ÿһ���ֽ�
        }
        fis.close();                        //����֮��ǵùر��� �ͷ���Դ
        fos.close();
    }
}
