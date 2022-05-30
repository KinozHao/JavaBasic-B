package d_generics;

import d_generics.generic_test.Datas;
import d_generics.generic_test.wcData;
import org.junit.Test;

import java.util.*;

/**
 * @author kinoz
 * @Date 2022/5/29 - 9:30
 * @apiNote ͨ���"?"ʹ��
 */
public class WildCard {
    //1.���͵ļ̳�
    @Test
    public void Generic_Extend(){
        //����Ϊ���й�ϵ
        List<String> l1 = null;
        List<Integer> l2 = null;
        //�̳й�ϵ
        Map<String,Double> m1 = null;
        HashMap<String,Double> m2 = null;

    }
    //2.������ͨ�����ʹ��
    @Test
    public void WildCard_Us() {
        List<String> l1 = null;
        List<Integer> l2 = new LinkedList<>();
        l2.add(13);
        l2.add(199);
        //"?"������
        List<?> all = null;
        all = l2;
        //���(д��) ֻ��nullֵ
        /*all.add(134);
        all.add("abc");*/
        all.add(null);

        //��ȡ(��ȡ) �����ȡ����ȡ������ΪObject
        Object object = all.get(1);
        System.out.println(object);
    }
    //3.ͨ����ڱ����ϵ�����
    public void show(List<?> l1){
        Iterator<?> iterator = l1.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
    @Test
    //4.����ͨ�������
    public void WildCardII_Us(){
        //extends�������Ϊ"<="
        //super�������Ϊ">="
        List<? extends Datas> l1 = null;
        List<? super Datas > l2 = null;

        List<wcData> t1 = new ArrayList<>();
        List<Datas> t2 = new ArrayList<>();
        List<Object> t3 = new ArrayList<>();

        l1 = t1;
        l1 = t2;
        //l1 = t3;

        //l2 = t1;
        l2 = t2;
        l2 = t3;

        //��ȡ���� ?entends����
        l1 = t1;
        Datas datas = l1.get(0);
        //���Ͳ���С��Datas,��������쳣
        //wcData wcd = l1.get(0);
        System.out.println(datas);

        //��ȡ���� ?super����
        l2 = t2;
        //�������Datas�󣬷�������쳣
        //Datas dts = l2.get(0);
        Object object = l2.get(0);
        System.out.println(object);

        //д������:
        //�����쳣
        //l1.add(new wcData());
        //��������[? super]���Ͳ��ܴ���Datas
        l2.add(new Datas());
        l2.add(new wcData());

    }
}
