package re_get;

import org.junit.Test;
import re_basic.ReData;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


/**
 * @author kinoz
 * @Date 2022/6/18 - 16:18
 * @apiNote ��ȡ�Զ�������������Խṹ
 * @see ReData
 */
public class FieldGet {
    @Test
    public void allFiled(){
        //��ȡ���Խṹ ��ǰ����ʱ��͸���publicȨ�޵�����
        Class<ReData> dt = ReData.class;
        Field[] fields = dt.getFields();
        for (Field f : fields){
            System.out.println(f);
        }
        System.out.println("----------------------");
        //��ǰ����ʱ�����������(��������������������)
        Field[] dfs = dt.getDeclaredFields();
        for (Field f1 : dfs){
            System.out.println(f1);
        }
    }

    @Test
    public void separate() {
        //�ֱ��ȡָ���ĵ����ṹ��
        Class dt = ReData.class;
        Field[] dfs = dt.getDeclaredFields();

        for (Field f1 : dfs){
            //1.Ȩ�����η�
            int modifier = f1.getModifiers();
            //ͨ��Modifier�����ֵת��Ϊ���η�����ĸ
            System.out.print(Modifier.toString(modifier)+"\t");

            //2.��������
            Class<?> type = f1.getType();
            System.out.print(type+"\t");

            //3.������
            String name = f1.getName();
            System.out.print(name);
            System.out.println();
        }
    }
}
