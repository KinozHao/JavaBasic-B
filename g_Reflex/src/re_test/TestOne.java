package re_test;
//��һ������integer���͵ļ��������һ���ַ���Ԫ�� �÷���ʵ��
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestOne {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ay =new ArrayList<>();       //����һ������
        ay.add(10);             //��Ӳ���
        ay.add(20);

        System.out.println("Before:"+ay);
        Class clz = Class.forName("java.util.ArrayList");   //ԭ�ļ����� ��ȡ�����ļ� ��ȡ�ֽ������

        Method m = clz.getMethod("add",Object.class);       //��ȡadd����
        m.invoke(ay,"���Ǹ��ַ���");                          //����ַ�����ȥ

        System.out.println("After:"+ay);
    }
}
