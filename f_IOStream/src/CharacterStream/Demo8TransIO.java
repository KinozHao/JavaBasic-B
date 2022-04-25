package CharacterStream;

import java.io.*;

public class Demo8TransIO {
    public static void main(String[] args){
            /*NoBufffer();
            Buffered();*/
        try {
            Normal();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Normal() throws IOException {
        FileReader fr = new FileReader("xxx.txt");
        FileWriter fw = new FileWriter("ggg.txt");
        int in;
        while ((in=fr.read()) !=-1){
            fw.write(in);
        }
        fr.close();
        fw.close();
    }

    private static void Buffered() throws IOException {
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("xxx.txt"),"UTF-8"));
        BufferedWriter bw =
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("ggg.txt"),"GBK"));
        int line;
        while ((line = br.read()) != -1){
            bw.write(line);
        }
        br.close();
        bw.close();
    }

    private static void NoBufffer() throws IOException {
        InputStreamReader isr
                =new InputStreamReader(new FileInputStream("xxx.txt"),"utf-8");
        OutputStreamWriter isw
                =new OutputStreamWriter(new FileOutputStream("ggg.txt"),"gbk");
        int in;
        while ((in= isr.read()) != -1){
            isw.write(in);
        }
        isr.close();
        isw.close();
    }
}
