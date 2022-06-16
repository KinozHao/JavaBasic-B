package Reflects;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
* @apiNote 反射的基本使用
* */
public class ReflexBasic {
    @Test
    public void ReflexTest() throws Exception {
        //获取指定对象赋给Class类
        Class file = ReData.class;
        //1，通过反射创建ReData对象
        Constructor gzq = file.getConstructor(String.class, int.class);
        Object obj = gzq.newInstance("Haryy", 28);
        ReData rfd = (ReData)obj;
        System.out.println(rfd);

        //2.调用指定的属性，方法
        Field age = file.getDeclaredField("age");//调用私有构造器
        //设置为true时，可调用私有的类的成员
        age.setAccessible(true);
        age.set(rfd,10);
        System.out.println(rfd);

        Method info = file.getDeclaredMethod("info");
        info.invoke(rfd);

        //3.通过反射调用私有方法
        Method secretInfo = file.getDeclaredMethod("secretInfo", String.class);
        secretInfo.setAccessible(true);
        secretInfo.invoke(rfd,"中国人中国魂儿.");
    }
}
