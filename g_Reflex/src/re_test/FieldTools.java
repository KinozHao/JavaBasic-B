package re_test;

import java.lang.reflect.Field;
//一个可以更改类属性的暴力反射方法
public class FieldTools {
    public void setField(Object obj, String Field, Object value) throws Exception{
        //获取字节码对象
        Class clz = obj.getClass();
        //暴力反射获取字段
        Field f = clz.getDeclaredField(Field);
        //去除私有
        f.setAccessible(true);
        f.set(obj,value);
    }
}
