package array_us;
//��Լ������ơ�����������
//���һ����ͬʱ�Ǽ�������Լ�����������Ϊ���ǵġ���Լ����
//��Լ�������ĳ�Ϊ���Լ����
//����4,8,16��,2��4���ǹ�Լ��,4�����Լ��
import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=in.nextInt();
        System.out.println("enter the second number");
        int b=in.nextInt();
        int s=1;        //sΪ������
        for (int i = 1; i <=a&&i<=b ; i++)  //����һ��forѭ�� i����Ϊ1����2(1�����岻��) a��b�϶����ڻ��ߵ���i
        {
            if(a%i==0&&b%i==0)              //���a b��i����Ľ������0�Ļ� ����s��¼i�ı仯
            {
                s = i;
            }
        }
        System.out.println(a+"and"+b+"�����Լ����"+s);
    }
}
