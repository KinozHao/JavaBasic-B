package Set.Collection;

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
        //取交集,如果调用的集合改变就返回true,如果调用的集合不变就返回false
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

        boolean bl=c1.containsAll(c2);      //判断c1是否包含c2
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

        boolean c=a.removeAll(b);           //删除的是交集
        System.out.println(c);              //没有交集不删除,false 有的话true
        System.out.println(a);
    }

    private static void addAllMethod() {        //addall方法
        Collection cl1=new ArrayList();
        cl1.add("h");
        cl1.add("e");
        cl1.add("i");

        Collection cl2=new ArrayList();
        cl2.add("M");
        cl2.add("a");

        cl1.addAll(cl2);    //把cl2中的每一个元素添加到cl1中
        cl1.add(cl2);       //把cl2看成一个对象添加到cl1中
        System.out.println(cl1);
    }
}
