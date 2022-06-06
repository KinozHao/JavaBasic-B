package b_io_basic;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * �ֽ���(�ڵ���)
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote FileInputStream��FileOutputStream��ʹ��
 * @see FileInputStream
 * @see FileOutputStream
 */
public class FileIOBasic {
    @Test
    //�����о���ʹ��tryCatch��֤�����Թر�
    public void unText_Copy() throws IOException{
        //1.�����������ȡ�ļ�
        FileInputStream lyo = new FileInputStream("accessData.txt");

        //2.��ȡ����
        byte[] bt = new byte[20];
        int len;
        //ѭ���ж������ȡ���ֽ����ݲ�Ϊ-1��ִ��
        while ((len=lyo.read(bt)) != -1){
            //���Ϊ����
            /*for (int i = 0; i < len; i++) {
                System.out.print(bt[i]+" ");
            }*/
            //���Ϊ�ַ�
            String s = new String(bt, 0, len);
            System.out.println(s);
        }

        //3.�ͷ���
        lyo.close();
    }

    @Test
    //��CopyMethod������Ĳ���
    public void CMD_Test() throws IOException {
        CopyMethod.TextCopy("accessData.txt","b.txt");
        CopyMethod.unTestCopy("E:\\Videos\\����.mp4","bd.mp4");
    }
}
