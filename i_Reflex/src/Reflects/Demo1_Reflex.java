package Reflects;

import Bean.Person;
//通过三种方式获取字节码对象
public class Demo1_Reflex {
    public static void main(String[] args) throws ClassNotFoundException {
        //源文件阶段创建   读取配置文件
        Class c1 = Class.forName("Bean.Person");
        //字节码阶段创建   当作静态方法的锁对象
        Class c2 = Person.class;

        //创建对象    判断是否是同一个字节码对象
        Person p = new Person();
        Class c3 = p.getClass();

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
    }
}
