package io_test;

import java.io.*;
import java.util.TreeMap;

/**
 * @author kinoz
 * @Date 2019/5/20 - 20:30
 * @Location HAGZX HuaiAn
 * @apiNote 获取文本上字符出现的次数
 */

public class EveryCharacter {
    public static void main(String[] args) throws IOException {
        //1.输入缓冲流对象获取对象
        //通过输出缓冲流写出到新文件
        BufferedReader br =new BufferedReader(new FileReader("f_IOStream\\my.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("f_IOStream\\myData.txt"));

        //2.创建TreeMap集合
        TreeMap<Character,Integer> tree =new TreeMap<>();

        //3.将读取到的字符存储在tree中

        int flag;
        while ((flag = br.read()) !=-1){
            char c = (char)flag;    //强制类型转换
            //3.1.若不包含此key,就存储key和1 若包含,就存储键+1
            /*//写法一
            if (!tree.containsKey(c)){
                tree.put(c,1);
            }else {
                tree.put(c,tree.get(c) +1 );
            }*/
            //三元运算符
            tree.put(c,!tree.containsKey(c) ? 1: tree.get(c) +1);
        }

        //4.遍历集合里的内容 写入myData中
        for (Character key : tree.keySet()){
            //进行代码的规范
            switch (key){
                case '\t':
                    bw.write("\\t"+"="+tree.get(key));
                    break;
                case '\n':
                    bw.write("\\n"+"="+tree.get(key));
                    break;
                case '\r':
                    bw.write("\\r"+"="+tree.get(key));
                    break;
                    default:
                        bw.write(key+"="+tree.get(key));  //写出键和值
                    break;
            }
            bw.newLine();
        }

        //4.关闭流
        br.close();
        bw.close();
    }
}
