package CharacterStream;

import java.io.FileReader;
import java.io.IOException;

public class Demo1FileReader {
    public static void main(String[] args) throws IOException {
        PRIMARY();
        High();
    }

    private static void High() throws IOException {
        FileReader fr=new FileReader("xxx.txt");
        int in;
        //ͨ����ĿĬ�ϵ����һ�ζ�ȡһ���ַ�
        while ((in = fr.read()) != -1){
            System.out.println((char)in);   //char����ǿת
        }
        fr.close();
    }

    private static void PRIMARY() throws IOException {
        FileReader fr =new FileReader("xxx.txt");
        int i=fr.read();
        System.out.println((char)i);        //char����ǿת
        fr.close();
    }
}
