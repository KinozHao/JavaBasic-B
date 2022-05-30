package c_character.Text;

import java.io.*;
import java.util.TreeMap;
//��ȡ�ı����ַ����ֵĴ���
public class Text2 {
    public static void main(String[] args) throws IOException {
        //������Buffered������������
        BufferedReader br =new BufferedReader(new FileReader("xxx.txt"));
        //����˫�м���TreeMap
        TreeMap<Character,Integer> tm =new TreeMap<>();
        //����ȡ�����ַ��洢��˫�м�����,�洢��ʱ��Ҫ���ж� �������������� �ͽ�����1�洢 ��������ͽ������+1�洢
        int ch;
        while ((ch =br.read()) !=-1){
            char c=(char)ch;    //ǿ������ת��
            /*if (!tm.containsKey(c)){
                tm.put(c,1);
            }else {
                tm.put(c,tm.get(c) +1 );
            }*/
            //��Ԫ����� ��д
            tm.put(c,!tm.containsKey(c) ? 1: tm.get(c) +1);
        }
        //�ر�������
        br.close();
        //������Buffered�����������
        BufferedWriter bw =new BufferedWriter(new FileWriter("ggg.txt"));
        //��������������� д��ggg.txt����
        for (Character key : tm.keySet()){
            switch (key){       //���д���Ĺ淶
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
                        bw.write(key+"="+tm.get(key));  //д������ֵ
                        break;
            }
            bw.newLine();       //����
        }
        bw.close(); //��������ͷ�
    }
}
