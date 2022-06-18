package re_get;

import org.junit.Test;
import re_basic.ReData;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author kinoz
 * @Date 2022/6/18 - 17:22
 * @apiNote 通过反射对其他类的成员的获取
 */
public class OtherGet {
    @Test
    public void ConsTest(){
        Class clz = ReData.class;
        //获取运行时类所有public构造器(不包括父类)
        Constructor[] cons = clz.getConstructors();
        for (Constructor constructor : cons){
            System.out.println(constructor);
        }

        //获取运行时类所有权限构造器(不包括父类)
        Constructor[] dcs = clz.getDeclaredConstructors();
        for (Constructor constructor1 : dcs){
            System.out.println(constructor1);
        }
    }
    @Test
    public void SuperClassTest(){
        //1.获取运行时类的父类
        //不带泛型
        Class clz = ReData.class;
        Class scs = clz.getSuperclass();
        System.out.println(scs);
        //带泛型
        Type gsc = clz.getGenericSuperclass();
        System.out.println(gsc);

        //2.获取运行时类带泛型的父类的泛型
        // TODO: 2022/6/18 这个是泛型的重点，使用较为频繁 
        ParameterizedType paramType = (ParameterizedType)gsc;
        Type[] type = paramType.getActualTypeArguments();
        System.out.println(type[0].getTypeName());
        //对type强转为Class类型 调用getName方法
        System.out.println(((Class)type[0]).getName());
    }
    @Test
    // TODO: 2022/6/18 重点二 动态代理会使用 
    public void InterfaceTest() throws Exception{
        //1.获取运行时类的接口
        Class clz = Class.forName("re_basic.ReData");
        Class[] interfaces = clz.getInterfaces();
        System.out.println(interfaces[0].getName());

        Type[] gifs = clz.getGenericInterfaces();
        System.out.println(gifs[0].getTypeName());

        //2.获取运行时类父类实现的接口
        Class[] fathers = clz.getSuperclass().getInterfaces();
        for (Class c : fathers){
            System.out.println(c);
        }
    }

    @Test
    public void pk_anon() throws Exception{
        //获取包
        Class clz = Class.forName("re_basic.ReData");
        Package pk = clz.getPackage();
        System.out.println(pk);

        //获取注解
        // TODO: 2022/6/18 frame is: Annotation+Reflex+DesignPattern 
        Annotation[] anon = clz.getAnnotations();
        for (Annotation an : anon){
            System.out.println(an);
        }
    }

}
