package io_test;

import java.io.*;

//试用版软件
public class Text3 {
    public static void main(String[] args) throws IOException {
        FileReader fdr= new FileReader("f_IOStream\\tts.txt");
        //创建带缓冲的输出流对象,因为要使用readLine方法,保证数据原样性
        BufferedReader data= new BufferedReader(fdr);
        //字符串转换为int数
        String line = data.readLine();
        int times=Integer.parseInt(line);
        //对int数进行判断 大于0 就--回去 不大于就提示else里面的语句
        if (times > 0){
            System.out.println("你还有" + times-- + "次机会");
            FileWriter fw =new FileWriter("Nums.txt");
            fw.write(times + "");
            fw.close();
        }else {
            System.out.println("Times out buy to using");
        }
        //关闭流
        data.close();
    }
}
