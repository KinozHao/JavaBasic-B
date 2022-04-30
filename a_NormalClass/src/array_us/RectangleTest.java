package array_us;
/*
QUESTION:
Get the Rectangle's length and the Square

Function:
1:���峤���εĳ��Ϳ�����
2:�������췽�� ��һ���ղ� ���峤�Ϳ�   �ڶ���һ������ ���Ϊ����ֵ   ������ ��������ֵ ��߾�Ϊ�ο���ֵ
3:�������� �ܳ�����(length+width)*2     �������length*width
* */

//Answer:
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle s1=new Rectangle();
        System.out.println("Ĭ���ܳ�"+s1.getLength());
        System.out.println("Ĭ�����"+s1.getSquare());

        Rectangle s2=new Rectangle(2);
        System.out.println("���������ܳ�"+s2.getLength());
        System.out.println("�����������"+s2.getSquare());
        Rectangle s3=new Rectangle(4);

        System.out.println("���������ܳ�"+s3.getLength());
        System.out.println("�����������"+s3.getSquare());
    }
}
class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length=1;
        this.width=1;
    }
    public Rectangle(int index){
        this.width=index;
        this.length=index;
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return 2*(this.length+this.width);
    }

    public int getSquare() {
        return this.length*this.width;
    }
}
