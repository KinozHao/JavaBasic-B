package c_character.Text;

import java.io.*;
import java.util.TreeMap;
//获取文本上字符出现的次数
public class Text2 {
    public static void main(String[] args) throws IOException {
        //创建带Buffered的输入流对象
        BufferedReader br =new BufferedReader(new FileReader("xxx.txt"));
        //创建双列集合TreeMap
        TreeMap<Character,Integer> tm =new TreeMap<>();
        //将读取到的字符存储在双列集合中,存储的时候要做判断 如果不包含这个键 就讲键和1存储 如果包含就讲这个键+1存储
        int ch;
        while ((ch =br.read()) !=-1){
            char c=(char)ch;    //强制类型转换
            /*if (!tm.containsKey(c)){
                tm.put(c,1);
            }else {
                tm.put(c,tm.get(c) +1 );
            }*/
            //三元运算符 简写
            tm.put(c,!tm.containsKey(c) ? 1: tm.get(c) +1);
        }
        //关闭输入流
        br.close();
        //创建带Buffered的输出流对象
        BufferedWriter bw =new BufferedWriter(new FileWriter("ggg.txt"));
        //遍历集合里的内容 写到ggg.txt当中
        for (Character key : tm.keySet()){
            switch (key){       //进行代码的规范
                case '\t':
                    bw.write("\\t"+"="+tm.get(key));
                    break;
                case '\n':
                    bw.write("\\n"+"="+tm.get(key));
                    break;
                case '\r':
                    bw.write("\\r"+"="+tm.get(key));
                    break;
                    default:
                        bw.write(key+"="+tm.get(key));  //写出键和值
                        break;
            }
            bw.newLine();       //换行
        }
        bw.close(); //输出流的释放
    }
}
