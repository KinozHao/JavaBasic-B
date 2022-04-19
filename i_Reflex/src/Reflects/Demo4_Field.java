package Reflects;
//反射获取成员变量并使用

import Bean.Person;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo4_Field {
    public static void main(String[] args) throws Exception {
        Class clz =Class.forName("Bean.Person");    //获取字节码文件

        Constructor cso = clz.getConstructor(String.class,int.class);   //获取有参构造
        Person per = (Person) cso.newInstance("Kinoz",18);      //通过有参构造创建对象

//        Field f1 = clz.getField("name");            普通的反射 如果参数私有就没办法访问
        Field f2 = clz.getDeclaredField("name");    //暴力反射获取字段
        f2.setAccessible(true);                           //去除私有权限
        f2.set(per,"Jack");                               //set里面第一个为person对象名称 第二个修改的参数
        System.out.println(per);                          //输出person对象修改过后的结果
    }
}
