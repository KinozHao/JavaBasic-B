package re_get;

import org.junit.Test;
import re_basic.ReData;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author kinoz
 * @Date 2022/6/18 - 16:30
 * @apiNote 获取自定义类的所有方法
 */
public class MethodGet {
    @Test
    public void methodTest(){
        //可获取运行时类及父类的public方法
        Class ct = ReData.class;
        Method[] methods = ct.getMethods();
        for (Method m : methods){
            System.out.println(m);
        }

        System.out.println("--------------------------");

        //获取运行时类所有权限的方法(不包括父类)
        Method[] methods1 = ct.getDeclaredMethods();
        for (Method m1 : methods1){
            System.out.println(m1);
        }
    }

    @Test
    public void methodTestII(){
        Class ct = ReData.class;
        Method[] md = ct.getDeclaredMethods();
        for (Method m : md){
            //1.获取方法声明的所有注解
            Annotation[] ans = ct.getAnnotations();
            for (Annotation a : ans){
                System.out.println(a);
            }

            //2.权限修饰符
            System.out.print(Modifier.toString(m.getModifiers())+"\t");

            //3.返回值类型
            System.out.print(m.getReturnType().getName()+"\t");

            //4.方法名
            System.out.print(m.getName());
            System.out.print("(");

            //5.形参列表
            Class<?>[] pts = m.getParameterTypes();
            //if (!(pts == null && pts.length == 0)){
            if (pts.length > 0){
                for (int i = 0; i < pts.length; i++) {
                    if (i == pts.length-1){
                        System.out.print(pts[i].getName()+" args_"+i);
                        break;
                    }
                    System.out.print(pts[i].getName()+" args_"+i+",");
                }
            }
            System.out.print(")");

            //6.异常
            Class<?>[] ets = m.getExceptionTypes();
            if (ets.length > 0){
                System.out.print("throws ");
                for (int i = 0; i < ets.length; i++) {
                    if (i == ets.length - 1){
                        System.out.print(ets[i].getName());
                        break;
                    }
                    System.out.print(ets[i].getName()+",");
                }
            }

            System.out.println();
        }
    }

}
