package Reflects;
//�����ȡ���ι��췽����ʹ��
import Bean.Person;
import java.lang.reflect.Constructor;

public class Demo3_Constructor {
    public static void main(String[] args) throws Exception {
       Class clz =Class.forName("Bean.Person");
        //Method ONE
        /*Person p =(Person) clz.newInstance();                        //ͨ���޲ι��촴������
        System.out.println(p);*/
        //Method TWO
        Constructor cso =clz.getConstructor(String.class,int.class);    //��ȡ�вι���
        Person p = (Person) cso.newInstance("����",18);           //ͨ���вι�W�촴������
        System.out.println(p);
    }
}
