package re_test;

import java.lang.reflect.Field;
//һ�����Ը��������Եı������䷽��
public class FieldTools {
    public void setField(Object obj, String Field, Object value) throws Exception{
        //��ȡ�ֽ������
        Class clz = obj.getClass();
        //���������ȡ�ֶ�
        Field f = clz.getDeclaredField(Field);
        //ȥ��˽��
        f.setAccessible(true);
        f.set(obj,value);
    }
}
