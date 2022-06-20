package re_get;

import org.junit.Test;
import re_basic.ReData;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * @author kinoz
 * @Date 2022/6/19 - 14:34
 * @apiNote ��������ʱ����ָ��������.����.������
 */
public class Transfer {
    @Test
    // TODO: 2022/6/19 ��β�������ʱ��ָ������ �ص�
    public void TraTest() throws Exception{
        //1.��ȡclass�ֽ����ļ�
        Class<ReData> reds = ReData.class;
        //2.��������ʱ�����
        ReData reData = reds.newInstance();

        //3.��ȡ����,���÷���Ȩ��Ϊtrue
        Field name = reds.getDeclaredField("name");
        name.setAccessible(true);

        //4.������ʱ�����Ը�ֵ
        name.set(reData,"С��");
        //5.��ȡֵ�����
        Object obj = name.get(reData);
        System.out.println(obj);
    }

    @Test
    public void MethodTest() throws Exception{
        Class clz = ReData.class;
        Object o = clz.newInstance();
        //��static�ĵ���
        Method secretInfo = clz.getDeclaredMethod("secretInfo", String.class);
        secretInfo.setAccessible(true);
        Object returnValue = secretInfo.invoke(o, "���ǷǾ�̬����,���Ǿ���ʵ��");
        System.out.println(returnValue);

        System.out.println("------------------------");

        //static�ĵ���
        Method anotherMethod = clz.getDeclaredMethod("anotherMethod");
        anotherMethod.setAccessible(true);
        //�������ʱ���еķ���û�з���ֵ�����invoke()����null
        //Object retureValue2 = anotherMethod.invoke(ReData.class);
        Object retureValue2 = anotherMethod.invoke(null);
        System.out.println(retureValue2);
    }
    @Test
    public void ConstructorTest() throws Exception{
        //1.��ȡclass�ֽ����ļ�
        Class<?> clz = Class.forName("re_basic.ReData");

        //2.��ȡָ��������
        Constructor<?> cons = clz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);

        //3.��ָ����������������
        //ǿתΪReData����
        ReData reData = (ReData)cons.newInstance("Harry", 28);
        System.out.println(reData);
    }
}
