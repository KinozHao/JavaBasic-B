package re_test;

import java.lang.reflect.Method;
import java.util.ArrayList;
//��һ������integer���͵ļ��������һ���ַ���Ԫ�� �÷���ʵ��
public class ArrayTest {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println("���ǰ"+list);
        //��ȡArrayList���ֽ������
        Class clz = Class.forName("java.util.ArrayList");

        //�����ȡadd()
        Method m = clz.getMethod("add",Object.class);

        //����ַ�����ȥ
        m.invoke(list,"���Ǹ��ַ���");

        System.out.println("��Ӻ�"+list);
    }
}
