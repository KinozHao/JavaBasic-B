package c_buffered;

import org.junit.Test;

import java.io.*;

public class BufferedBasic {
    public static void main(String[] args) throws IOException {
//        Text1();
        BufferedReader br =new BufferedReader(new FileReader("xxx.txt"));
        BufferedWriter bw =new BufferedWriter(new FileWriter("zzz.txt"));
        String line;
        while ((line=br.readLine()) !=null){
            bw.write(line);
            bw.newLine();
//            bw.write("\r\n");
        }
        br.close();
        bw.close();
    }

    private static void Demo1() throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("xxx.txt"));
        String line;
        while ((line=br.readLine()) !=null){    //readLine方法用来读取整行
            System.out.println(line);
        }
        br.close();
    }
    @Test
    public void Copy_B()throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
        int len;
        while ((len=br.read()) !=-1){
            bw.write(len);
        }
        br.close();
        bw.close();
    }
}
