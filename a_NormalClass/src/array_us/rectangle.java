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
public class rectangle {
    public static void main(String[] args) {
        things s1=new things();
        System.out.println("Ĭ���ܳ�"+s1.getLength());
        System.out.println("Ĭ�����"+s1.getSquare());

        things s2=new things(2);
        System.out.println("���������ܳ�"+s2.getLength());
        System.out.println("�����������"+s2.getSquare());
        things s3=new things(4);

        System.out.println("���������ܳ�"+s3.getLength());
        System.out.println("�����������"+s3.getSquare());
    }
}
class things{
    private int length;
    private int width;

    public things() {
        this.length=1;
        this.width=1;
    }
    public things(int index){
        this.width=index;
        this.length=index;
    }
    public things(int length, int width) {
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
