package c_map;

import b_set.set_test.MyDate;
import org.junit.Test;

import java.util.*;

/**
 * @apiNote key必须为同一个类创建的对象
 * 分为自然排序和定制排序
 */


public class TreeMapBasic {
    @Test
    //自然排序
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
    //定制排序[按照年龄进行排序]
    //已经使用泛型确定了数据类型 无需再用类型转换和强转
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
