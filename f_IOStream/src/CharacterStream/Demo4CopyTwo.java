package CharacterStream;

import java.io.*;

public class Demo4CopyTwo {
    public static void main(String[] args) throws IOException {
//        Copy2();
        BufferedReader br=new BufferedReader(new FileReader("xxx.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("yyy.txt"));
        int len;
        while ((len=br.read()) !=-1){
            bw.write(len);
        }
        br.close();
        bw.close();
    }

    private static void Copy2() throws IOException {
        FileReader fr =new FileReader("xxx.txt");
        FileWriter fw=new FileWriter("yyy.txt");
        char[] arr=new char[1024];
        int in;
        while ((in=fr.read(arr)) !=-1){ //将文件上的数据读取到字符数组中
            fw.write(arr,0,in);     //将字符数组中的数据写到文件上
        }
        fr.close();
        fw.close();
    }
}
