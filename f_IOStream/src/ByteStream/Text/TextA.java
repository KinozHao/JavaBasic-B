package ByteStream.Text;
//Picture Secret
import java.io.*;

public class TextA {
    public static void main(String[] args) throws IOException {
        //FileInputStream里面要写的是一个文件路径
        BufferedInputStream fis=new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(""));
        int in;
        while ((in=fis.read()) != -1){
            fos.write(in ^ 123);    //一个数被另一个数疑惑两次就是这个数本身
        }
        fis.close();
        fos.close();
    }
}
