import org.junit.Test;
import re_basic.ReData;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
* @author kinoz
* @apiNote ����Ļ���ʹ��
* */
public class ReflexBasic {
    @Test
    public void ReflexTest() throws Exception {
        Class<ReData> file = ReData.class;
        //1��ͨ�����䴴��ReData����
        Constructor<ReData> gzq = file.getConstructor(String.class, int.class);
        ReData data = gzq.newInstance("Harry", 28);
        System.out.println(data);

        //2.����ָ�������ԣ�����
        Field age = file.getDeclaredField("age");//����˽�й�����
        //����Ϊtrueʱ���ɵ���˽�е���ĳ�Ա
        age.setAccessible(true);
        age.set(data,10);
        System.out.println(data);

        Method info = file.getDeclaredMethod("info");
        info.invoke(data);

        //3.ͨ���������˽�з���
        Method secretInfo = file.getDeclaredMethod("secretInfo", String.class);
        secretInfo.setAccessible(true);
        secretInfo.invoke(data,"�й���,�й����.");
    }
}
