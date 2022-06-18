import org.junit.Test;
import re_basic.ReData;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
* @author kinoz
* @apiNote 反射的基本使用
* */
public class ReflexBasic {
    @Test
    public void ReflexTest() throws Exception {
        Class<ReData> file = ReData.class;
        //1，通过反射创建ReData对象
        Constructor<ReData> gzq = file.getConstructor(String.class, int.class);
        ReData data = gzq.newInstance("Harry", 28);
        System.out.println(data);

        //2.调用指定的属性，方法
        Field age = file.getDeclaredField("age");//调用私有构造器
        //设置为true时，可调用私有的类的成员
        age.setAccessible(true);
        age.set(data,10);
        System.out.println(data);

        Method info = file.getDeclaredMethod("info");
        info.invoke(data);

        //3.通过反射调用私有方法
        Method secretInfo = file.getDeclaredMethod("secretInfo", String.class);
        secretInfo.setAccessible(true);
        secretInfo.invoke(data,"中国人,中国魂儿.");
    }
}
