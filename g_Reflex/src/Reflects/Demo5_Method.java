package Reflects;
//ͨ�������ȡ������ʹ��

import Bean.Person;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo5_Method {
    public static void main(String[] args) throws Exception{
        Class clz =Class.forName("Bean.Person");

        Constructor cons =  clz.getConstructor(String.class,int.class);

        Person p = (Person) cons.newInstance("��",17);

        Method m = clz.getMethod("doing");      //��ȡdoing����     ���Ϊ�޲η���
        m.invoke(p);

        Method m2 = clz.getMethod("doing",int.class);   //��ȡ�вε�doing���� ���Ϊ�вη���
        m2.invoke(p,6);
    }
}
