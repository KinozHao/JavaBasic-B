package c_buffered;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote 缓冲字符输入流,实现数据跟踪行号
 * @see FileReader
 * @see LineNumberReader
 */

public class LNRBasic {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("f_IOStream\\a.txt");
        LineNumberReader lnr =new LineNumberReader(file);
        String line;
        //设置从哪个数字开始(对应的是索引值)
        lnr.setLineNumber(0);
        while ((line = lnr.readLine()) != null){
            //给读取到的每一行数据加上标识号
            System.out.println(lnr.getLineNumber()+":"+line);
        }
        lnr.close();
    }
}
