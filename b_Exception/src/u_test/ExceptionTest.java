package u_test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
/** @apiNote
题目要求:
1. 键盘录入int类型整数,求其二进制格式
2. 如果过大给提示,并重新录入个BigInteger整数
3. 如果是小数给提示,并重新录入个整数
4. 如果是其他字符给提示,并重新录入个整数
*/
public class ExceptionTest {
    public static void main(String[] args) {

        //1.键盘录入数据
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a normal num:");
        while (true) {
            //2.定义line用于存放输入数据
            String line =sc.nextLine();
            try {
                //3.String类型转换为int类型
                int num = Integer.parseInt(line);
                //4.自动拆箱，把num通过Integer的方法换为二进制
                //输入确定为可转化为int类型的情况下
                System.out.println(Integer.toBinaryString(num));
                break;
            } catch (Exception e) {
                //5.对输入数字进行判断
                try {
                    //5.1输入数字过大，给出提示
                    /* BigInteger用于操作大整数，也可以转换进制。
                     * 若传入整型数据超过整数最大类型长度long的则此数据就无法装入。
                     * 此时要使用BigInteger类进行操作，这些大数都会以字符串的形式传入。
                     * */
                    new BigInteger(line);
                    System.out.println("enter error,you inter's " +
                            "num too big insert again:");
                }catch (Exception e1){
                    //5.2输入数字不是整数，给出提示
                    try {
                        new BigDecimal(line);
                        System.out.println("enter error,you " +
                                "inter's a double or float " +
                                "types num,try again num:");
                    //5.3输入的可能不是数据，给出提示
                    } catch (Exception e2) {
                        System.out.println("enter error,you " +
                                "inter's mays not a num,try " +
                                "again num:");

                    }
                }
            }
        }
    }
}
