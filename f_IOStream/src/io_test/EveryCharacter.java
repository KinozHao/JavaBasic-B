package io_test;

import java.io.*;
import java.util.TreeMap;
//获取文本上字符出现的次数
public class EveryCharacter {
    public static void main(String[] args) throws IOException {
        //1.创建带Buffered的输入流对象
        BufferedReader br =new BufferedReader(new FileReader("f_IOStream\\my.txt"));
        //2.创建TreeMap集合
        TreeMap<Character,Integer> tree =new TreeMap<>();
        //3.将读取到的字符存储在tree中
        // 判断：若不包含此key，就存储key和1 若包含，就存储键+1
        int flag;
        while ((flag =br.read()) !=-1){
            char c=(char)flag;    //强制类型转换
            //写法一
            /*if (!tree.containsKey(c)){
                tree.put(c,1);
            }else {
                tree.put(c,tree.get(c) +1 );
            }*/
            //写法二(三元运算符)
            tree.put(c,!tree.containsKey(c) ? 1: tree.get(c) +1);
        }

        //创建带Buffered的输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("f_IOStream\\myDatas.txt"));
        //遍历集合里的内容 写到指定文件中
        for (Character key : tree.keySet()){
            switch (key){       //进行代码的规范
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
            //换行
            bw.newLine();
        }

        //4.关闭流
        br.close();
        bw.close();
    }
}
