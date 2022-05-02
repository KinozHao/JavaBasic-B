package string_test.TextDocument;
//需求
//把一个字符串的首字母转换为大写,其余的转换为小写;(只考虑英文大小写字母字符)
public class ChangeCharacterWithUser {
    public static void main(String[] args) {
        Method1();
        Method2();
    }

    private static void Method2() { //进行分开的写法 条例清晰更容易理解
        String str2="huaiANGAOJI";
        //指定位置开始,指定位置结束,截取字符串substring的用法
        String s2=str2.substring(0,1).toUpperCase();
        //把指定字符串转换为大写/小写 toUpperCase 和 toLowerCase的用法
        String s3=str2.substring(1).toLowerCase();
        //把字符串进行连接,concat的用法
        String s4=s2.concat(s3);
        System.out.println(s4);
    }

    private static void Method1() { //链式编程(一气呵成 看着比较凌乱)
        String str="woaiJIFENGCODER";
        String s1=str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase());
        System.out.println(s1);
    }
}
