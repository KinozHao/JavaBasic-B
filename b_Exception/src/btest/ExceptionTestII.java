package btest;

import java.util.Scanner;

/**
 * @author kinoz
 * @date 2022/4/22 - 18:43
 * @apiNote 异常总和小练习判断输入数据是否符合 若不符合给出对应的异常处理
 */
public class ExceptionTestII {
    public static void main(String[] args) {
        //1.录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数据:");
        String str1 = sc.nextLine();
        System.out.println("输入第二个数据:");
        String str2 = sc.nextLine();

        try {
            //2.数据类型转换
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            int result = ecmMETHOD(num1,num2);
            System.out.println(result);
            //3.若存在差错给出具体的异常
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e3){
            System.out.println("除0");
        } catch (EcmException e4){
            //已经throw过异常，只用通过getMessage方法获取打印信息即可
            System.out.println(e4.getMessage());
        }
    }
    public static int ecmMETHOD(int i,int j) throws EcmException{
        if (i<0 || j<0){
            //自定义异常
            throw new EcmException("分子或分母为0");
        }
        return i / j;
    }
}
