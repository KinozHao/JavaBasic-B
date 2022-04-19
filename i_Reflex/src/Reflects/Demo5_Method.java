package Reflects;
//通过反射获取方法并使用

import Bean.Person;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo5_Method {
    public static void main(String[] args) throws Exception{
        Class clz =Class.forName("Bean.Person");

        Constructor cons =  clz.getConstructor(String.class,int.class);

        Person p = (Person) cons.newInstance("我",17);

        Method m = clz.getMethod("doing");      //获取doing方法     这个为无参方法
        m.invoke(p);

        Method m2 = clz.getMethod("doing",int.class);   //获取有参的doing方法 这个为有参方法
        m2.invoke(p,6);
    }
}
