package io_test.heima_test;

import java.io.*;

//���ð�����
public class Text3 {
    public static void main(String[] args) throws IOException {
        FileReader fdr= new FileReader("f_IOStream\\tts.txt");
        //��������������������,��ΪҪʹ��readLine����,��֤����ԭ����
        BufferedReader data= new BufferedReader(fdr);
        //�ַ���ת��Ϊint��
        String line = data.readLine();
        int times=Integer.parseInt(line);
        //��int�������ж� ����0 ��--��ȥ �����ھ���ʾelse��������
        if (times > 0){
            System.out.println("�㻹��" + times-- + "�λ���");
            FileWriter fw =new FileWriter("Nums.txt");
            fw.write(times + "");
            fw.close();
        }else {
            System.out.println("Times out buy to using");
        }
        //�ر���
        data.close();
    }
}