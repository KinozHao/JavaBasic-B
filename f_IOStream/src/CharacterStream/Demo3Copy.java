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
        //Writer类中有一个2k左右的缓冲区,如果不关流,就会将内容写到缓冲区里,关流会将缓冲区内容写出,刷新出来
        fr.close();
    }
}
