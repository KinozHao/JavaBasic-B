package array_us;
//输入字符串 打印出来这个字符串反转后的格式
import java.util.Scanner;

public class CharacterReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String str=sc.nextLine();
        System.out.println(Method(str));
    }
    public static String Method(String str){    //返回值类型String 参数列表String str
        StringBuffer sbs=new StringBuffer(str); //字符串转换为StringBuffer对象
        sbs.reverse();                          //缓冲区内容进行反转
        return sbs.toString();                  //返回结果
    }
}
