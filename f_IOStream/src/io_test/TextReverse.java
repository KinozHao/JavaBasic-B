package io_test;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

//文本反转
public class TextReverse {
    @Test
    public void Reverse_Test() throws IOException {
        //创建输入流对象
        BufferedReader br =new BufferedReader(new FileReader(new File("accessData.txt")));
        //创建数组存放流对象
        ArrayList<String> list =new ArrayList<>();

        String line;
        while ((line= br.readLine()) != null){
            list.add(line);     //暂时把读的文件存在集合中
        }
        br.close();             //流释放
        //创建输出流对象
        BufferedWriter bw =new BufferedWriter(new FileWriter("tts.txt"));
        //对集合元素进行反遍历
        for (int i = list.size() -1; i >= 0;i--) {
            bw.write(list.get(i));  //写出
            bw.newLine();   //换行
        }
        bw.close();             //流释放
        System.out.println("输出正常");
    }
}
