package string_test.TextDocument;
/*
Question:
把字符串反转
键盘录入一个字符串 abc
输出结果为cba
Function:
1:先键盘录入一个String类型的字符串abc;
2:用toCharArray方法把字符串转化为字符数组;
3:转换过后的字符数据反遍历一下
4:String一个新的空字符串加在遍历中
5:打印最终的s即可获得结果
Attention:
需要了解的知识点由:
toCharArray进行字符串和字符数组之间的转换
反遍历的格式
for(int i=arr.length-1;i>=0;i--){}
*/
import java.util.Scanner;
//Answer:
public class CharacterReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the character");
        String str=sc.nextLine();
        //上面部分为键盘录入部分 要点Scanner 的nextLine方法
        char [] cr = str.toCharArray();
        //String的toCharArray方法 用来字符数组的转化
        String s=" ";
        //留着在遍历时候进行拼接
        for (int i = cr.length-1; i >= 0; i--) {
            s = s+cr[i];
        }
        //上面部分为字符数组的反遍历部分和s的拼接
        System.out.println(s);
        //结果的输出
    }
}
