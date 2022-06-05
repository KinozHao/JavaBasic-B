package b_io_basic;

import java.io.*;

/**
 * @author kinoz
 * @Date 2022/6/1 - 22:14
 * @apiNote This class provide two static method
 * TestCopy and unTestCopy it mean's like it's name
 * That was the things they just can do -_- !
 * @see FileOutputStream
 * @see FileInputStream
 * @see FileReader
 * @see FileWriter
 * @version 11
 */
public class CopyMethod {
    @IOAnnotation("�ַ������ʺ϶��ı��ļ��ĸ���")
    public static void TextCopy(String beginPath,String endPath){
        FileReader fr= null;
        FileWriter fw= null;
        try {
            //1.������,����ȡ�ļ�
            fr = new FileReader(beginPath);
            //��д����ļ��ɲ����ڻ��Զ�����
            fw = new FileWriter(endPath);

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
    @IOAnnotation("�ֽ��������ڳ��ı��ļ����ļ��ĸ��Ʋ���")
    public static void unTestCopy(String beginPath,String endPath) throws IOException{
        //1.�����������ȡ�ļ�
        FileInputStream pic = new FileInputStream(beginPath);
        FileOutputStream cop = new FileOutputStream(endPath);

        //2.��ȡ����(�����ļ�ͨ������Ϊ1024���ֽ�)
        byte[] bt = new byte[1024];
        int len;
        while ((len = pic.read(bt)) != -1){
            cop.write(bt,0,len);
        }

        //3.�ͷ���
        pic.close();
        cop.close();
    }

}
