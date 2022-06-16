package c_processliu;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.*;

/**
 * @author kinoz
 * @Date 2022/6/6 - 21:13
 * @apiNote RandomAccessFile��ʹ��
 * ���༴����Ϊ��Ҳ����Ϊд ͨ���������ڶ�����������
 * r rw rwd rws����
 */
public class RAF {
    @Test
    public void raf_test() throws IOException {
        //1.����������,�����ļ�
        File fl = new File("1.jpg");
        File nfl = new File("2.jpg");
        RandomAccessFile raf = new RandomAccessFile(fl,"r");
        RandomAccessFile rag = new RandomAccessFile(nfl,"rw");

        //2.��д
        byte[] bytes = new byte[1024];
        int len;
        while ((len = raf.read(bytes)) != -1){
            rag.write(bytes,0,len);
        }
        //3.�ͷ���
        raf.close();
        rag.close();
    }
    @Test//��ԭ�ļ���ͷ�����ֽڸ���
    public void rafII_test() throws IOException{
        RandomAccessFile acs = new RandomAccessFile(new File("accessData.txt"), "rw");
        //ָ�����λ�ý��в���
        acs.seek(3);
        acs.write("chinaNumberOne".getBytes());

        acs.close();
    }
    @Test
    public void rafIV_test() throws IOException{
        RandomAccessFile acs = new RandomAccessFile(new File("accessData.txt"), "rw");
        acs.seek(2);//ָ���������Ϊ2��λ��
        //ָ������������ݴ���Sb��(sbr�ĳ�ʼ����ΪFile��ĳ���)
        StringBuffer sbr = new StringBuffer((int) new File("accessData.txt").length());

        byte[] bt = new byte[20];
        int len;
        while ((len = acs.read(bt)) != -1){
            sbr.append(new String(bt,0,len));
        }

        //����ָ�룬д���������
        acs.seek(2);
        acs.write("��������".getBytes());

        //�ٰѴ���Sb�е�����д��ȥ
        acs.write(sbr.toString().getBytes());

        acs.close();
    }
}
