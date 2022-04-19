package string_us.TextDocument;
/*
Question:
统计一个字符串中,大写字母,小写字母,数字字符出现的次数,其他字符出现的次数
ABCDEfjhijk1245@#%^^&
Function:
1:字符串是由字符组成的,而字符的值都是有范围的,通过范围来判断是否包含该字符
2:如果包含就让计数器变量自增
3:for circle 进行 traversing以及String 中的 charAt方法
4:if judge the character isn't at the range
5:Print the result
*/
public class DifferentTypesOfCharacters {
    public static void main(String[] args) {
        String s="ABCDEfjhijk1245@#%^^&";
//      计数器
        int big=0;
        int small=0;
        int num=0;
        int other=0;
//      ------------------------
//        获取每一个字符,通过for循环来进行遍历
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);         //通过索引获得每一个字符
//            判断字符是否在这个范围内
            if (c >='A' && c<='Z'){
                big++;
            }else if (c>='a' && c<='z'){
                small++;
            }else if (c>='1' && c<='9'){
                num++;
            }else{
                other++;
            }
        }
        //打印计时器的结果
        System.out.println(s+"中大写字母有"+big+"个");
        System.out.println(s+"中小写字母有"+small+"个");
        System.out.println(s+"中数字有"+num+"个");
        System.out.println(s+"中其他的有"+other+"个");
    }
}
