package ByteStream.Text;
//Picture Secret
import java.io.*;

public class TextA {
    public static void main(String[] args) throws IOException {
        //FileInputStream����Ҫд����һ���ļ�·��
        BufferedInputStream fis=new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(""));
        int in;
        while ((in=fis.read()) != -1){
            fos.write(in ^ 123);    //һ��������һ�����ɻ����ξ������������
        }
        fis.close();
        fos.close();
    }
}
