package c_character.Text;

import java.io.*;
import java.util.ArrayList;

//�ı���ת
public class Text1 {
    public static void main(String[] args) throws IOException {
        //��������������
        BufferedReader br =new BufferedReader(new FileReader("xxx.txt"));
        //����������������
        ArrayList<String> list =new ArrayList<>();

        String line;
        while ((line= br.readLine()) != null){
            list.add(line);     //��ʱ�Ѷ����ļ����ڼ�����
        }
        br.close();             //���ͷ�
        //�������������
        BufferedWriter bw =new BufferedWriter(new FileWriter("ggg.txt"));
        //�Լ���Ԫ�ؽ��з�����
        for (int i = list.size() -1; i >= 0;i--) {
            bw.write(list.get(i));  //д��
            bw.newLine();   //����
        }
        bw.close();             //���ͷ�
    }
}
