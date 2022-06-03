package io_test;

import java.io.*;
import java.util.TreeMap;
//��ȡ�ı����ַ����ֵĴ���
public class EveryCharacter {
    public static void main(String[] args) throws IOException {
        //1.������Buffered������������
        BufferedReader br =new BufferedReader(new FileReader("f_IOStream\\my.txt"));
        //2.����TreeMap����
        TreeMap<Character,Integer> tree =new TreeMap<>();
        //3.����ȡ�����ַ��洢��tree��
        // �жϣ�����������key���ʹ洢key��1 ���������ʹ洢��+1
        int flag;
        while ((flag =br.read()) !=-1){
            char c=(char)flag;    //ǿ������ת��
            //д��һ
            /*if (!tree.containsKey(c)){
                tree.put(c,1);
            }else {
                tree.put(c,tree.get(c) +1 );
            }*/
            //д����(��Ԫ�����)
            tree.put(c,!tree.containsKey(c) ? 1: tree.get(c) +1);
        }

        //������Buffered�����������
        BufferedWriter bw = new BufferedWriter(new FileWriter("f_IOStream\\myDatas.txt"));
        //��������������� д��ָ���ļ���
        for (Character key : tree.keySet()){
            switch (key){       //���д���Ĺ淶
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
            //����
            bw.newLine();
        }

        //4.�ر���
        br.close();
        bw.close();
    }
}
