package Reflects;
//�����ȡ���ι��췽����ʹ��
import java.lang.reflect.Constructor;

public class Demo3_Constructor {
    public static void main(String[] args) throws Exception {
       Class clz =Class.forName("Reflects.ReData");
        //Method ONE
        /*Person p =(Person) clz.newInstance();                        //ͨ���޲ι��촴������
        System.out.println(p);*/
        //Method TWO
        Constructor cso =clz.getConstructor(String.class,int.class);    //��ȡ�вι���
        ReData p = (ReData) cso.newInstance("����",18);           //ͨ���вι�W�촴������
        System.out.println(p);
    }
}
