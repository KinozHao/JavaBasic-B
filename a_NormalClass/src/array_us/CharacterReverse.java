package array_us;
//�����ַ��� ��ӡ��������ַ�����ת��ĸ�ʽ
import java.util.Scanner;

public class CharacterReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String str=sc.nextLine();
        System.out.println(Method(str));
    }
    public static String Method(String str){    //����ֵ����String �����б�String str
        StringBuffer sbs=new StringBuffer(str); //�ַ���ת��ΪStringBuffer����
        sbs.reverse();                          //���������ݽ��з�ת
        return sbs.toString();                  //���ؽ��
    }
}
