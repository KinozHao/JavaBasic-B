package CharacterStream.Text;

import java.io.*;

//���ð����
public class Text3 {
    public static void main(String[] args) throws IOException {
        //��������������������,��ΪҪʹ��readLine����,��֤����ԭ����
        BufferedReader BR= new BufferedReader(new FileReader("Nums.txt"));
        //�ַ���ת��Ϊint��
        String line=BR.readLine();
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
        BR.close();
    }
}
