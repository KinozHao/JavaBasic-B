package Reflects;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
* @apiNote ����Ļ���ʹ��
* */
public class ReflexBasic {
    @Test
    public void ReflexTest() throws Exception {
        //��ȡָ�����󸳸�Class��
        Class file = ReData.class;
        //1��ͨ�����䴴��ReData����
        Constructor gzq = file.getConstructor(String.class, int.class);
        Object obj = gzq.newInstance("Haryy", 28);
        ReData rfd = (ReData)obj;
        System.out.println(rfd);

        //2.����ָ�������ԣ�����
        Field age = file.getDeclaredField("age");//����˽�й�����
        //����Ϊtrueʱ���ɵ���˽�е���ĳ�Ա
        age.setAccessible(true);
        age.set(rfd,10);
        System.out.println(rfd);

        Method info = file.getDeclaredMethod("info");
        info.invoke(rfd);

        //3.ͨ���������˽�з���
        Method secretInfo = file.getDeclaredMethod("secretInfo", String.class);
        secretInfo.setAccessible(true);
        secretInfo.invoke(rfd,"�й����й����.");
    }
}
