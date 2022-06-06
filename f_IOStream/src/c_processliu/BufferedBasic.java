package c_processliu;

import org.junit.Test;

import java.io.*;
/**
 * @apiNote ������һ:������
 * �ֽ������ַ�����ʹ������
 * @see BufferedReader
 * @see BufferedWriter
 * @see BufferedInputStream
 * @see BufferedOutputStream
 * */
public class BufferedBasic {
    @Test
    public void rw_Copy() throws IOException {
        //1.�����ַ�����װ����������
        BufferedReader br =new BufferedReader(new FileReader("accessData.txt"));
        BufferedWriter bw =new BufferedWriter(new FileWriter("my.txt"));

        //2.��ʽһ ʹ��char����
        /*char[] cr = new char[5];
        int len;
        while ((len = br.read(cr)) != -1){
            bw.write(cr,0,len);
            bw.flush();//ˢ�»�����,��̨��Ĭ���������ֶ�ʵ��
        }*/

        //2.��ʽ�� ʹ��String�Լ�readLine����
        String num;
        while ((num = br.readLine()) != null){
            bw.write(num+"\n");
        }

        //3.�ͷ���(ֻ�ͷ���㼴��)
        br.close();
        bw.close();
    }

    @Test
    public void io_Copy() throws IOException {
        //1.�����ַ�����װ����������
        FileInputStream origin = new FileInputStream("E:\\Videos\\����.mp4");
        FileOutputStream after = new FileOutputStream("board.mp4");
        BufferedInputStream bis = new BufferedInputStream(origin);
        BufferedOutputStream bos = new BufferedOutputStream(after);

        //2.���ݵĶ�д
        byte[] bt = new byte[1024];
        int len;
        while ((len = bis.read(bt)) != -1){
            bos.write(bt,0,len);
        }

        //3.�ͷ���(ֻ�ͷ���㼴��)
        bis.close();
        bos.close();
    }
}
