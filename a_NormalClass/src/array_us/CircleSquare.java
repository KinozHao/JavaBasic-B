package array_us;

import java.util.Scanner;
/*
* Question:
* 求圆的length和Are
*
* Function:
* <circle类>
* 1:定义一个radius属性;
* 2:radius的构造方法 还有圆的面积公式和周长公式
* <主方法类>
* 1:键盘录入一个double type的num
* 2:judge这个num if小于0的话直接报错 if大于0则进行下一步
* 3:掉用circle类方法 传入键盘录入的参数
* 4:打印元的面积和周长即可
* */

//Answer:
public class CircleSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入圆的半径");
        double iRadius = sc.nextDouble();
        if (iRadius < 0){
            System.out.println("You have put in wrong things try again");
        }
        Circle s = new Circle(iRadius);
        System.out.println("Circles Length"+s.getLength());
        System.out.println("Circles Area"+s.getArea());

    }
}
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getLength()
    {
        return 2*Math.PI*this.radius;
    }
    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
}
