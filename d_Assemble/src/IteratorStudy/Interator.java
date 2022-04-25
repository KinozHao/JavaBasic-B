package IteratorStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//迭代器
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

        //获取选代器
        Iterator in2 = b.iterator();
        while (in2.hasNext()){          //判断集合中是否有元素,有就返回true
            StudentParam s=(StudentParam)in2.next();
            System.out.println("Name:"+s.name+"Age:"+s.age);
            //System.out.println(in2.next()); 每次返回选代中的下一个元素
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
