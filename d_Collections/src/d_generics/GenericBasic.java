package d_generics;

import org.junit.Test;

import java.lang.invoke.VarHandle;
import java.util.*;

/** @apiNote
 * ��һ������ֻ�洢һ���������͵�����
 * Generic��һ�ֹ淶
 * */
public class GenericBasic {
    @Test
    public void CollectionGeneric() {
        //ָ�����͵����ͣ�����������Ͳ���ȫ����
        Vector<String> vector = new Vector();
        vector.add("����ʥ��");
        vector.add("��ϢѧԺ");
        vector.add("��еѧԺ");
        //��֤���ݰ�ȫ
        //vector.add(123);
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            String datas = iterator.next();
            System.out.println(datas);
        }
    }
    @Test
    public void MapGeneric(){
        HashMap<String, Integer> datas = new HashMap<>();
        datas.put("ƻ��",29);
        datas.put("����",21);
        datas.put("��צ",51);
        Set<Map.Entry<String, Integer>> set = datas.entrySet();
        //���͵�Ƕ�ף�EntryΪMap�ӿڵ��ڲ��ӿ�
        Iterator<Map.Entry<String, Integer>> ddq = set.iterator();
        while (ddq.hasNext()){
            Map.Entry<String, Integer> e = ddq.next();
            //����Entry�ӿ��еķ���
            Integer value = e.getValue();
            String key = e.getKey();
            System.out.println(key+"-->"+value);
        }
    }
}
