package CharacterStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
//�����ַ�������,�����к�
public class Demo6LineNumberReader {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr =new LineNumberReader(new FileReader("ggg.txt"));
        String line;
        lnr.setLineNumber(10);      //���ô��ĸ����ֿ�ʼ
        while ((line = lnr.readLine()) != null){
            System.out.println(lnr.getLineNumber()+":"+line);   //��ÿһ�д����������
        }
        lnr.close();
    }
}
