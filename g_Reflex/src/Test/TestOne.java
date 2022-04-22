package Test;
//在一个带有integer泛型的集合中添加一个字符串元素 用反射实现
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestOne {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ay =new ArrayList<>();       //定义一个数组
        ay.add(10);             //添加参数
        ay.add(20);

        System.out.println("Before:"+ay);
        Class clz = Class.forName("java.util.ArrayList");   //原文件创建 读取配置文件 获取字节码对象

        Method m = clz.getMethod("add",Object.class);       //获取add方法
        m.invoke(ay,"这是个字符串");                          //添加字符串进去

        System.out.println("After:"+ay);
    }
}
