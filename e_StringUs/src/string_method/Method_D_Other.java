package string_method;

public class Method_D_Other {
    public static void main(String[] args) {
        replacechar();
        System.out.println("___________");
        repalceString();

    }

    private static void repalceString() {
        String s1="JiFengClub";
        String s2 = s1.replace("Club"," Company");  //用字符串xiaozu替换club
        System.out.println(s2);
        String s3 = s1.replace("china","xiaozu"); //target字符串不存在 原字符串不变
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
