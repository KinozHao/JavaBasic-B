package re_test;

import java.lang.reflect.Method;
import java.util.ArrayList;
//在一个带有integer泛型的集合中添加一个字符串元素 用反射实现
public class ArrayTest {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println("添加前"+list);
        //获取ArrayList的字节码对象
        Class clz = Class.forName("java.util.ArrayList");

        //反射获取add()
        Method m = clz.getMethod("add",Object.class);

        //添加字符串进去
        m.invoke(list,"这是个字符串");

        System.out.println("添加后"+list);
    }
}
