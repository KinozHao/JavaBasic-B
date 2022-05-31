package b_byte.Copy;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\JavaCode\\SEImprove\\f_IOStream\\a.txt");
        FileOutputStream fos=new FileOutputStream("E:\\JavaCode\\SEImprove\\f_IOStream\\a.txt");
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
