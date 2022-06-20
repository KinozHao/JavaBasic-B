package re_get;

import org.junit.Test;
import re_basic.ReData;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * @author kinoz
 * @Date 2022/6/19 - 14:34
 * @apiNote 调用运行时类中指定的属性.方法.构造器
 */
public class Transfer {
    @Test
    // TODO: 2022/6/19 如何操作运行时类指定属性 重点
    public void TraTest() throws Exception{
        //1.获取class字节码文件
        Class<ReData> reds = ReData.class;
        //2.创建运行时类对象
        ReData reData = reds.newInstance();

        //3.获取属性,设置访问权限为true
        Field name = reds.getDeclaredField("name");
        name.setAccessible(true);

        //4.给运行时类属性赋值
        name.set(reData,"小惠");
        //5.获取值并输出
        Object obj = name.get(reData);
        System.out.println(obj);
    }

    @Test
    public void MethodTest() throws Exception{
        Class clz = ReData.class;
        Object o = clz.newInstance();
        //非static的调用
        Method secretInfo = clz.getDeclaredMethod("secretInfo", String.class);
        secretInfo.setAccessible(true);
        Object returnValue = secretInfo.invoke(o, "我是非静态方法,这是具体实参");
        System.out.println(returnValue);

        System.out.println("------------------------");

        //static的调用
        Method anotherMethod = clz.getDeclaredMethod("anotherMethod");
        anotherMethod.setAccessible(true);
        //如果运行时类中的方法没有返回值，则此invoke()返回null
        //Object retureValue2 = anotherMethod.invoke(ReData.class);
        Object retureValue2 = anotherMethod.invoke(null);
        System.out.println(retureValue2);
    }
    @Test
    public void ConstructorTest() throws Exception{
        //1.获取class字节码文件
        Class<?> clz = Class.forName("re_basic.ReData");

        //2.获取指定构造器
        Constructor<?> cons = clz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);

        //3.用指定构造器创建对象
        //强转为ReData类型
        ReData reData = (ReData)cons.newInstance("Harry", 28);
        System.out.println(reData);
    }
}
