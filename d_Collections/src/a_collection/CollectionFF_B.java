package a_collection;

import org.junit.Test;
import z_tools.CollectionNote;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@CollectionNote("带All的方法具体使用")
public class CollectionFF_B {
    @Test
    public void addAllMethod() {
        Collection cl1=new ArrayList();
        cl1.add("h");
        cl1.add("e");
        cl1.add("i");

        Collection cl2 = new ArrayList();
        cl2.add("M");
        cl2.add("a");

        cl1.addAll(cl2);    //把cl2中的每一个元素添加到cl1中
        cl1.add(cl2);       //把cl2看成一个对象添加到cl1中
        System.out.println(cl1);
    }
    @Test
    public void RemoveAllMethod() {
        Collection a=new ArrayList();
        a.add("M");
        a.add("a");
        a.add("i");

        Collection b=new ArrayList();
        b.add("M");
        b.add("a");
        //相当于把差集删除
        boolean c = a.removeAll(b);
        System.out.println(c);
        System.out.println(a);
    }

    @Test
    public void ContainsAllMethod() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("d");
        c1.add("b");
        //通过asList做一个临时列表,多态体现
        Collection c2 = Arrays.asList("a","b");

        boolean bl = c1.containsAll(c2);      //判断c1是否包含c2
        System.out.println(bl);
        System.out.println(c1);
    }
    @Test
    public void RetainAllMethod() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("d");
        c1.add("b");
        Collection c2 = Arrays.asList("a","b");
        //取交集,最终的结果赋给了c1
        boolean bl = c1.retainAll(c2);
        System.out.println(bl);
        System.out.println(c1);

        //链式写法
        System.out.println(Arrays.asList("a","c").equals(c2));
        System.out.println(c1.hashCode());
    }
}
