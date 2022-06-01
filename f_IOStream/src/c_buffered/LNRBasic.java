package c_buffered;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote �����ַ�������,ʵ�����ݸ����к�
 * @see FileReader
 * @see LineNumberReader
 */

public class LNRBasic {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("f_IOStream\\a.txt");
        LineNumberReader lnr =new LineNumberReader(file);
        String line;
        //���ô��ĸ����ֿ�ʼ(��Ӧ��������ֵ)
        lnr.setLineNumber(0);
        while ((line = lnr.readLine()) != null){
            //����ȡ����ÿһ�����ݼ��ϱ�ʶ��
            System.out.println(lnr.getLineNumber()+":"+line);
        }
        lnr.close();
    }
}
