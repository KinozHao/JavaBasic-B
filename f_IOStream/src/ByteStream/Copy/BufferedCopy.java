package ByteStream.Copy;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("Music.mp3");
        FileOutputStream fos=new FileOutputStream("copys.mp3");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int len;
        while ((len=bis.read()) !=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
