package Test;

import java.lang.reflect.Field;

public class Tools {
    public void setProperty(Object obj, String propertyName, Object value) throws Exception{
        Class clz = obj.getClass();             //��ȡ�ֽ������
        Field f = clz.getDeclaredField(propertyName);   //���������ȡ�ֶ�
        f.setAccessible(true);      //ȥ��˽��
        f.set(obj,value);
    }
}
