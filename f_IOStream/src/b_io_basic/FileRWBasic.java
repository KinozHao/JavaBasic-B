package b_io_basic;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * �ַ���(�ڵ���)
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote Reader��Writer��ʹ��
 * @see FileReader
 * @see FileWriter
 */
public class FileRWBasic {
    @Test
   public void Reader_Test() {
        FileReader fr = null;
        try {
            //1:�ṩFile����
            File file = new File("accessData.txt");
            //2:�ṩ�������File����
            fr = new FileReader(file);

            //3.���ݵĶ���
            //read()���ض����һ���ַ��������ȡ��ϣ�����-1
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
        }catch (IOException E){
            E.printStackTrace();
        }finally {
            //4.�����ͷŲ���
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void Reader_Improve(){
        FileReader fr = null;
        try {
            //1.�ṩfile����
            File file = new File("accessData.txt");
            //2.�ṩ����file������в���
            fr = new FileReader(file);

            //3.cbuf������ÿ�ζ�ȡ�ַ�������
            char[] cbuf = new char[5];
            //len�����ۼ�
            int len;
            while ((len = fr.read(cbuf)) != -1){
                //����д������ӡֵ
                /*for (int i = 0; i < cbuf.length; i++) {
                    System.out.println(cbuf[i]);
                }*/
                for (int i = 0; i < len; i++) {
                    //System.out.print(cbuf[i]);
                }
                //д���� ʹ��String�Ĺ�����
                String s = new String(cbuf, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //4.�ر���
                if (fr != null)
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /*
    * д��������ļ������ڻ�Ĭ�ϰ��ļ���������
    * ���ļ����ڣ�������append����Ϊtrue����׷��
    * ��Ϊfalse���Ǹ���ԭ������
    * */
    @Test
    public void Writer_Test() throws IOException {
        File file = new File(   "accessData.txt");
        //append����Ϊtrue������� Ϊfalse����ԭ������
        FileWriter fw =new FileWriter(file,true);
        fw.write("zh:����һ��txt���͵��ļ�\n");
        fw.write("en:this is a file end with .txt\n");
        fw.close();
    }
}
