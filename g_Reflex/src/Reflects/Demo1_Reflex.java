package Reflects;

import Bean.Person;
//ͨ�����ַ�ʽ��ȡ�ֽ������
public class Demo1_Reflex {
    public static void main(String[] args) throws ClassNotFoundException {
        //Դ�ļ��׶δ���   ��ȡ�����ļ�
        Class c1 = Class.forName("Bean.Person");
        //�ֽ���׶δ���   ������̬������������
        Class c2 = Person.class;

        //��������    �ж��Ƿ���ͬһ���ֽ������
        Person p = new Person();
        Class c3 = p.getClass();

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
    }
}
