package array_us;
//公约数，亦称“公因数”。
//如果一个数同时是几个数的约数，称这个数为它们的“公约数”
//公约数中最大的称为最大公约数。
//比如4,8,16中,2和4都是公约数,4是最大公约数
import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=in.nextInt();
        System.out.println("enter the second number");
        int b=in.nextInt();
        int s=1;        //s为计数器
        for (int i = 1; i <=a&&i<=b ; i++)  //定义一个for循环 i可以为1或者2(1的意义不大) a和b肯定大于或者等于i
        {
            if(a%i==0&&b%i==0)              //如果a b和i相除的结果都是0的话 则用s记录i的变化
            {
                s = i;
            }
        }
        System.out.println(a+"and"+b+"的最大公约数是"+s);
    }
}
