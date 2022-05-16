package a_collection;

import z_tools.CollectionNote;
import java.util.ArrayList;
import java.util.Collection;
//Collection接口实例类添加对象时，要求被添加对象所在类去重写equals()

@CollectionNote("Collection接口通用的方法")
public class CollectionFF_A {
    public static void main(String[] args) {
        SomeMethodA();
        System.out.println("*****************");
        AddMethod();
    }

    private static void SomeMethodA(){
        Collection s = new ArrayList();
        s.add("ho");
        s.add("oooo");
        s.add("ello");
        s.add(new StudentView("Tom",20));
        //删除其中指定字符
        s.remove("oooo");
        //判断是否包含
        System.out.println(s.contains(new StudentView("Tom",20)));
        //判断是否为空字符串
        System.out.println(s.isEmpty());
        //判断字符长度
        System.out.println(s.size());
        //输出集合所有元素
        System.out.println(s);
        //清空集合元素
        s.clear();
    }

    private static void AddMethod() {
        //多态体现:new对象需要使用实现类
        Collection s = new ArrayList();
        //不使用泛型的情况下，集合可以存放任意类型数据
        boolean b1 = s.add("hello world");
        boolean b2 = s.add(true);
        //体现了List的可重复性,同时体现自动装箱
        boolean b3 = s.add(100);
        boolean b4 = s.add(100);
        boolean b5 = s.add(new StudentView("高非凡",17));
        System.out.println(b4);
        System.out.println(b3);
        //输出集合所有元素
        System.out.println(s);
    }
}
