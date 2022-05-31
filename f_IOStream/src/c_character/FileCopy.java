package c_character;

import org.junit.Test;

import java.io.*;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote ���ļ����и��Ʋ���
 * @see FileReader
 * @see FileWriter
 */
public class FileCopy {
    @Test
    public void Copy_A(){
        FileReader fr= null;
        FileWriter fw= null;
        try {
            //1.������,����ȡ�ļ�
            fr = new FileReader("a.txt");
            fw = new FileWriter("b.txt");

            //2.���ݶ�д����
            char[] cr = new char[5];
            int len;   //��¼ÿ�ζ��뵽cbuf�����е��ַ�����
            while ((len=fr.read(cr)) !=-1){
                //ÿ��д��len���ַ�
                fw.write(cr,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //3.�ر�������
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
