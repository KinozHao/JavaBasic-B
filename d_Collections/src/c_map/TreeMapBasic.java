package c_map;

import b_set.set_test.MyDate;
import org.junit.Test;

import java.util.*;

/**
 * @apiNote key����Ϊͬһ���ഴ���Ķ���
 * ��Ϊ��Ȼ����Ͷ�������
 */


public class TreeMapBasic {
    @Test
    //��Ȼ����
    public void ComparableMethod() {
        TreeMap<MapData,String> tree=new TreeMap<>();
        tree.put(new MapData("cniy",20),"Chicago");
        tree.put(new MapData("aiki",30),"Las Veges");
        tree.put(new MapData("dani",70),"Matins City");

        //travers map
        Set<MapData> mapData = tree.keySet();
        Iterator<MapData> iterator = mapData.iterator();
        while (iterator.hasNext()){
            MapData key = iterator.next();
            String value = tree.get(key);
            System.out.println(key+"->"+value);
        }

    }
    @Test
    //��������[���������������]
    //�Ѿ�ʹ�÷���ȷ������������ ������������ת����ǿת
    public void ComparatorMethod() {
        Comparator<MapData> cumBJ = new Comparator<>() {
            @Override
            public int compare(MapData s1, MapData s2) {
                return Integer.compare(s1.getAge(),s2.getAge());
                /*int num=s1.getName().compareTo(s2.getName());
                return num == 0 ? s1.getAge() - s2.getAge() : num;*/
            }
        };
        TreeMap<MapData,String> tree = new TreeMap<>(cumBJ);
        tree.put(new MapData("Aniy",20),"Chicago");
        tree.put(new MapData("Fiki",30),"Las Veges");
        tree.put(new MapData("Bani",10),"Matins City");

        //travers map us entrySet
        Set<Map.Entry<MapData, String>> entries = tree.entrySet();
        Iterator<Map.Entry<MapData, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<MapData, String> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }
    }
}
