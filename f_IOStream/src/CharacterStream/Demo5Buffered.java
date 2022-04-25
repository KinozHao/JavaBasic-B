package CharacterStream;

import java.io.*;

public class Demo5Buffered {
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
}
