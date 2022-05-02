import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/5/2 - 14:31
 * @apiNote String�Ļ������
 */
public class StringBasic {
    @Test
    //�˽�String
    public void test_String(){
        //1.���������巽ʽ
        String s1 ="abc";
        String s2 ="abc";
        //��ֵַ����ͬ��
        System.out.println(s1 == s2);
        //���ɱ�������
        s2 = "hello";
        System.out.println(s2);

        System.out.println("********************");
        String s3 = "abc";
        s3 +="-dde";
        System.out.println(s3);
        System.out.println(s1);
        //�൱���ڳ�������������һ�����󣬲�û�ж�ԭ�ж���ı�
        String s4 = s3.replace('c', 'd');
        System.out.println(s4);
    }
    @Test
    //������������
    public void test2_String(){
        //�൱��new������һ���ڶ��У�һ���ڳ�������
        //2.������new�ķ�ʽ����
        String a = new String("�й�");
        String b = new String("�й�");
        String c = "�й�";
        //�������Ϊ����������
        System.out.println(a == b);
        //��������ͬ��һ���ڳ����أ�һ���ڶ���
        System.out.println(a == c);
    }

    @Test
    //intern����
    public void test3_String(){
        String s1 = "rocker";
        String s3 = "rockerfall";
        String s2 = s1+"fall";
        //������õ���s4ʹ�õ��ǳ������е�rockerfall��
        //internǿ���ڳ�����������
        String s4 = s2.intern();
        System.out.println(s3 == s4);

    }
}
