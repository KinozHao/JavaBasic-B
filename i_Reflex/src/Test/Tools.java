package Test;

import java.lang.reflect.Field;

public class Tools {
    public void setProperty(Object obj, String propertyName, Object value) throws Exception{
        Class clz = obj.getClass();             //获取字节码对象
        Field f = clz.getDeclaredField(propertyName);   //暴力反射获取字段
        f.setAccessible(true);      //去除私有
        f.set(obj,value);
    }
}
