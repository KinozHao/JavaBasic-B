package array_us;
/*
QUESTION:
Get the Rectangle's length and the Square

Function:
1:定义长方形的长和宽属性
2:三个构造方法 第一个空参 定义长和宽   第二个一个参数 宽高为参数值   第三个 两个参数值 宽高均为参考数值
3:两个方法 周长方法(length+width)*2     面积方法length*width
* */

//Answer:
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle s1=new Rectangle();
        System.out.println("默认周长"+s1.getLength());
        System.out.println("默认面积"+s1.getSquare());

        Rectangle s2=new Rectangle(2);
        System.out.println("两个参数周长"+s2.getLength());
        System.out.println("两个参数面积"+s2.getSquare());
        Rectangle s3=new Rectangle(4);

        System.out.println("三个参数周长"+s3.getLength());
        System.out.println("三个参数面积"+s3.getSquare());
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
