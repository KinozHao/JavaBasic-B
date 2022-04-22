package CollectionStudy;

import IteratorStudy.StudentParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionMethod {
    public static void main(String[] args) {
        ADDmethod();
        Collection s =new ArrayList();
        s.add("h");
        s.add("e");
        s.add("r");
        s.remove("h");          //删除其中指定字符
        s.clear();                  //清空全部
        System.out.println(s.contains("r"));    //判断是否包含
        System.out.println(s.isEmpty());        //判断是否为空字符串
        System.out.println(s.size());           //判断字符长度
        System.out.println(s);                  //打印
    }

    private static void ADDmethod() {
        //Set s=new Set();    错误写法
        //ArrayList父类的父类中重写了toString方法,所以在打印对象的引用时候,输出的不是object类中的toString结果

        Collection s=new ArrayList();        //父类引用指向子类对象
        boolean b1=s.add("hello world");    //编译左边运行右边
        boolean b2=s.add(true);
        boolean b3=s.add(100);
        boolean b4=s.add(100);
        boolean b5=s.add(new StudentParam("高非凡",17));
        System.out.println(b4);             //b4和b3的打印结果都为true
        System.out.println(b3);             //ArrayList集合允许存储重复
        for (int i = 0; i < s.size(); i++) {
            System.out.print("集合遍历"+((ArrayList) s).get(i)+" ");
        }
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        Collection k=new HashSet();         //父类引用指向子类对象
        boolean n1=k.add("h1z1");           //HashSet集合则不允许存储重复
        boolean n2=k.add("h1z1");
        System.out.println(n1);
        System.out.println(n2);
    }
}
