package ByteStream;

import java.io.*;

/*
* 读写中文的问题
* 注意:一个中文为两个字节
* */
public class chinese {
    public static void main(String[] args) throws IOException {
//        INPUT();
      /*  File s=new File("zzz.txt");
        System.out.println(s.createNewFile());
        FileOutputStream FOS =new FileOutputStream("zzz.txt");
        FOS.write("你好,世界".getBytes());    //输出必须要把话转换为字节才可以输出
        FOS.close();
    }

    private static void INPUT() throws IOException {
        FileInputStream FIS=new FileInputStream("xxx.txt");
        byte [] b=new byte[6];
        int len;
        while ((len=FIS.read(b)) != -1){
            System.out.println(new String(b));
        }
        FIS.close();*/
    }
}
