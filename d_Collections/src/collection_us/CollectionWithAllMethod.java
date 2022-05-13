package collection_us;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionWithAllMethod {
    public static void main(String[] args) {
        addAllMethod();
        System.out.println("--------");
        RemoveAllMethod();
        System.out.println("--------");
        ContainsAllMethod();
        System.out.println("--------");
        RetainAllMethod();
    }

    private static void RetainAllMethod() {
        Collection c1=new ArrayList();
        c1.add("a");
        c1.add("d");
        c1.add("b");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("ox");
        c2.add("n");
        //ȡ����,������õļ��ϸı�ͷ���true,������õļ��ϲ���ͷ���false
        boolean bl=c1.retainAll(c2);
        System.out.println(bl);
        System.out.println(c1);
    }

    private static void ContainsAllMethod() {
        Collection c1=new ArrayList();
        c1.add("a");
        c1.add("d");
        c1.add("b");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");

        boolean bl=c1.containsAll(c2);      //�ж�c1�Ƿ����c2
        System.out.println(bl);
        System.out.println(c1);
    }

    private static void RemoveAllMethod() {
        Collection a=new ArrayList();
        a.add("M");
        a.add("a");
        a.add("i");

        Collection b=new ArrayList();
        b.add("M");
        b.add("a");

        boolean c=a.removeAll(b);           //ɾ�����ǽ���
        System.out.println(c);              //û�н�����ɾ��,false �еĻ�true
        System.out.println(a);
    }

    private static void addAllMethod() {        //addall����
        Collection cl1=new ArrayList();
        cl1.add("h");
        cl1.add("e");
        cl1.add("i");

        Collection cl2=new ArrayList();
        cl2.add("M");
        cl2.add("a");

        cl1.addAll(cl2);    //��cl2�е�ÿһ��Ԫ����ӵ�cl1��
        cl1.add(cl2);       //��cl2����һ��������ӵ�cl1��
        System.out.println(cl1);
    }
}
