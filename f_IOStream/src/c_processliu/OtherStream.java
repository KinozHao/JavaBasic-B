package c_processliu;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * @author kinoz
 * @Date 2022/6/4 - 15:03
 * @apiNote ����������ʹ��
 * 1.��׼���������
 * 2.��ӡ��
 * 3.������
 */
public class OtherStream {
    public static void main(String[] args) throws IOException {
        //��׼���������
        //1.ͨ��ת������������������ֽ�ת��Ϊ�ַ�
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader brr = new BufferedReader(isr);

        while (true){
            System.out.print("��������:");
            //2.���ж�ȡ����
            String data = brr.readLine();
            //3.��������Ϊe/exitʱ ֹͣѭ��(�Һ��Դ�Сд)
            if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                System.out.println("�������");
                break;
            }
            //3.ÿ�ζ��������ݽ�����ĸ��д��
            System.out.println(data.toUpperCase());
        }

        //4.�ر���
        brr.close();
    }

    //������
    @Test
    public void data_Stream() throws  IOException{
        //1.����������,��ָ��д���ļ�λ��
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("datastream.txt"));
        //2.���д��������
        dos.writeUTF("Toms");
        //flush�����൱�����
        dos.flush();
        dos.writeInt(20);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();

        //3.�����ͷ�
        dos.close();
    }
    @Test
    public void data_StreamII() throws  IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("datastream.txt"));

        String s = dis.readUTF();
        System.out.println(s);
    }
}
