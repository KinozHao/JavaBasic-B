package c_map;
import org.junit.Test;
import z_tools.CollectionNote;

import java.util.*;
@CollectionNote("��ֵ��ͬʱ���������ַ���")
public class MapTraversA {
    @Test
    @CollectionNote("ʹ��key��ȡvalue�ķ�ʽ")
    public void ObjectMethod(){
        //1.����Map����
        Map<String,Integer> data = new HashMap<>();
        data.put("Po",13);
        data.put("Lo",14);
        data.put("Ho",15);
        Set<String> sets = data.keySet();
        Iterator<String> iterator = sets.iterator();

        while (iterator.hasNext()){
            //keyֵ
            Object key = iterator.next();
            //ͨ��key��ȡvalue
            Object value = data.get(key);
            System.out.println(key+"-->"+value);
        }
    }

    @Test
    @CollectionNote("ʹ��EntrySet����")
    public void EntrySet(){
        Map<String,Integer> in = new HashMap<>();
        in.put("����",23);
        in.put("����",24);
        in.put("����",25);
        //1.ͨ��entrySet��ȡһ��Set���͵ı���
        Set<Map.Entry<String, Integer>> entries = in.entrySet();
        //2.���õ�����
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            //3.��iteratorת��ΪEntry����
            Map.Entry<String, Integer> keyvalue = iterator.next();
            //4.����Entry�з��������key_value�ı���
            System.out.println(keyvalue.getKey()+"->"+keyvalue.getValue());
        }
    }
    @Test
    @CollectionNote("ʹ����ǿfor����")
    public void ForeachMethod(){
        Map<String,Integer> in = new HashMap<>();
        in.put("����",23);
        in.put("����",24);
        in.put("����",25);
        //foreach����Map���ݱ����÷���ָ��������
        for (Map.Entry<String,Integer> Entry :in.entrySet()){
            System.out.println(Entry.getKey()+"="+Entry.getValue());
        }
    }
}
