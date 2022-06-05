package io_test;

import java.io.*;
import java.util.TreeMap;

/**
 * @author kinoz
 * @Date 2019/5/20 - 20:30
 * @Location HAGZX HuaiAn
 * @apiNote ��ȡ�ı����ַ����ֵĴ���
 */

public class EveryCharacter {
    public static void main(String[] args) throws IOException {
        //1.���뻺���������ȡ����
        //ͨ�����������д�������ļ�
        BufferedReader br =new BufferedReader(new FileReader("f_IOStream\\my.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("f_IOStream\\myData.txt"));

        //2.����TreeMap����
        TreeMap<Character,Integer> tree =new TreeMap<>();

        //3.����ȡ�����ַ��洢��tree��

        int flag;
        while ((flag = br.read()) !=-1){
            char c = (char)flag;    //ǿ������ת��
            //3.1.����������key,�ʹ洢key��1 ������,�ʹ洢��+1
            /*//д��һ
            if (!tree.containsKey(c)){
                tree.put(c,1);
            }else {
                tree.put(c,tree.get(c) +1 );
            }*/
            //��Ԫ�����
            tree.put(c,!tree.containsKey(c) ? 1: tree.get(c) +1);
        }

        //4.��������������� д��myData��
        for (Character key : tree.keySet()){
            //���д���Ĺ淶
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
                        bw.write(key+"="+tree.get(key));  //д������ֵ
                    break;
            }
            bw.newLine();
        }

        //4.�ر���
        br.close();
        bw.close();
    }
}
