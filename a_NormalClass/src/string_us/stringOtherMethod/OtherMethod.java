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
        //�ǰ������ֵ���бȽϵ�
        String s1="def";
        String s2="abc";
        int num=s1.compareTo(s2);
        System.out.println(num);
        String s3="��";
        String s4="��";
        int num2=s3.compareTo(s4);
        //���ҵ���unicode�����ֵ
        System.out.println('��' + 0);    //�ݵ����ֵ��24030
        System.out.println('��' + 0);    //�������ֵ��21457
        System.out.println(num2);       //num�Ĵ�ӡֵ��2073 ����s3��ȥs4������ֵ
    }

    private static void trimmethod() {
        //trim������ȥ���ַ������ߵĿո�
        String s1="   c z z   ";
        String s2=s1.trim();
        System.out.println(s2);
    }

    private static void repalceString() {
        String s1="jifengclub";
        String s2=s1.replace("club","xiaozu");  //���ַ���xiaozu�滻club
        System.out.println(s2);
        String s3=s1.replace("china","xiaozu"); //target�ַ��������� ԭ�ַ�������
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
