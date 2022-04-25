package ByteStream.InterfaceUs;

import java.io.*;
//文件加密接口 Can encryption the file
public interface PictureSecret {
    static void method() throws IOException {
        //New IO Object Add fileaddress to the FileInputStream
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));
        int in;
        while ((in=bis.read()) !=-1){
            bos.write(in ^ 521005);
        }
        bis.close();
        bos.close();
    }
}
