package CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3Copy {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("xxx.txt");
        FileWriter fw=new FileWriter("zzz.txt");
        int in;
        while ((in=fr.read()) !=-1){
            fw.write(in);
        }
        fw.close();
        //Writer������һ��2k���ҵĻ�����,���������,�ͻὫ����д����������,�����Ὣ����������д��,ˢ�³���
        fr.close();
    }
}
