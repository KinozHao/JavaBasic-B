package string_us.stringOtherMethod;

public class OtherMethod {
    public static void main(String[] args) {
        replacechar();
        System.out.println("___________");
        repalceString();
        System.out.println("___________");
        trimmethod();
        System.out.println("___________");
        compareTo();
        System.out.println("___________");
        compareToIgnoreCase();
    }

    private static void compareToIgnoreCase() {
        String s1="heima";
        String s2="HEIMA";
        int num=s1.compareToIgnoreCase(s2);
        System.out.println(num);
        int num2=s1.compareTo(s2);
        System.out.println(num2);
    }

    private static void compareTo() {
        //是按照码表值进行比较的
        String s1="def";
        String s2="abc";
        int num=s1.compareTo(s2);
        System.out.println(num);
        String s3="州";
        String s4="发";
        int num2=s3.compareTo(s4);
        //查找的是unicode的码表值
        System.out.println('州' + 0);    //州的码表值是24030
        System.out.println('发' + 0);    //发的码表值是21457
        System.out.println(num2);       //num的打印值是2073 是用s3减去s4的最终值
    }

    private static void trimmethod() {
        //trim的作用去除字符串两边的空格
        String s1="   c z z   ";
        String s2=s1.trim();
        System.out.println(s2);
    }

    private static void repalceString() {
        String s1="jifengclub";
        String s2=s1.replace("club","xiaozu");  //用字符串xiaozu替换club
        System.out.println(s2);
        String s3=s1.replace("china","xiaozu"); //target字符串不存在 原字符串不变
        System.out.println(s3);
    }

    private static void replacechar() {
        String s1="ace";
        String s2=s1.replace('a','b');    //用a替换b
        System.out.println(s2);
        String s3=s1.replace('d','o');  //d不存在保留原字符不变
        System.out.println(s3);
    }
}
