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
        //通常项目默认的码表一次读取一个字符
        while ((in = fr.read()) != -1){
            System.out.println((char)in);   //char类型强转
        }
        fr.close();
    }

    private static void PRIMARY() throws IOException {
        FileReader fr =new FileReader("xxx.txt");
        int i=fr.read();
        System.out.println((char)i);        //char类型强转
        fr.close();
    }
}
