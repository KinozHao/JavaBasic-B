package c_processliu;

import org.junit.Test;

import java.io.*;

/**
 * @author kinoz
 * @Date 2022/6/4 - 14:07
 * @apiNote ��������:ת����
 */
public class TransformBasic {
    @Test
    public void file_Convert() throws IOException {
        //�൱�ڽ���Ĳ���
        //InputStreamReader���ֽ�ת��Ϊ�ַ�
        //1.��ȡ������,��ӽ�ת������
        FileInputStream files = new FileInputStream("hello.txt");
        //����ָ���ַ���ʽΪgbk,Ҳ���Բ�д��ΪĬ��
        InputStreamReader isr = new InputStreamReader(files,"gbk");

        //2.��ȡ����
        int len;
        char[] cr = new char[10];
        while ((len = isr.read(cr)) != -1){
            //ͨ��String������ͨ������̨��ӡ
            String data = new String(cr, 0, len);
            System.out.print(data);
        }
        //3.�ر���
        isr.close();
    }

    @Test
    public void file_ConvertII() throws IOException{
        //�൱�ڱ������
        //1.����ת�����Լ������� ȷ��ת�����ַ���
        FileInputStream origin = new FileInputStream("my.txt");
        FileOutputStream after = new FileOutputStream("my_utf8.txt");
        InputStreamReader gbk = new InputStreamReader(origin, "gbk");
        OutputStreamWriter utf = new OutputStreamWriter(after, "utf-8");

        //2.���ݶ�д����
        int len;
        char[] cr = new char[10];
        while ((len = gbk.read(cr)) != -1){
            utf.write(cr,0,len);
        }

        //3.�ر���
        gbk.close();
        utf.close();
    }
}
