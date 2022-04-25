package CharacterStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
//缓冲字符输入流,跟踪行号
public class Demo6LineNumberReader {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr =new LineNumberReader(new FileReader("ggg.txt"));
        String line;
        lnr.setLineNumber(10);      //设置从哪个数字开始
        while ((line = lnr.readLine()) != null){
            System.out.println(lnr.getLineNumber()+":"+line);   //给每一行代码加上数字
        }
        lnr.close();
    }
}
