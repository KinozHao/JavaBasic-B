package string_method;

public class Method_D_Other {
    public static void main(String[] args) {
        replacechar();
        System.out.println("___________");
        repalceString();

    }

    private static void repalceString() {
        String s1="JiFengClub";
        String s2 = s1.replace("Club"," Company");  //���ַ���xiaozu�滻club
        System.out.println(s2);
        String s3 = s1.replace("china","xiaozu"); //target�ַ��������� ԭ�ַ�������
        System.out.println(s3);
    }

    private static void replacechar() {
        String s1="ace";
        String s2=s1.replace('a','b');    //��a�滻b
        System.out.println(s2);
        String s3=s1.replace('d','o');  //d�����ڱ���ԭ�ַ�����
        System.out.println(s3);
    }
}
