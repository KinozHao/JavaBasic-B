package re_get;

import org.junit.Test;
import re_basic.ReData;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author kinoz
 * @Date 2022/6/18 - 17:22
 * @apiNote ͨ�������������ĳ�Ա�Ļ�ȡ
 */
public class OtherGet {
    @Test
    public void ConsTest(){
        Class clz = ReData.class;
        //��ȡ����ʱ������public������(����������)
        Constructor[] cons = clz.getConstructors();
        for (Constructor constructor : cons){
            System.out.println(constructor);
        }

        //��ȡ����ʱ������Ȩ�޹�����(����������)
        Constructor[] dcs = clz.getDeclaredConstructors();
        for (Constructor constructor1 : dcs){
            System.out.println(constructor1);
        }
    }
    @Test
    public void SuperClassTest(){
        //1.��ȡ����ʱ��ĸ���
        //��������
        Class clz = ReData.class;
        Class scs = clz.getSuperclass();
        System.out.println(scs);
        //������
        Type gsc = clz.getGenericSuperclass();
        System.out.println(gsc);

        //2.��ȡ����ʱ������͵ĸ���ķ���
        // TODO: 2022/6/18 ����Ƿ��͵��ص㣬ʹ�ý�ΪƵ�� 
        ParameterizedType paramType = (ParameterizedType)gsc;
        Type[] type = paramType.getActualTypeArguments();
        System.out.println(type[0].getTypeName());
        //��typeǿתΪClass���� ����getName����
        System.out.println(((Class)type[0]).getName());
    }
    @Test
    // TODO: 2022/6/18 �ص�� ��̬�����ʹ�� 
    public void InterfaceTest() throws Exception{
        //1.��ȡ����ʱ��Ľӿ�
        Class clz = Class.forName("re_basic.ReData");
        Class[] interfaces = clz.getInterfaces();
        System.out.println(interfaces[0].getName());

        Type[] gifs = clz.getGenericInterfaces();
        System.out.println(gifs[0].getTypeName());

        //2.��ȡ����ʱ�ุ��ʵ�ֵĽӿ�
        Class[] fathers = clz.getSuperclass().getInterfaces();
        for (Class c : fathers){
            System.out.println(c);
        }
    }

    @Test
    public void pk_anon() throws Exception{
        //��ȡ��
        Class clz = Class.forName("re_basic.ReData");
        Package pk = clz.getPackage();
        System.out.println(pk);

        //��ȡע��
        // TODO: 2022/6/18 frame is: Annotation+Reflex+DesignPattern 
        Annotation[] anon = clz.getAnnotations();
        for (Annotation an : anon){
            System.out.println(an);
        }
    }

}
