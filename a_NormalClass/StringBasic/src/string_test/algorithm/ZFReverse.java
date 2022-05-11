package string_test.algorithm;
import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/5 - 22:52
 * @apiNote 指定索引位置字符出反转
 */

public class ZFReverse {
    @Test
    public void testReverse() {
        System.out.println(Reverse("acbdefg",1,2));
        System.out.println(ReverseImprove("heoll",2,4));
        System.out.println(ReverseImproveII("ETATS",0,4));
    }
    //使用类似数组的操作
    public static String Reverse(String str,int startIndex,int endIndex){
        if (str != null) {
            //1.String-->char[]
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //把要反转的字符看为三个部分
    public static String ReverseImprove(String str,int startIndex,int endIndex){
        if (str != null) {
            //1.获取要反转之前的字符(第一部分)
            String reverseStr = str.substring(0, startIndex);
            //2.从尾端开始获取索引，用于中间需要反转的部分
            for (int i = endIndex; i >= startIndex; i--) {
                //使用charAt获取得到索引的字符，然后和第一部分进行拼接
                //每次都需要创建新的，旧的抛弃，效率低
                reverseStr += str.charAt(i);
            }
            //3.三个部分拼接起来
            reverseStr += str.substring(endIndex + 1);
            return reverseStr;
        }
        return null;
    }

    //使用StringBuilder(ReverseImprove的迭代)
    public String ReverseImproveII(String str,int startIndex,int endIndex){
        //1.获取字符串长度
        StringBuilder sbr = new StringBuilder(str.length());
        //2.添加要反转字符前字符的索引
        sbr.append(str.substring(0,startIndex));
        //3.获取要反转字符的索引，二次添加
        for (int i = endIndex; i >= startIndex; i--) {
            sbr.append(str.charAt(i));
        }
        //4.三个部分全部拼接添加
        sbr.append(str.substring(endIndex + 1));
        //5.返回需要把StringBuilder转换为String类型
        return sbr.toString();
    }
}
