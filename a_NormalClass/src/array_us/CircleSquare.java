package array_us;

import java.util.Scanner;
/*
* Question:
* ��Բ��length��Are
*
* Function:
* <circle��>
* 1:����һ��radius����;
* 2:radius�Ĺ��췽�� ����Բ�������ʽ���ܳ���ʽ
* <��������>
* 1:����¼��һ��double type��num
* 2:judge���num ifС��0�Ļ�ֱ�ӱ��� if����0�������һ��
* 3:����circle�෽�� �������¼��Ĳ���
* 4:��ӡԪ��������ܳ�����
* */

//Answer:
public class CircleSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("������?�İ뾶");
        double iRadius=sc.nextDouble();
        if (iRadius<0)
        {
            System.out.println("You have put in wrong things try again");
        }
        else
        {
            circle s=new circle(iRadius);
            System.out.println("Circles Length"+s.getlength());
            System.out.println("Circles Area"+s.getArea());
        }
    }
}
class circle{
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getlength()
    {
        return 2*Math.PI*this.radius;
    }
    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
}
