import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
/*
题目要求:
键盘录入int类型整数,求其二进制格式
如果过大给提示,并重新录入个BigInteger整数
如果是小数给提示,并重新录入个整数
如果是其他字符给提示,并重新录入个整数
*/
/*
1创建键盘录入对象
2录入的结果存放在String类型中,存储int类型的话如果条件不符合容易报错,后续无法进行判断
3键盘录入的结果转换为int类型,true or false
4确定的就转换
5错误的进行对应判断
*/
public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a normal num");
        while (true) {
            String  Line=sc.nextLine();                                   //键盘录入的值存放在Line中
            try {
                int num = Integer.parseInt(Line);                   //把字符串转换为整数
                System.out.println(Integer.toBinaryString(num));    //把整数转换为二进制
                break;
            } catch (Exception e) {                                 //ctrl+win+Alt+t try catch快捷键
                try {
                    new BigInteger(Line);
                    System.out.println("enter error,you inter's num too big,try again num:");
                }catch (Exception e1){
                    try {
                        new BigDecimal(Line);
                        System.out.println("enter error,you inter's a double or float types num,try again num:");
                    } catch (Exception e2) {
                        System.out.println("enter error,you inter's mays not a num,try again num:");

                    }
                }
            }
        }
    }
}
