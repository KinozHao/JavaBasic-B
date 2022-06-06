package io_test;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

//�ı���ת
public class TextReverse {
    @Test
    public void Reverse_Test() throws IOException {
        //��������������
        BufferedReader br =new BufferedReader(new FileReader(new File("accessData.txt")));
        //����������������
        ArrayList<String> list =new ArrayList<>();

        String line;
        while ((line= br.readLine()) != null){
            list.add(line);     //��ʱ�Ѷ����ļ����ڼ�����
        }
        br.close();             //���ͷ�
        //�������������
        BufferedWriter bw =new BufferedWriter(new FileWriter("tts.txt"));
        //�Լ���Ԫ�ؽ��з�����
        for (int i = list.size() -1; i >= 0;i--) {
            bw.write(list.get(i));  //д��
            bw.newLine();   //����
        }
        bw.close();             //���ͷ�
        System.out.println("�������");
    }
}
