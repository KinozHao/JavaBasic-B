package io_test.PictureTest;

import java.io.*;
//�ļ����ܽӿ� Can encryption the file
interface PictureSecret{
    static void Encryption() throws IOException {
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
