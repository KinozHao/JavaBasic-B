package ByteStream;

import java.io.*;
/*
* flush
* ����ˢ�¹��ܶ�ȡ��֮����д
* close
* ����ˢ�¹���,�ٹر���֮ǰ,�ͻ���ˢ��һ�λ�����,�����������ֽ��ļ�ȫ��ˢ�µ��ļ���
* �ٹر�,close����ˢ����֮��Ͳ���д��
* */
public class flushAndclose {
    public static void main(String[] args) throws IOException {
    File F=new File("xxx.txt");

        System.out.println(F.createNewFile());

    FileInputStream fis=new FileInputStream("xxx.txt");
    FileOutputStream fos=new FileOutputStream("copy.txt");

    BufferedInputStream bis=new BufferedInputStream(fis);
    BufferedOutputStream bos=new BufferedOutputStream(fos);

    int pro;
    while ((pro = bis.read()) !=-1){
        bos.write(pro);
//        bos.flush();  û��ȡ�Ժ��ܼ���д
//        bos.close();  ��ȡһ�ξ�ֱ�ӹر�����д����
    }
    bis.close();
    bos.close();
    }
}

