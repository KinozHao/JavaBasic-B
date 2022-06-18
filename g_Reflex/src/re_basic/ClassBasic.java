package re_basic;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/6/17 - 15:40
 * @apiNote Class类的使用与理解
 * 获取Class实例的四种方式
 */
public class ClassBasic {
    @Test
    public void classTest() throws ClassNotFoundException {
        //方式一 调用运行时类的属性.class
        Class c1 = ReData.class;
        System.out.println(c1);

        //方式二 通过运行时类对象，调用getClass()
        ReData reData = new ReData();
        Class<? extends ReData> c2 = reData.getClass();
        System.out.println(c2);

        //方式三 使用Class类的forName()
        Class<?> c3 = Class.forName("re_basic.ReData");
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

        //方式四 使用类的加载器
        ClassLoader cloader = ClassBasic.class.getClassLoader();
        Class<?> c4 = cloader.loadClass("re_basic.ReData");
        System.out.println("系统加载器"+cloader);
        System.out.println(c1 == c4);
    }
}
