package Reflects;
//�����ȡ��Ա������ʹ��

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo4_Field {
    public static void main(String[] args) throws Exception {
        Class clz =Class.forName("Reflects.ReData");    //��ȡ�ֽ����ļ�

        Constructor cso = clz.getConstructor(String.class,int.class);   //��ȡ�вι���
        ReData per = (ReData) cso.newInstance("Kinoz",18);      //ͨ���вι��촴������

//        Field f1 = clz.getField("name");            ��ͨ�ķ��� �������˽�о�û�취����
        Field f2 = clz.getDeclaredField("name");    //���������ȡ�ֶ�
        f2.setAccessible(true);                           //ȥ��˽��Ȩ��
        f2.set(per,"Jack");                               //set�����һ��Ϊperson�������� �ڶ����޸ĵĲ���
        System.out.println(per);                          //���person�����޸Ĺ���Ľ��
    }
}
