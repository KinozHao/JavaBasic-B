package re_basic;

import org.junit.Test;

import java.io.Serializable;
import java.util.Random;

/**
 * @author kinoz
 * @Date 2022/6/18 - 15:10
 * @apiNote ����Ķ�̬�����
 */
public class Dynamism<T> implements Serializable {
    @Test
    public void DyTest() throws Exception {
        for (int i = 0 ;i<100;i++) {
            //��ȡ0-2�����
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
            //��ʱ������Ķ����ǲ�ȷ����(ͨ����̬�ԾͿ��ԺܺõĽ���������)
            Object obj = getInstance(locate);
            System.out.println(obj);
        }
    }
    //ָ��һ�������ʵ��ʹ�÷��䴴��
    public Object getInstance(String classpath) throws Exception{
        Class<?> cls = Class.forName(classpath);
        return cls.newInstance();
    }
}
