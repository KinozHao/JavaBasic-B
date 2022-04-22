package Reflects;
//反射获取带参构造方法并使用
import Bean.Person;
import java.lang.reflect.Constructor;

public class Demo3_Constructor {
    public static void main(String[] args) throws Exception {
       Class clz =Class.forName("Bean.Person");
        //Method ONE
        /*Person p =(Person) clz.newInstance();                        //通过无参构造创建对象
        System.out.println(p);*/
        //Method TWO
        Constructor cso =clz.getConstructor(String.class,int.class);    //获取有参构造
        Person p = (Person) cso.newInstance("任深",18);           //通过有参构W造创建对象
        System.out.println(p);
    }
}
