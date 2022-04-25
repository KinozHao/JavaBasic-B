package IteratorStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//������
public class Interator {
    public static void main(String[] args) {
        Demo1();
        Demo2();

    }

    private static void Demo2() {
        Collection b= new ArrayList();
        b.add(new StudentParam("Luny",18));
        b.add(new StudentParam("Jecy",5));
        b.add(new StudentParam("Frank",23));

        //��ȡѡ����
        Iterator in2 = b.iterator();
        while (in2.hasNext()){          //�жϼ������Ƿ���Ԫ��,�оͷ���true
            StudentParam s=(StudentParam)in2.next();
            System.out.println("Name:"+s.name+"Age:"+s.age);
            //System.out.println(in2.next()); ÿ�η���ѡ���е���һ��Ԫ��
        }
    }

    private static void Demo1() {
        Collection a=new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");

        Iterator in=a.iterator();
        while (in.hasNext()){
            System.out.println(in.next());
        }
    }
}
