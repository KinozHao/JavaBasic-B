package c_map;
import org.junit.Test;
import z_tools.CollectionNote;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.*;
@CollectionNote("����Map������ʵ��")
public class MapTravers {
    @Test
    public void TraversAllValues(){
        HashMap map = new HashMap();
        map.put("����",41);
        map.put("����",32);
        map.put("ɽ��",34);
        map.put("�㽭",33);
        //1.values������ȡ����value����
        //2.ͨ��Collection�����ַ�
        //3.����collection1�������б���
        Collection mapV = map.values();
        for (Object obj : mapV) {
            System.out.println(obj);
        }
    }
    @Test
    public void TraversAllKeys(){
        HashMap map = new HashMap();
        map.put("����",41);
        map.put("����",32);
        map.put("ɽ��",34);
        map.put("�㽭",33);
        Set set = map.keySet();
        for(Object obj:set){
            System.out.println(obj);
        }
    }
    //��ֵ��ͬʱ���������ַ���
    @Test
    public void GetMethod(){
        //1.����Map����
        Map<String,Integer> datas = new HashMap<>();
        datas.put("Po",13);
        datas.put("Lo",14);
        datas.put("Ho",15);
        Set<String> keySet = datas.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            //keyֵ
            Object key = iterator.next();
            //ͨ��key��ȡvalue
            Object value = datas.get(key);
            System.out.println(key+"-->"+value);
        }
    }

    @Test
    public void EntrySet(){
        Map<String,Integer> in=new HashMap<>();
        in.put("����",23);
        in.put("����",24);
        in.put("����",25);
        Set<Map.Entry<String, Integer>> entries = in.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            Map.Entry mey = next;
            System.out.println(mey.getKey()+"->"+mey.getValue());
        }
        //����һ����ʱ���� ����ΪEntry����   entrySet���Ԫ��
        for (Map.Entry<String,Integer> uc :in.entrySet()){
            System.out.println(uc.getKey()+"="+uc.getValue());
        }
    }
}
