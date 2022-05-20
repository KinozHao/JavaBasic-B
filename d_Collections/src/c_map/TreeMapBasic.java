package c_map;

import java.util.Comparator;
import java.util.TreeMap;
//TreeMap集合键是Student值是String的一个案例

public class TreeMapBasic {
    public static void main(String[] args) {
        Object();
        Key();
    }

    private static void Key() {
        //比较键
        TreeMap<MapData,String> tm=new TreeMap<>(new Comparator<MapData>() {
            @Override
            public int compare(MapData s1, MapData s2) {
                int num=s1.getName().compareTo(s2.getName());
                return num == 0 ? s1.getAge() - s2.getAge() : num;
            }
        });
        tm.put(new MapData("Aniy",20),"Chicago");
        tm.put(new MapData("Fiki",30),"Las Veges");
        tm.put(new MapData("Nani",70),"Matins City");
    }

    private static void Object() {  //按照对象进行排序
        TreeMap<MapData,String> tm=new TreeMap<>();
        tm.put(new MapData("Aniy",20),"Chicago");
        tm.put(new MapData("Fiki",30),"Las Veges");
        tm.put(new MapData("Nani",70),"Matins City");
        System.out.println(tm);
    }
}
