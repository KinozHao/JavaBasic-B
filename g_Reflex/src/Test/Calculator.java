package Test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������");
        double a =sc.nextDouble();
        System.out.println("������Ҫ����ķ�ʽ");
        String s =sc.next();
        System.out.println("������ڶ�������");
        double b =sc.nextDouble();
        System.out.println("���յĽ����"+method(a,s,b));

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
                    System.out.println("����������Ϊ0");
                }else {
                    result = a / b;

                }
                break;

                default:
                    System.out.println("��������");
                    break;
        }

        return result;
    }
}
