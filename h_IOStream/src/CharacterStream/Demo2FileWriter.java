package CharacterStream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("yyy.txt");
        fw.write("你好中国");

        fw.close();
    }
}
