package Test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double a =sc.nextDouble();
        System.out.println("请输入要运算的方式");
        String s =sc.next();
        System.out.println("请输入第二个数字");
        double b =sc.nextDouble();
        System.out.println("最终的结果是"+method(a,s,b));

    }
    public static double method(double a,String s,double b){
        double result = 0;
        switch (s){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                if (b==0){
                    System.out.println("被除数不能为0");
                }else {
                    result = a / b;

                }
                break;

                default:
                    System.out.println("输入有误");
                    break;
        }

        return result;
    }
}
