package re_basic;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/6/17 - 15:40
 * @apiNote Class���ʹ�������
 * ��ȡClassʵ�������ַ�ʽ
 */
public class ClassBasic {
    @Test
    public void classTest() throws ClassNotFoundException {
        //��ʽһ ��������ʱ�������.class
        Class c1 = ReData.class;
        System.out.println(c1);

        //��ʽ�� ͨ������ʱ����󣬵���getClass()
        ReData reData = new ReData();
        Class<? extends ReData> c2 = reData.getClass();
        System.out.println(c2);

        //��ʽ�� ʹ��Class���forName()
        Class<?> c3 = Class.forName("re_basic.ReData");
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

        //��ʽ�� ʹ����ļ�����
        ClassLoader cloader = ClassBasic.class.getClassLoader();
        Class<?> c4 = cloader.loadClass("re_basic.ReData");
        System.out.println("ϵͳ������"+cloader);
        System.out.println(c1 == c4);
    }
}
