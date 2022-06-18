package re_basic;

import org.junit.Test;

import java.io.Serializable;
import java.util.Random;

/**
 * @author kinoz
 * @Date 2022/6/18 - 15:10
 * @apiNote 反射的动态性理解
 */
public class Dynamism<T> implements Serializable {
    @Test
    public void DyTest() throws Exception {
        for (int i = 0 ;i<100;i++) {
            //获取0-2随机数
            int num = new Random().nextInt(3);
            String locate = "";
            switch (num){
                case 0:
                    locate ="java.util.Date";
                    break;
                case 1:
                    locate ="java.lang.Object";
                    break;
                case 2:
                    locate ="Test.Calculator";
                    break;
            }
            //此时我们造的对象是不确定的(通过动态性就可以很好的解决这个问题)
            Object obj = getInstance(locate);
            System.out.println(obj);
        }
    }
    //指定一个具体的实例使用反射创建
    public Object getInstance(String classpath) throws Exception{
        Class<?> cls = Class.forName(classpath);
        return cls.newInstance();
    }
}
